package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sumeetb on 11/6/15.
 */
public class MpselectedValue implements Serializable {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SerializedName("message")
    private String message;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @SerializedName("status")
    private String Status;

    @SerializedName("data")
    private ArrayList<data> mData;


    public ArrayList<data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<data> mData) {
        this.mData = mData;
    }

    public class data implements Serializable{

        @SerializedName("MenuItem")
        ItemDetailModel.data.MItem menuItem;

        public ItemDetailModel.data.MItem getMenuItem() {
            return menuItem;
        }

        public void setMenuItem(ItemDetailModel.data.MItem menuItem) {
            this.menuItem = menuItem;
        }
    }



}
