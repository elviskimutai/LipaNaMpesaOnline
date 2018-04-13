package com.mycompany;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class LipaNaMpesaTransactionResponse {
    @SerializedName("Body")
    private Body body;

    
    public Body getBody() { return body; }  
    
    
    public void setBody(Body value) { this.body = value; }
}