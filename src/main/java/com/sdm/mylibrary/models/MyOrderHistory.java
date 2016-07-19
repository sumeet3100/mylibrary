package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by jatindersi on 5/21/2015.
 */
public class MyOrderHistory
{
    @SerializedName("status")
    private String  mStatus;

    @SerializedName("message")
    private String mMessage;

//    @SerializedName("data")
    @SerializedName("order")
    private ArrayList<Data> mOrderHistoryList;

    public ArrayList<Data> getmOrderHistoryList() {
        return mOrderHistoryList;
    }

    public void setmOrderHistoryList(ArrayList<Data> mOrderHistoryList) {
        this.mOrderHistoryList = mOrderHistoryList;
    }

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

    public class Data
    {
        @SerializedName("Order")
        private Orders Orderdata;

        public Orders getOrderdata() {
            return Orderdata;
        }

        public void setOrderdata(Orders orderdata) {
            Orderdata = orderdata;
        }

        public class Orders
        {


            private  String favorite_order_id;

            public String getFavorite_order_id() {
                return favorite_order_id;
            }

            public void setFavorite_order_id(String favorite_order_id) {
                this.favorite_order_id = favorite_order_id;
            }

            @SerializedName("order_name")
            private String order_title;
            @SerializedName("id")
            private String order_id;
            @SerializedName("order_date_format")
            private String order_date;
            @SerializedName("grand_total")
            private String  order_total;
            @SerializedName("location_name")
            private String order_restaurant;

            @SerializedName("rating")
            private String order_rating;
            public void setTitle(String title)
            {
                this.order_title=title;
            }

            public String getTitle() {
                return order_title;
            }
            public void setID(String orderid)
            {
                this.order_id=orderid;
            }

            public String getID() {
                return order_id;
            }
            public void setDate(String order_date)
            {
                this.order_date=order_date;
            }
            public String getDate()
            {
                return order_date;
            }
            public String getTotal() {
                return order_total;
            }
            public void setTotal(String total)
            {
                this.order_total =total;
            }
            public void setRestaruant(String resturant)
            {
                this.order_restaurant=resturant;
            }
            public String getRestaruant()
            {
                return order_restaurant;
            }

            public String getRating()
            {
                return order_rating;
            }
            public void setRating(String rating)
            {
                this.order_rating=rating;
            }
        }

    }


    private int page_limit;

    public int getPage_limit() {
        return page_limit;
    }

    public void setPage_limit(int page_limit) {
        this.page_limit = page_limit;
    }
}
