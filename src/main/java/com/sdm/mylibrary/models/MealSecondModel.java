package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by jatindersi on 7/1/2015.
 */
public class MealSecondModel implements Serializable {
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

    public String getStep_second_icon() {
        return Step_second_icon;
    }

    public void setStep_second_icon(String step_second_icon) {
        Step_second_icon = step_second_icon;
    }

    public String getStep2Name() {
        return step2Name;
    }

    public void setStep2Name(String step2Name) {
        this.step2Name = step2Name;
    }

    @SerializedName("name")
    private String step2Name;

    @SerializedName("mobile_step2_icon")
    private String Step_second_icon;

    @SerializedName("mobile_step2_icon_ext")
    private String mobile_step2_icon_ext;

    public String getMobile_step2_icon_ext() {
        return mobile_step2_icon_ext;
    }

    public void setMobile_step2_icon_ext(String mobile_step2_icon_ext) {
        this.mobile_step2_icon_ext = mobile_step2_icon_ext;
    }

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    public String getCategory_ID() {
        return Category_ID;
    }

    public void setCategory_ID(String category_ID) {
        Category_ID = category_ID;
    }

    @SerializedName("category_id")
    private String Category_ID;

    public ArrayList<data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<data> mData) {
        this.mData = mData;
    }

    @SerializedName("item")
    private ArrayList<data> mData;

    public class data implements Serializable{
        public MenuItemData getMenuItem() {
            return MenuItem;
        }

        public void setMenuItem(MenuItemData menuItem) {
            MenuItem = menuItem;
        }

        @SerializedName("MenuItem")
        MenuItemData MenuItem;


        public ArrayList<ItemPrice> getPrice() {
            return Price;
        }

        public void setPrice(ArrayList<ItemPrice> price) {
            Price = price;
        }

        @SerializedName("ItemPrice")
        ArrayList<ItemPrice> Price;

        public class ItemPrice implements Serializable{
            public String getCheckMd() {
                return CheckMd;
            }

            public void setCheckMd(String checkMd) {
                CheckMd = checkMd;
            }

            @SerializedName("is_md")
            private String CheckMd;

            public String getSpecialText() {
                return SpecialText;
            }

            public void setSpecialText(String specialText) {
                SpecialText = specialText;
            }

            @SerializedName("special_text")
            private String SpecialText;

            public String getMdPrice() {
                return MdPrice;
            }

            public void setMdPrice(String mdPrice) {
                MdPrice = mdPrice;
            }

            @SerializedName("md_price")
            private String MdPrice;

            public String getPriceid() {
                return priceid;
            }

            public void setPriceid(String priceid) {
                this.priceid = priceid;
            }

            @SerializedName("id")
            private String priceid;

            public String getStandardCost() {
                return StandardCost;
            }

            public void setStandardCost(String standardCost) {
                StandardCost = standardCost;
            }

            @SerializedName("standard_cost")
            private String StandardCost;

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            @SerializedName("size")
            private String size;

            public String getRetailPrice() {
                return RetailPrice;
            }

            public void setRetailPrice(String retailPrice) {
                RetailPrice = retailPrice;
            }

            @SerializedName("retail_price")
            private String RetailPrice;
        }

        public class MenuItemData implements Serializable{
            public String getItem_Pic_Big() {
                return Item_Pic_Big;
            }

            public void setItem_Pic_Big(String item_Pic_Big) {
                Item_Pic_Big = item_Pic_Big;
            }

            @SerializedName("item_pic_android_big")
            private String Item_Pic_Big;

            public String getItem_Pic_Medium() {
                return Item_Pic_Medium;
            }

            public void setItem_Pic_Medium(String item_Pic_Medium) {
                Item_Pic_Medium = item_Pic_Medium;
            }

            @SerializedName("item_pic_android_medium")
            private String Item_Pic_Medium;

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            @SerializedName("weight")
            private String weight;

            public String getItemStatus() {
                return ItemStatus;
            }

            public void setItemStatus(String itemStatus) {
                ItemStatus = itemStatus;
            }

            @SerializedName("status")
            private String ItemStatus;

            public String getItem_Pic_Detail_page() {
                return Item_Pic_Detail_page;
            }

            public void setItem_Pic_Detail_page(String item_Pic_Detail_page) {
                Item_Pic_Detail_page = item_Pic_Detail_page;
            }

            @SerializedName("item_pic_thumd_detail_page")
            private String Item_Pic_Detail_page;

            public String getHealthy_Status() {
                return Healthy_Status;
            }

            public void setHealthy_Status(String healthy_Status) {
                Healthy_Status = healthy_Status;
            }

            @SerializedName("healthy_status")
            private String Healthy_Status;

            public String getItemId() {
                return ItemId;
            }

            public void setItemId(String itemId) {
                ItemId = itemId;
            }

            @SerializedName("id")
            private String ItemId;

            


            public String getSpicyStatus() {
                return SpicyStatus;
            }

            public void setSpicyStatus(String spicyStatus) {
                SpicyStatus = spicyStatus;
            }

            @SerializedName("spicy_status")
            private String SpicyStatus;

            public String getItemName() {
                return ItemName;
            }

            public void setItemName(String itemName) {
                ItemName = itemName;
            }

            @SerializedName("item_name")
            private String ItemName;

            public String getItemDesc() {
                return ItemDesc;
            }

            public void setItemDesc(String itemDesc) {
                ItemDesc = itemDesc;
            }

            @SerializedName("description")
            private String ItemDesc;

            public String getMenuCategoryId() {
                return MenuCategoryId;
            }

            public void setMenuCategoryId(String menuCategoryId) {
                MenuCategoryId = menuCategoryId;
            }

            @SerializedName("menu_category_id")
            private String MenuCategoryId;

            @SerializedName("mobile_step2_icon")
            private String mobile_step2_icon;

            @SerializedName("mobile_step2_icon_ext")
            private String mobile_step2_icon_ext;

            @SerializedName("category_name")
            private String category_name;


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

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }


            private String favorite_order_item_id;

            public String getFavorite_order_item_id() {
                return favorite_order_item_id;
            }

            public void setFavorite_order_item_id(String favorite_order_item_id) {
                this.favorite_order_item_id = favorite_order_item_id;
            }
        }


        @SerializedName("RestaurantMenuItem")
        RestaurantMenuItem restuerantItem;

        public RestaurantMenuItem getRestuerantItem() {
            return restuerantItem;
        }

        public void setRestuerantItem(RestaurantMenuItem restuerantItem) {
            this.restuerantItem = restuerantItem;
        }

        public class RestaurantMenuItem implements Serializable{

            @SerializedName("id")
            private String id;

            @SerializedName("menu_item_id")
            private String menu_item_id;

            @SerializedName("menu_category_id")
            private String menu_category_id;

            @SerializedName("operating_partner_location_id")
            private String operating_partner_location_id;

            @SerializedName("status")
            private String status;

            @SerializedName("category_name")
            private String category_name;

            @SerializedName("mobile_step2_icon")
            private String mobile_step2_icon;

            @SerializedName("mobile_step2_icon_ext")
            private String mobile_step2_icon_ext;

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

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

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getMenu_item_id() {
                return menu_item_id;
            }

            public void setMenu_item_id(String menu_item_id) {
                this.menu_item_id = menu_item_id;
            }

            public String getMenu_category_id() {
                return menu_category_id;
            }

            public void setMenu_category_id(String menu_category_id) {
                this.menu_category_id = menu_category_id;
            }

            public String getOperating_partner_location_id() {
                return operating_partner_location_id;
            }

            public void setOperating_partner_location_id(String operating_partner_location_id) {
                this.operating_partner_location_id = operating_partner_location_id;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }
    }
}
