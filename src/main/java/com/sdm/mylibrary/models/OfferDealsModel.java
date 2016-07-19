package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by sumeetb on 10/16/15.
 */
public class OfferDealsModel {

    @SerializedName("status")
    private String  mStatus;

    @SerializedName("message")
    private String mMessage;

    @SerializedName("data")
    private ArrayList<data> mData;

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public ArrayList<data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<data> mData) {
        this.mData = mData;
    }

   public class data{

       @SerializedName("Deal")
       private deal mdeal;

       public deal getMdeal() {
           return mdeal;
       }

       public void setMdeal(deal mdeal) {
           this.mdeal = mdeal;
       }

       public class deal {


           private String id;

           private String deal_id;

           private String title;

           private String duration;

           private String campcode;

           private String enddate;

           private String yellow_image;

           private String yellow_title1;

           private String yellow_title2;

           private String yellow_description;

           private String yellow_order;

           private String dealcode;

           private String deal_consumer;

           private String share_link;


           private String deal_group;

           public String getShare_link() {
               return share_link;
           }

           public void setShare_link(String share_link) {
               this.share_link = share_link;
           }

           public String getId() {
               return id;
           }

           public void setId(String id) {
               this.id = id;
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

           public String getDuration() {
               return duration;
           }

           public void setDuration(String duration) {
               this.duration = duration;
           }

           public String getCampcode() {
               return campcode;
           }

           public void setCampcode(String campcode) {
               this.campcode = campcode;
           }

           public String getEnddate() {
               return enddate;
           }

           public void setEnddate(String enddate) {
               this.enddate = enddate;
           }

           public String getYellow_image() {
               return yellow_image;
           }

           public void setYellow_image(String yellow_image) {
               this.yellow_image = yellow_image;
           }

           public String getYellow_title1() {
               return yellow_title1;
           }

           public void setYellow_title1(String yellow_title1) {
               this.yellow_title1 = yellow_title1;
           }

           public String getYellow_title2() {
               return yellow_title2;
           }

           public void setYellow_title2(String yellow_title2) {
               this.yellow_title2 = yellow_title2;
           }

           public String getYellow_description() {
               return yellow_description;
           }

           public void setYellow_description(String yellow_description) {
               this.yellow_description = yellow_description;
           }

           public String getYellow_order() {
               return yellow_order;
           }

           public void setYellow_order(String yellow_order) {
               this.yellow_order = yellow_order;
           }

           public String getDealcode() {
               return dealcode;
           }

           public void setDealcode(String dealcode) {
               this.dealcode = dealcode;
           }

           public String getDeal_consumer() {
               return deal_consumer;
           }

           public void setDeal_consumer(String deal_consumer) {
               this.deal_consumer = deal_consumer;
           }

           public String getDeal_group() {
               return deal_group;
           }

           public void setDeal_group(String deal_group) {
               this.deal_group = deal_group;
           }

       }
   }

}
