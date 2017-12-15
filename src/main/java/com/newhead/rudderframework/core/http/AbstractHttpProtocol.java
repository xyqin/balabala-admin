package com.newhead.rudderframework.core.http;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 远程呼叫协议基础实现
 */
public abstract class AbstractHttpProtocol<T>  {
    final static Logger logger = LoggerFactory.getLogger(AbstractHttpProtocol.class);

    private HttpContext context;

    private HttpMethod defaultHttpMethod = HttpMethod.GET;

    /**
     * 采用无状态模式设计,构造时传入机器人运行上下文环境对象。
     *
     * @param context 机器人运行的上下文环境对象,
     */
    public AbstractHttpProtocol(HttpContext context) {
        this.context = context;
    }


    public HttpContext getContext() {
        return context;
    }

    /**
     * 远程请求的访问URL子类必须实现
     *
     * @return
     */
    public abstract String getUrl();

    /**
     * 请求头
     *
     * @return
     */
    public List<NameValuePair> getHttpHead() {
        return null;
    }

    /**
     * 请求方法
     *
     * @return
     */
    public HttpMethod getHttpMethod() {
        return defaultHttpMethod;
    }

    /**
     * 请求参数信息,子类如有URL参数传递要求需要实现该方法
     *
     * @return
     */
    public List<NameValuePair> getHttpParams() {
        return null;
    }

    /**
     * 在POST请求方法用于实体传参,子类如有参数传递要求需要实现该方法
     *
     * @return
     */
    public String getHttpBody() {
        return null;
    }


    /**
     * 缺省的消息头,子类如果有自定义需求,需要覆盖此方法
     *
     * @return
     */

    private List<NameValuePair> getDefaultHttpHead() {
        List<NameValuePair> heads = new ArrayList<NameValuePair>();
        heads.add(new BasicNameValuePair("Connection", "keep-alive"));
        heads.add(new BasicNameValuePair("Content-Type","application/x-www-form-urlencoded"));
        //heads.add(new BasicNameValuePair("Accept","application/json, text/plain, */*"));
        //heads.add(new BasicNameValuePair("User-Agent",""));
        //heads.add(new BasicNameValuePair("Referer","https://wx.qq.com/?&lang=zh_CN"));
        heads.add(new BasicNameValuePair("Accept-Encoding", "gzip, deflate, sdch, br"));
        heads.add(new BasicNameValuePair("Accept-Language", "zh-CN,zh;q=0.8"));
        String cookies = this.context.getCookie();
        if (cookies != null) {
            heads.add(new BasicNameValuePair("Cookie", cookies));
        }
        return heads;
    }

