package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by jatindersi on 8/14/2015.
 */
public class DealModel
{
    @SerializedName("status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @SerializedName("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @SerializedName("data")
    private Data mdata;

    public Data getMdata() {
        return mdata;
    }

    public void setMdata(Data mdata) {
        this.mdata = mdata;
    }

    public  class Data
    {
        @SerializedName("promo_code_status")
       private String promo_code_status;

        public String getPromo_code_status()
        {
            return promo_code_status;
        }

        public void setPromo_code_status(String promo_code_status)
        {
            this.promo_code_status = promo_code_status;
        }
        @SerializedName("description")
         private String description;
        @SerializedName("deal_type")
        private String DealType;

        public String getDealType() {
            return DealType;
        }

        public void setDealType(String dealType) {
            DealType = dealType;
        }

        @SerializedName("add_amount")
        private String Add_Amount;

        public String getAdd_Amount() {
            return Add_Amount;
        }

        public void setAdd_Amount(String add_Amount) {
            Add_Amount = add_Amount;
        }

        @SerializedName("discount_amount")
        private String Discount_Amount;

        public String getDiscount_Amount() {
            return Discount_Amount;
        }

        public void setDiscount_Amount(String discount_Amount) {
            Discount_Amount = discount_Amount;
        }
         @SerializedName("OfferItem")
        private ArrayList<OfferItem> offeritem;

        public ArrayList<OfferItem> getOfferitem() {
            return offeritem;
        }

        public void setOfferitem(ArrayList<OfferItem> offeritem) {
            this.offeritem = offeritem;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
        @SerializedName("deal_id")
        private String deal_id;

        public String getDeal_id() {
            return deal_id;
        }

        public void setDeal_id(String deal_id) {
            this.deal_id = deal_id;
        }

        public class OfferItem
        {
            @SerializedName("MenuItem")
            private MenuItem MenuItem;

            public OfferItem.MenuItem getMenuItem() {
                return MenuItem;
            }

            public void setMenuItem(OfferItem.MenuItem menuItem) {
                MenuItem = menuItem;
            }

            public class MenuItem
            {
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

                @SerializedName("retail_price")
                private String RetailPrice;

                public String getRetailPrice() {
                    if(RetailPrice.equalsIgnoreCase("")){
                        RetailPrice="0.0";
                    }
                    return RetailPrice;
                }

                public void setRetailPrice(String retailPrice) {
                    RetailPrice = retailPrice;
                }

                @SerializedName("original_price")
                private String original_price;

                public String getOriginal_price() {
                    return original_price;
                }

                public void setOriginal_price(String original_price) {
                    this.original_price = original_price;
                }

                @SerializedName("standard_cost")
                private String standard_cost;

                public String getStandard_cost() {
                    return standard_cost;
                }

                public void setStandard_cost(String standard_cost) {
                    this.standard_cost = standard_cost;
                }

                @SerializedName("cat_icon_name")
                private String cat_icon_name;

                public String getCat_icon_name() {
                    return cat_icon_name;
                }

                public void setCat_icon_name(String cat_icon_name) {
                    this.cat_icon_name = cat_icon_name;
                }

                @SerializedName("cat_icon_ext")
                private String cat_icon_ext;

                public String getCat_icon_ext() {
                    return cat_icon_ext;
                }

                public void setCat_icon_ext(String cat_icon_ext) {
                    this.cat_icon_ext = cat_icon_ext;
                }

                @SerializedName("item_size")
                private String itemsize;

                public String getItemsize() {
                    return itemsize;
                }

                public void setItemsize(String itemsize) {
                    this.itemsize = itemsize;
                }
            }
        }
    }
}
