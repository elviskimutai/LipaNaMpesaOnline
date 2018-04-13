package com.mycompany;


import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.UnsupportedEncodingException;
import jdk.nashorn.api.scripting.JSObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class AuthToken {

    @SerializedName("access_token")
    private String token;
    @SerializedName("expires_in")
    private String expiryTime;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
 

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public AuthToken getAccessToken() throws UnsupportedEncodingException {
        try {
            String app_key = "HlXqfjzG4Ey11rwkybYNQo68XHbVbiIj";
            String app_secret = "AZcBk3kvFROw4w9A";
            String appKeySecret = app_key + ":" + app_secret;
            byte[] bytes = appKeySecret.getBytes("ISO-8859-1");
            String auth = Base64.encode(bytes);

            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://sandbox.safaricom.co.ke/oauth/v1/generate?grant_type=client_credentials")
                    .get()
                    .addHeader("authorization", "Basic " + auth)
                    .addHeader("cache-control", "no-cache")
                    .build();
            Response response = client.newCall(request).execute();
            Gson gson = new Gson();
            AuthToken authToken = gson.fromJson(response.body().string(), AuthToken.class);

            return authToken;
        } catch (Exception ex) {
            return null;
        }

    }

}


