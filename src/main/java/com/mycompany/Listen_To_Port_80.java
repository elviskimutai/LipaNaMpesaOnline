/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author Administrator
 */
//not sure if it is working...
public class Listen_To_Port_80 {
private static OkHttpClient client = new OkHttpClient();
  
        public static String GetResponse(String url) throws IOException{
            Request _request = new Request.Builder().url(url).build();
            Response response = client.newCall(_request).execute();
            return response.body().string();
    }

}
