package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sumeetb on 11/30/15.
 */
public class SuppliesModle {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private data Data;


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

    public data getData() {
        return Data;
    }

    public void setData(data data) {
        Data = data;
    }

    public class data implements Serializable {

        @SerializedName("Drink")
        private ArrayList<Drinks> drinks;

        public ArrayList<Drinks> getDrinks() {
            return drinks;
        }

        public void setDrinks(ArrayList<Drinks> drinks) {
            this.drinks = drinks;
        }

        public ItemDetailModel.data.MItem.Custom.Common.Category getCategory() {
            return category;
        }

        public void setCategory(ItemDetailModel.data.MItem.Custom.Common.Category category) {
            this.category = category;
        }

        public class Drinks{

            @SerializedName("MenuItem")
            ItemDetailModel.data.MItem menuItem;


            public ItemDetailModel.data.MItem getMenuItem() {
                return menuItem;
            }

            public void setMenuItem(ItemDetailModel.data.MItem menuItem) {
                this.menuItem = menuItem;
            }
        }

        @SerializedName("Category")
        ItemDetailModel.data.MItem.Custom.Common.Category category;


        @SerializedName("Supply")
        private ArrayList<supplies> Supplies;


        public ArrayList<supplies> getSupplies() {
            return Supplies;
        }

        public void setSupplies(ArrayList<supplies> supplies) {
            Supplies = supplies;
        }

        public class supplies {
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
}
