package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sumeetb on 10/13/15.
 */
public class MenuPackageDetailModel implements Serializable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private data mData;

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

    public data getmData() {
        return mData;
    }

    public void setmData(data mData) {
        this.mData = mData;
    }

    public class data implements Serializable{

        @SerializedName("MenuPackage")
        CateringLandingModel.data.MenuPackage menupackage;


        @SerializedName("MenuPackageItem")
        ArrayList<CateringLandingModel.data.MenuPackageItem> menupackageitem;

        @SerializedName("CategorySwitch")
        ArrayList<CateringLandingModel.data.CategorySwitch> categorySwitch;


        public ArrayList<CateringLandingModel.data.CategorySwitch> getCategorySwitch() {
            return categorySwitch;
        }

        public void setCategorySwitch(ArrayList<CateringLandingModel.data.CategorySwitch> categorySwitch) {
            this.categorySwitch = categorySwitch;
        }

        public CateringLandingModel.data.MenuPackage getMenupackage() {
            return menupackage;
        }

        public void setMenupackage(CateringLandingModel.data.MenuPackage menupackage) {
            this.menupackage = menupackage;
        }

        public ArrayList<CateringLandingModel.data.MenuPackageItem> getMenupackageitem() {
            return menupackageitem;
        }

        public void setMenupackageitem(ArrayList<CateringLandingModel.data.MenuPackageItem> menupackageitem) {
            this.menupackageitem = menupackageitem;
        }
    }

}
