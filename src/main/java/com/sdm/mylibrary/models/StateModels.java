package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by sumeetb on 5/15/2015.
 */
public class StateModels {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private ArrayList<data> mData;

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

    public ArrayList<data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<data> mData) {
        this.mData = mData;
    }

    public class data{

        @SerializedName("id")
        private String id;

        @SerializedName("code")
        private String code;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

}
