package com.newhead.rudderframework.core.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

/**
 * Created by ling on 2017/4/4.
 */
public class HttpClient {
    private static PoolingHttpClientConnectionManager poolConnManager;
    private static final int maxTotalPool = 200;
    private static final int maxConPerRoute = 20;
    private static final int socketTimeout = 2000;
    private static final int connectionRequestTimeout = 30000;
    private static final int connectTimeout = 30000;

    public void init(){
        try {
            SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(null,
                    new TrustSelfSignedStrategy())
                    .build();
            HostnameVerifier hostnameVerifier = SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                    sslcontext,hostnameVerifier);
            Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("http", PlainConnectionSocketFactory.getSocketFactory())
                    .register("https", sslsf)
                    .build();
            poolConnManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
            // Increase max total connection to 200
            poolConnManager.setMaxTotal(maxTotalPool);
            // Increase default max connection per route to 20
            poolConnManager.setDefaultMaxPerRoute(maxConPerRoute);
            SocketConfig socketConfig = SocketConfig.custom().setSoTimeout(socketTimeout).build();
            poolConnManager.setDefaultSocketConfig(socketConfig);
        } catch (Exception e) {

        }
    }

    public static String get(String url) {
        String returnStr = null;
        //参数检测
        if(url==null||"".equals(url)) {
            return returnStr;
        }
//        StringBuffer sfb = new StringBuffer();
//        sfb.append(url);
//        sfb.append("?type=");
//        sfb.append(type);
//        sfb.append("&cmd=");
//        sfb.append(cmd);
//        sfb.append("&code=");
//        sfb.append(code);
        HttpGet httpPost = new HttpGet(url);
        try {

            CloseableHttpClient client = getConnection();
            CloseableHttpResponse response = client.execute(httpPost);
            int status = response.getStatusLine().getStatusCode();

            if (status >= 200 && status < 300) {
                HttpEntity entity = response.getEntity();
                String resopnse="";
                if(entity != null)
                {
                    resopnse= EntityUtils.toString(entity,"utf-8");
                }
                System.out.println(" 接收响应：url"+url+" status="+status);
                return entity != null ? resopnse : null;
            } else {
                HttpEntity entity = response.getEntity();
                httpPost.abort();
                System.out.println(" 接收响应：url"+url+" status="+status+" resopnse="+EntityUtils.toString(entity,"utf-8"));
                throw new ClientProtocolException("Unexpected response status: " + status);
            }

        } catch (Exception e) {
            httpPost.abort();
            e.printStackTrace();
        } finally {
            httpPost.abort();
        }
        return returnStr;
    }

    /**
     * 发送Post请求
     * @param url
     * @param jsonStr
     * @return
     */
    public static String post(String url, String jsonStr) {
        String returnStr = null;
        //参数检测
        if(url==null||"".equals(url)) {
            return returnStr;
        }
        HttpPost httpPost = new HttpPost(url);
        try {
            httpPost.setEntity(new StringEntity(jsonStr,"UTF-8"));

            CloseableHttpClient client = getConnection();
            CloseableHttpResponse response = client.execute(httpPost);
            int status = response.getStatusLine().getStatusCode();

            if (status >= 200 && status < 300) {
                HttpEntity entity = response.getEntity();
                String resopnse="";
                if(entity != null)
                {
                    resopnse= EntityUtils.toString(entity,"utf-8");
                }
                System.out.println(" 接收响应：url"+url+" status="+status);
                return entity != null ? resopnse : null;
            } else {
                HttpEntity entity = response.getEntity();
                httpPost.abort();
                System.out.println(" 接收响应：url"+url+" status="+status+" resopnse="+EntityUtils.toString(entity,"utf-8"));
                throw new ClientProtocolException("Unexpected response status: " + status);
            }
        } catch (Exception e) {
            httpPost.abort();
            System.out.println(" Exception"+e.toString()+" url="+url+" jsonstr="+jsonStr);
        }
        return returnStr;
    }

    public static CloseableHttpClient getConnection(){
        RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(connectionRequestTimeout)
                .setConnectTimeout(connectTimeout).setSocketTimeout(socketTimeout).build();
        CloseableHttpClient httpClient = HttpClients.custom()
                .setConnectionManager(poolConnManager).setDefaultRequestConfig(requestConfig).build();
        if(poolConnManager!=null&&poolConnManager.getTotalStats()!=null){

            System.out.println("now client pool "+poolConnManager.getTotalStats().toString());
        }
        return httpClient;
    }
}
