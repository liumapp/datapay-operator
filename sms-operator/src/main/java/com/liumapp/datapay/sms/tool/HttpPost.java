package com.liumapp.datapay.sms.tool;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.InputStream;
import java.util.List;

import static com.liumapp.datapay.sms.tool.Convert.convertStreamToString;

/**
 * Created by haoxy on 2018/11/3.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class HttpPost {

    public static String httpPost(String url,List<NameValuePair> params) {
        String result = "";
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            //HttpClient httpclient = new DefaultHttpClient();
            org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(url);
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            HttpResponse response = httpclient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instreams = entity.getContent();
                result = convertStreamToString(instreams);
                System.out.println(result);
            }
        } catch (Exception e) {
        }
        return result;
    }
}
