/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author Administrator
 */
public class LipaNaMpesaRequest {

    @SerializedName("MerchantRequestID")
    private String MerchantRequestID;
    @SerializedName("CheckoutRequestID")
    private String CheckoutRequestID;
    @SerializedName("ResponseCode")
    private String ResponseCode;
    @SerializedName("ResponseDescription")
    private String ResponseDescription;
    @SerializedName("CustomerMessage")
    private String CustomerMessage;

    public String getMerchantRequestID() {
        return MerchantRequestID;
    }

    public void setMerchantRequestID(String MerchantRequestID) {
        this.MerchantRequestID = MerchantRequestID;
    }

    public String getCheckoutRequestID() {
        return CheckoutRequestID;
    }

    public void setCheckoutRequestID(String CheckoutRequestID) {
        this.CheckoutRequestID = CheckoutRequestID;
    }

    public String getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(String ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    public String getResponseDescription() {
        return ResponseDescription;
    }

    public void setResponseDescription(String ResponseDescription) {
        this.ResponseDescription = ResponseDescription;
    }

    public String getCustomerMessage() {
        return CustomerMessage;
    }

    public void setCustomerMessage(String CustomerMessage) {
        this.CustomerMessage = CustomerMessage;
    }

    
    public static LipaNaMpesaRequest makeRequest(String token, String PhoneNumber, int Amount) {
        try {
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{"
                    + "\"BusinessShortCode\": \"174379\","
                    + " \"Password\": \"MTc0Mzc5YmZiMjc5ZjlhYTliZGJjZjE1OGU5N2RkNzFhNDY3Y2QyZTBjODkzMDU5YjEwZjc4ZTZiNzJhZGExZWQyYzkxOTIwMTYwMjE2MTY1NjI3\","
                    + " \"Timestamp\": \"20160216165627\","
                    + " \"TransactionType\": \"CustomerPayBillOnline\","
                    + " \"Amount\": " + Amount + ","
                    + " \"PartyA\": \"254722000011\","
                    + "\"PartyB\": \"174379\","
                    + " \"PhoneNumber\":" + PhoneNumber + ","
                    + " \"CallBackURL\": \"https://shoppingcartapi20180317120238.azurewebsites.net/api/StkCallBack\","
                    + "\"AccountReference\": \"test234\","
                    + "\"TransactionDesc\": \"paying for eFarm prduct\""
                    + "}");
            Request request = new Request.Builder()
                    .url("https://sandbox.safaricom.co.ke/mpesa/stkpush/v1/processrequest")
                    .post(body)
                    .addHeader("authorization", "Bearer " + token)
                    .addHeader("content-type", "application/json")
                    .build();

            Response response = client.newCall(request).execute();
           // System.out.println(response.body().string());
             Gson gson = new Gson();
            LipaNaMpesaRequest lipaNaMpesaRequest = gson.fromJson(response.body().string(), LipaNaMpesaRequest.class);
            return lipaNaMpesaRequest;

        } catch (IOException ex) {
            Logger.getLogger(LipaNaMpesaRequest.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
