package com.newhead.rudderframework.core.http;

import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by liuwei on 16/8/30.
 *
 */
public class HttpConnectionManager {

    private static HttpConnectionManager instance;

    private static PoolingHttpClientConnectionManager connectionManager;

    /**
     * 
     * @return
     */
    public static HttpConnectionManager getInstance() {
        if (instance!=null) {
            return instance;
        }
        synchronized (HttpConnectionManager.class) {
            if (instance!=null) {
                return instance;
            }
            instance = new HttpConnectionManager();
            instance.init();
        }
        return instance;
    }

    /**
     *
     * 初始化
     */
    private void init() {
        X509TrustManager xtm = new X509TrustManager(){   //创建TrustManager
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
            public X509Certificate[] getAcceptedIssuers() {
                return null;   //return new java.security.cert.X509Certificate[0];
            }
        };

        TrustManager[] tm = {xtm};
        SSLContext sslContext = null;
        try {
            sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, tm, null);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }

        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext,
                new String[] { "TLSv1"}, null,
                SSLConnectionSocketFactory.getDefaultHostnameVerifier());// 客户端验证服务器身份的策略
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
                .register("https", sslsf)
                .register("net", new PlainConnectionSocketFactory())
                .build();
        connectionManager =new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        connectionManager.setMaxTotal(200);
        connectionManager.setDefaultMaxPerRoute(200);
    }

    /**
     * 获得HTTPClient
     *
     * @return
     */
    public CloseableHttpClient getHttpClient() {

        CloseableHttpClient httpClient = HttpClients.custom()
                .setConnectionManager(connectionManager)
                .build();
        return httpClient;
    }
}
