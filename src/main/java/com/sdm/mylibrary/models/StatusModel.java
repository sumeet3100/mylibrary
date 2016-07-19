package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jagdeeps on 6/4/2015.
 */
public class StatusModel {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    private String favorite_order_item_id;

    public String getFavorite_order_item_id() {
        return favorite_order_item_id;
    }

    public void setFavorite_order_item_id(String favorite_order_item_id) {
        this.favorite_order_item_id = favorite_order_item_id;
    }

    private String group_order_id;

    private String data;

    private String request_quote_id;

    private String time_status;

    private String is_lunch_dinner;

    public String getIs_lunch_dinner() {
        return is_lunch_dinner;
    }

    public void setIs_lunch_dinner(String is_lunch_dinner) {
        this.is_lunch_dinner = is_lunch_dinner;
    }

    public String getTime_status() {
        return time_status;
    }

    public void setTime_status(String time_status) {
        this.time_status = time_status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGroup_order_id() {
        return group_order_id;
    }

    public void setGroup_order_id(String group_order_id) {
        this.group_order_id = group_order_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequest_quote_id() {
        return request_quote_id;
    }

    public void setRequest_quote_id(String request_quote_id) {
        this.request_quote_id = request_quote_id;
    }
}
