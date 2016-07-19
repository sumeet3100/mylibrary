package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jatindersi on 5/11/2015.
 */
public class EditCardModel
{
    @SerializedName("status")
   private String status;

@SerializedName("message")

private String message;

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
