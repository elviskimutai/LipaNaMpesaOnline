/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymaven;

import com.mycompany.AuthToken;
import com.mycompany.LipaNaMpesaRequest;
import com.mycompany.LipaNaMpesaTransactionResponse;
import com.mycompany.Listen_To_Port_80;
import com.mycompany.MyHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String args[] ) throws UnsupportedEncodingException, IOException{
        AuthToken authToken = new AuthToken();
        authToken=  authToken.getAccessToken();
        
        System.out.println(authToken.getToken());
        LipaNaMpesaRequest _LipaNaMpesaRequest=  LipaNaMpesaRequest.makeRequest(authToken.getToken(), "254705555285", 1);
         
          
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
       
      //   System.out.println(_LipaNaMpesaRequest.getMerchantRequestID());
          //System.out.println(_LipaNaMpesaRequest.getResponseCode());
          //System.out.println(_LipaNaMpesaRequest.getCustomerMessage());
          //System.out.println(_LipaNaMpesaRequest.getCheckoutRequestID());
          
          //after transaction is succesfull
       
          
         
         
         
         
    }
}
