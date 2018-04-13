/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymaven;

import com.mycompany.AuthToken;
import com.mycompany.LipaNaMpesaRequest;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String args[] ) throws UnsupportedEncodingException{
        AuthToken authToken = new AuthToken();
        authToken=  authToken.getAccessToken();
        
        System.out.println(authToken.getToken());
          LipaNaMpesaRequest _LipaNaMpesaRequest=  LipaNaMpesaRequest.makeRequest(authToken.getToken(), "254711472504", 100);
       
         System.out.println(_LipaNaMpesaRequest.getMerchantRequestID());
          System.out.println(_LipaNaMpesaRequest.getResponseCode());
          System.out.println(_LipaNaMpesaRequest.getCustomerMessage());
          System.out.println(_LipaNaMpesaRequest.getCheckoutRequestID());
         
         
    }
}
