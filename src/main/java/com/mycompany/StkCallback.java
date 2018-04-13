/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Administrator
 */
public class StkCallback {
    @SerializedName("MerchantRequestID")
     private String merchantRequestID;
    @SerializedName("CheckoutRequestID")
    private String checkoutRequestID;
    @SerializedName("ResultCode")
    private long resultCode;
    @SerializedName("ResultDesc")
    private String resultDesc;
    @SerializedName("CallbackMetadata")
    private CallbackMetadata callbackMetadata;

    public String getMerchantRequestID() {
        return merchantRequestID;
    }

    public void setMerchantRequestID(String merchantRequestID) {
        this.merchantRequestID = merchantRequestID;
    }

    public String getCheckoutRequestID() {
        return checkoutRequestID;
    }

    public void setCheckoutRequestID(String checkoutRequestID) {
        this.checkoutRequestID = checkoutRequestID;
    }

    public long getResultCode() {
        return resultCode;
    }

    public void setResultCode(long resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public CallbackMetadata getCallbackMetadata() {
        return callbackMetadata;
    }

    public void setCallbackMetadata(CallbackMetadata callbackMetadata) {
        this.callbackMetadata = callbackMetadata;
    }
    
}
