package com.sdm.mylibrary.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by jatindersi on 6/29/2015.
 */
public class MealGridModel {
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

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    public ArrayList<data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<data> mData) {
        this.mData = mData;
    }

    @SerializedName("data")
    private ArrayList<data> mData;

    public class data {
        public MenuCategory getMenuItem() {
            return MenuItem;
        }

        public void setMenuItem(MenuCategory menuItem) {
            MenuItem = menuItem;
        }

        @SerializedName("MenuCategory")
        MenuCategory MenuItem;


        public class MenuCategory {
            @SerializedName("android_icon")
            private String icon;
            @SerializedName("weight")
            private String weight;
            @SerializedName("status")
            private String status;
            @SerializedName("android_hover_icon")
            private String hover_icon;
            @SerializedName("class")
            private String category;
            @SerializedName("id")
            private String id;
            @SerializedName("customer_status")
            private String customer_status;
            @SerializedName("catering_status")
            private String cateringstatus;
            @SerializedName("image_name")
            private String image_name;
            @SerializedName("name")
            private String Name;

            @SerializedName("show_status")
            private String showstatus;

            @SerializedName("mobile_step2_icon")
            private String mobile_step2_icon;

            @SerializedName("mobile_step2_icon_ext")
            private String mobile_step2_icon_ext;

            public String getMobile_step2_icon() {
                return mobile_step2_icon;
            }

            public void setMobile_step2_icon(String mobile_step2_icon) {
                this.mobile_step2_icon = mobile_step2_icon;
            }

            public String getMobile_step2_icon_ext() {
                return mobile_step2_icon_ext;
            }

            public void setMobile_step2_icon_ext(String mobile_step2_icon_ext) {
                this.mobile_step2_icon_ext = mobile_step2_icon_ext;
            }

            @SerializedName("device_icon_name")
            private String device_icon_name;

            @SerializedName("device_icon_ext")
            private String device_icon_ext;

            public String getDevice_icon_name() {
                return device_icon_name;
            }

            public void setDevice_icon_name(String device_icon_name) {
                this.device_icon_name = device_icon_name;
            }

            public String getDevice_icon_ext() {
                return device_icon_ext;
            }

            public void setDevice_icon_ext(String device_icon_ext) {
                this.device_icon_ext = device_icon_ext;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getHover_icon() {
                return hover_icon;
            }

            public void setHover_icon(String hover_icon) {
                this.hover_icon = hover_icon;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCustomer_status() {
                return customer_status;
            }

            public void setCustomer_status(String customer_status) {
                this.customer_status = customer_status;
            }

            public String getCateringstatus() {
                return cateringstatus;
            }

            public void setCateringstatus(String cateringstatus) {
                this.cateringstatus = cateringstatus;
            }

            public String getImage_name() {
                return image_name;
            }

            public void setImage_name(String image_name) {
                this.image_name = image_name;
            }

            public String getName() {
                return Name;
            }

            public void setName(String name) {
                Name = name;
            }

            public String getShowstatus() {
                return showstatus;
            }

            public void setShowstatus(String showstatus) {
                this.showstatus = showstatus;
            }
        }
    }
}
