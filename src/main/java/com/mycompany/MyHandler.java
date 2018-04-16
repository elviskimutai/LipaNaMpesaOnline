/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Administrator
 */
public class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            
           
            InputStream inputStream= t.getRequestBody();
		String response=IOUtils.toString(inputStream , StandardCharsets.UTF_8);
		Gson gson = new Gson();
           LipaNaMpesaTransactionResponse lipaNaMpesaTransactionResponse =gson.fromJson(response,LipaNaMpesaTransactionResponse.class);
           //Here i can now save records to db
        }
    }