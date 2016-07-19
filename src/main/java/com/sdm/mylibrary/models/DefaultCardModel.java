package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jatindersi on 5/27/2015.
 */
public class DefaultCardModel {
    @SerializedName("status")
    private String status;

    @SerializedName("message")

    private String message;
    @SerializedName("data")

    private String messagedata;
    public String getMessagedata() {
        return messagedata;
    }

    public void setMessagedata(String messagedata) {
        this.messagedata = messagedata;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


