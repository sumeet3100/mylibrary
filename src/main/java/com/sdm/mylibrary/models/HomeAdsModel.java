package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sumeetb on 4/30/2015.
 */
public class HomeAdsModel implements Serializable {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;


    private String foo_contact;


    public String getFoo_contact() {
        if(foo_contact==null){

            foo_contact="";
        }

        return foo_contact;
    }

    public void setFoo_contact(String foo_contact) {
        this.foo_contact = foo_contact;
    }

    @SerializedName("data")
    private ArrayList<data> mData;


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

    public ArrayList<data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<data> mData) {
        this.mData = mData;
    }

    public class data implements Serializable{

        @SerializedName("SiteAd")
       private  SiteAd add;

        public SiteAd getAdd() {
            return add;
        }

        public void setAdd(SiteAd add) {
            this.add = add;
        }

        public class SiteAd {

            @SerializedName("ads_mobile_photo")
            private String ads_banner_photo;

            @SerializedName("ads_mbanner_name")
            private String ads_mbanner_name;

            @SerializedName("ads_mbanner_ext")
            private String ads_mbanner_ext;


            @SerializedName("mobile_menu_link")
            private String mobile_menu_link;


            public String getAds_mbanner_name() {
                return ads_mbanner_name;
            }

            public void setAds_mbanner_name(String ads_mbanner_name) {
                this.ads_mbanner_name = ads_mbanner_name;
            }

            public String getAds_mbanner_ext() {
                return ads_mbanner_ext;
            }

            public void setAds_mbanner_ext(String ads_mbanner_ext) {
                this.ads_mbanner_ext = ads_mbanner_ext;
            }

            @SerializedName("id")
            private String id;


            public String getAds_banner_photo() {
                return ads_banner_photo;
            }

            public void setAds_banner_photo(String ads_banner_photo) {
                this.ads_banner_photo = ads_banner_photo;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }


            private String dealcode;

            private String deal_id;

            private String title;

            public String getDealcode() {
                return dealcode;
            }

            public void setDealcode(String dealcode) {
                this.dealcode = dealcode;
            }

            public String getDeal_id() {
                return deal_id;
            }

            public void setDeal_id(String deal_id) {
                this.deal_id = deal_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }


            public String getMobile_menu_link() {
                return mobile_menu_link;
            }

            public void setMobile_menu_link(String mobile_menu_link) {
                this.mobile_menu_link = mobile_menu_link;
            }


            @SerializedName("MenuItem")
            private menuitem menuItem;

            public menuitem getMenuItem() {
                return menuItem;
            }

            public void setMenuItem(menuitem menuItem) {
                this.menuItem = menuItem;
            }

            public class menuitem implements Serializable{

                private String menu_item_id;

                private String menu_item_name;

                private String category_id;

                private String category_name;


                private String mobile_step2_icon;


                private String mobile_step2_icon_ext;

                public String getMenu_item_id() {
                    return menu_item_id;
                }

                public void setMenu_item_id(String menu_item_id) {
                    this.menu_item_id = menu_item_id;
                }

                public String getMenu_item_name() {
                    return menu_item_name;
                }

                public void setMenu_item_name(String menu_item_name) {
                    this.menu_item_name = menu_item_name;
                }

                public String getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(String category_id) {
                    this.category_id = category_id;
                }

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
            }
        }


    }


}
