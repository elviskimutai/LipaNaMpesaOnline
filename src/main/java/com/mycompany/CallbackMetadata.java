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
public class CallbackMetadata {
     @SerializedName("Item")
     private Item[] item;

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }
     
}
