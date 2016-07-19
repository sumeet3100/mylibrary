package com.sdm.mylibrary.models;

/**
 * Created by sumeetb on 8/12/2015.
 */
public class CheckoutModel {

    private String status;

    private String error_code;

    private String tmp_cart_id;

    private String message;

    private String foocrew_points;

    private String order_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getFoocrew_points() {
        return foocrew_points;
    }

    public void setFoocrew_points(String foocrew_points) {
        this.foocrew_points = foocrew_points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getTmp_cart_id() {
        return tmp_cart_id;
    }

    public void setTmp_cart_id(String tmp_cart_id) {
        this.tmp_cart_id = tmp_cart_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
