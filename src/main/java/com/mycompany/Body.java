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
public class Body {
    @SerializedName("stkCallback")
    private StkCallback stkCallback;

    public StkCallback getStkCallback() {
        return stkCallback;
    }

    public void setStkCallback(StkCallback stkCallback) {
        this.stkCallback = stkCallback;
    }
    
    
}