    /**
     * 远程方法
     *
     * @return
     */
    public ResponseObj go() throws Exception {
        CloseableHttpResponse response = null;
        String result = "";
        try {
            if (getHttpMethod() == HttpMethod.GET) response = Get();
            else response = Post();
            InputStream in = response.getEntity().getContent();
            result = IOUtils.toString(in);
            in.close();

            Header[] he = response.getAllHeaders();
            StringBuilder stringBuilder = new StringBuilder();
            for (Header header : he) {
                if (header.getName().equals("Set-Cookie")) {
                    String valuestr = header.getValue();
                    String[] vs = valuestr.split(";");
                    stringBuilder.append(vs[0]);
                    stringBuilder.append(";");
                }
            }
            if (stringBuilder.toString().length() > 0) {
                this.context.setCookie(stringBuilder.toString().substring(0, stringBuilder.toString().length() - 1));
            }
            ResponseObj responseObj = new ResponseObj(result);
            return responseObj;
        } catch (UnsupportedOperationException e) {
            logger.error(e.getMessage(), e);
            throw new Exception(e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
            throw new Exception(e);
        } catch (URISyntaxException e) {
            logger.error(e.getMessage(), e);
            throw new Exception(e);
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    logger.error(e.getMessage(), e);
                    throw new Exception(e);
                }
            }
        }
    }

    /**
     * GET方法请求
     */
    private CloseableHttpResponse Get() throws Exception, IOException, URISyntaxException {
        CloseableHttpClient httpClient = HttpConnectionManager.getInstance().getHttpClient();

        // 设置参数
        HttpGet httpget = new HttpGet(getUrl());
        List<NameValuePair> params = getHttpParams();
        if (params != null) {
            StringBuffer sbf = new StringBuffer();
            boolean first = true;
            for (NameValuePair pair : params) {
                if (first) {
                    sbf.append("?");
                } else {
                    sbf.append("&");
                }
                sbf.append(pair.getName());
                sbf.append("=");
                sbf.append(pair.getValue());
                first = false;
            }
            httpget.setURI(new URI(httpget.getURI().toString() + sbf.toString()));

        }

        //设置消息头Heads
        List<NameValuePair> heads = getHttpHead();
        List<NameValuePair> defaultedHeads = getDefaultHttpHead();
        if (heads != null) defaultedHeads.addAll(heads);
        for (NameValuePair nameValuePair : defaultedHeads) {
            httpget.addHeader(nameValuePair.getName(), nameValuePair.getValue());
        }

        return httpClient.execute(httpget);
    }

    /**
     * 发送POST请求
     *
     * @return
     */
    private CloseableHttpResponse Post() throws IOException, URISyntaxException {
        //得到HTTP Client 支持SSL,双向证书链接
        CloseableHttpClient httpClient = HttpConnectionManager.getInstance().getHttpClient();
        //设置POST请求对象
        HttpPost httppost = new HttpPost(getUrl());
        //设置URL
        List<NameValuePair> params = getHttpParams();
        if (params != null) {
            String str = EntityUtils.toString(new UrlEncodedFormEntity(params));
            logger.info("the url is " + httppost.getURI().toString() + "?" + str);
            httppost.setURI(new URI(httppost.getURI().toString() + "?" + str));
        }
        //设置消息头

        List<NameValuePair> heads = getHttpHead();
        List<NameValuePair> defaultedHeads = getDefaultHttpHead();
        if (heads != null) defaultedHeads.addAll(heads);
        for (NameValuePair nameValuePair : defaultedHeads) {
            httppost.addHeader(nameValuePair.getName(), nameValuePair.getValue());
        }

        //设置消息体
        String body = getHttpBody();
        if (body != null) {
            HttpEntity se = new StringEntity(body, "UTF-8");
            httppost.setEntity(se);
        }
        return httpClient.execute(httppost);
    }

    /**
     * 下载
     *
     */
    public ByteArrayOutputStream download() throws Exception {
        HttpGet httpget = new HttpGet(getUrl());
        InputStream body = null;
        CloseableHttpResponse response = null;

        try {
            List<NameValuePair> heads = getHttpHead();
            List<NameValuePair> defaultHttpHead = getDefaultHttpHead();
            if (heads != null) defaultHttpHead.addAll(heads);
            for (NameValuePair nameValuePair : defaultHttpHead) {
                httpget.addHeader(nameValuePair.getName(), nameValuePair.getValue());
            }

            httpget.setURI(new URI(httpget.getURI().toString()));

            // 发送请求
            CloseableHttpClient httpClient = HttpConnectionManager.getInstance().getHttpClient();

            response = httpClient.execute(httpget);
            // 获取返回数据
            HttpEntity entity = response.getEntity();
            body = entity.getContent();

            ByteArrayOutputStream os = new ByteArrayOutputStream();
            IOUtils.copy(body, os);
            body.close();
            return os;
        } catch (ClientProtocolException e) {
            throw new Exception(e);
        } catch (IOException e) {
            throw new Exception(e);
        } catch (URISyntaxException e) {
            throw new Exception(e);
        } finally {
            if (httpget != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    throw new Exception(e);
                }
            }
        }
    }

    /**
     *
     * @param obj
     * @return
     * @throws IllegalAccessException
     */
    public List<NameValuePair> objectToMap(Object obj) throws IllegalAccessException {
        List<NameValuePair> pairs = new ArrayList<>();
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            String value = String.valueOf(field.get(obj));
            NameValuePair np = new BasicNameValuePair(fieldName,value);
            pairs.add(np);
        }
        return pairs;
    }
}
