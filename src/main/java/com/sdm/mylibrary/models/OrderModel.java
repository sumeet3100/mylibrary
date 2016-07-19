package com.sdm.mylibrary.models;

/**
 * Created by jatindersi on 5/21/2015.
 */
public class OrderModel {
    private String order_title, order_id, order_date, order_total, order_restaurant, order_by_name, order_rating;

    public void setTitle(String title) {
        this.order_title = title;
    }

    public String getTitle() {
        return order_title;
    }

    public void setID(String orderid) {
        this.order_id = orderid;
    }

    public String getID() {
        return order_id;
    }

    public void setDate(String order_date) {
        this.order_date = order_date;
    }

    public String getDate() {
        return order_date;
    }

    public String getTotal() {
        return order_total;
    }

    public void setTotal(String total) {
        this.order_total = total;
    }

    public void setRestaruant(String resturant) {
        this.order_restaurant = resturant;
    }

    public String getRestaruant() {
        return order_restaurant;
    }

    public String getBy() {
        return order_by_name;
    }

    public void setBy(String by_name) {
        this.order_by_name = by_name;
    }

    public String getRating() {
        return order_rating;
    }

    public void setRating(String rating) {
        this.order_rating = rating;
    }
}
