package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sumeetb on 10/26/15.
 */
public class FavoritesModel {

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

    @SerializedName("order")
    private ArrayList<MyOrderHistory.Data> mOrderHistoryList;

    public ArrayList<MyOrderHistory.Data> getmOrderHistoryList() {
        return mOrderHistoryList;
    }

    public void setmOrderHistoryList(ArrayList<MyOrderHistory.Data> mOrderHistoryList) {
        this.mOrderHistoryList = mOrderHistoryList;
    }


    @SerializedName("data")
    ArrayList<DefaultLocationModel.Data> resturant;

    public ArrayList<DefaultLocationModel.Data> getResturant() {
        return resturant;
    }

    public void setResturant(ArrayList<DefaultLocationModel.Data> resturant) {
        this.resturant = resturant;
    }

    @SerializedName("item")
    ArrayList<MealSecondModel.data> itemlist;

    public ArrayList<MealSecondModel.data> getItemlist() {
        return itemlist;
    }

    public void setItemlist(ArrayList<MealSecondModel.data> itemlist) {
        this.itemlist = itemlist;
    }
}
