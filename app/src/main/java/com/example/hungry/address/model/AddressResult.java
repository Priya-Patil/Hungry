package com.example.hungry.address.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class AddressResult {
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getCount() {
        return count;
    }
    public void setCount(String count) {
        this.count = count;
    }
    public ArrayList<DeliveryAddresss> getResult() {
        return result;
    }
    public void setResult(ArrayList<DeliveryAddresss> result) {
        this.result = result;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @SerializedName("message")
    public String message;
    @SerializedName("status")
    public  int status;
    @SerializedName("count")
    public String count;
    @SerializedName("result")
    public ArrayList<DeliveryAddresss> result;
    @SerializedName("type")
    public String type;
}
