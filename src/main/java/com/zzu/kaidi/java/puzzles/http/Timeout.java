package com.zzu.kaidi.java.puzzles.http;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.MultipartPostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by kaidi on 17-3-10.
 */
public class Timeout {

    public static void main(String[] args)  {
        try {
            String url = "http://172.16.15.138:8083/newyspay/test/timeout";
            String filePath = "/tmp/multimarkdown_highlight.pack.js";

            HttpClient httpClient = new HttpClient();
            MultipartPostMethod post = new MultipartPostMethod(url);
            post.getParams().setParameter("http.protocol.content-charset", "GBK");
            FilePart file = new FilePart("msg", new File(filePath));
            file.setContentType("text/*");
            file.setCharSet("GBK");
            post.addPart(file);
            post.addParameter("src", "src");
            post.addParameter("msgCode", "msgCode");

            //post.getParams().setSoTimeout(240);

            httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(1000);



            httpClient.executeMethod(post);
        }catch (IOException e){
            System.out.println("exception:");
            System.out.println(e);
        }finally {
            System.out.println("end");
        }

    }
}
