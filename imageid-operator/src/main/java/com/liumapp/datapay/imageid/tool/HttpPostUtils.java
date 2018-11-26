package com.liumapp.datapay.imageid.tool;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by haoxy on 2018/11/24.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class HttpPostUtils implements Constant {

    public static String HttpPost(String carPath, String host, String path,String appkey) throws IOException {
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost post = new HttpPost(host + path);
        MultipartEntityBuilder entity = MultipartEntityBuilder.create();
        FileBody fileBody = new FileBody(new File(carPath));
        entity.seContentType(ContentType.MULTIPART_FORM_DATA);
        entity.addPart("data", fileBody);
        entity.addTextBody("appkey", appkey);
        post.setEntity(entity.build());
        HttpResponse response = httpclient.execute(post);
        HttpEntity r_entity = response.getEntity();
        return EntityUtils.toString(r_entity, java.nio.charset.Charset.forName(Charset));
    }
}
