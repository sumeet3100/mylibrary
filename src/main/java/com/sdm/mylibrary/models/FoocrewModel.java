package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jagdeeps on 5/21/2015.
 */
public class FoocrewModel {


    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private Data data;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }



    public class Data{


        @SerializedName("FoocrewPoint")
        FoocrewPoint foocrewPoint;



        public FoocrewPoint getFoocrewPoint() {
            return foocrewPoint;
        }

        public void setFoocrewPoint(FoocrewPoint foocrewPoint) {
            this.foocrewPoint = foocrewPoint;
        }

        public class FoocrewPoint {




            @SerializedName("totalReferalPoint")
            private String totalReferalPoint;

            @SerializedName("totalOrderEarnedPoints")
            private String totalOrderEarnedPoints;

            @SerializedName("totalOrderFeedbackRatingPoints")
            private String totalOrderFeedbackRatingPoints;

            @SerializedName("totalShareOnFacebook")
            private String totalShareOnFacebook;

            @SerializedName("totalfoopointsByAdmin")
            private String totalfoopointsByAdmin;

            @SerializedName("crewDealCode")
            private String crewDealCode;

            @SerializedName("foopoint_status")
            private String foopoint_status;

            @SerializedName("foobuck_earned")
            private String foobuck_earned;

            @SerializedName("foobuck_available")
            private String foobuck_available;






            public String getTotalReferalPoint() {
                return totalReferalPoint;
            }

            public void setTotalReferalPoint(String totalReferalPoint) {
                this.totalReferalPoint = totalReferalPoint;
            }

            public String getTotalOrderEarnedPoints() {
                return totalOrderEarnedPoints;
            }

            public void setTotalOrderEarnedPoints(String totalOrderEarnedPoints) {
                this.totalOrderEarnedPoints = totalOrderEarnedPoints;
            }

            public String getTotalOrderFeedbackRatingPoints() {
                return totalOrderFeedbackRatingPoints;
            }

            public void setTotalOrderFeedbackRatingPoints(String totalOrderFeedbackRatingPoints) {
                this.totalOrderFeedbackRatingPoints = totalOrderFeedbackRatingPoints;
            }

            public String getTotalShareOnFacebook() {
                return totalShareOnFacebook;
            }

            public void setTotalShareOnFacebook(String totalShareOnFacebook) {
                this.totalShareOnFacebook = totalShareOnFacebook;
            }

            public String getTotalfoopointsByAdmin() {
                return totalfoopointsByAdmin;
            }

            public void setTotalfoopointsByAdmin(String totalfoopointsByAdmin) {
                this.totalfoopointsByAdmin = totalfoopointsByAdmin;
            }

            public String getCrewDealCode() {
                return crewDealCode;
            }

            public void setCrewDealCode(String crewDealCode) {
                this.crewDealCode = crewDealCode;
            }

            public String getFoopoint_status() {
                return foopoint_status;
            }

            public void setFoopoint_status(String foopoint_status) {
                this.foopoint_status = foopoint_status;
            }

            public String getFoobuck_earned() {
                return foobuck_earned;
            }

            public void setFoobuck_earned(String foobuck_earned) {
                this.foobuck_earned = foobuck_earned;
            }

            public String getFoobuck_available() {
                return foobuck_available;
            }

            public void setFoobuck_available(String foobuck_available) {
                this.foobuck_available = foobuck_available;
            }



        }
        @SerializedName("Customer")
        private Customer mCustomer;



        public Customer getmCustomer() {
            return mCustomer;
        }

        public void setmCustomer(Customer mCustomer) {
            this.mCustomer = mCustomer;
        }

        public class Customer{



            @SerializedName("total_reward_points")
            private String total_reward_points;

            @SerializedName("used_points")
            private String used_points;

            @SerializedName("unuse_points")
            private String unuse_points;

            public String getTotal_reward_points() {
                return total_reward_points;
            }

            public void setTotal_reward_points(String total_reward_points) {
                this.total_reward_points = total_reward_points;
            }

            public String getUsed_points() {
                return used_points;
            }

            public void setUsed_points(String used_points) {
                this.used_points = used_points;
            }

            public String getUnuse_points() {
                return unuse_points;
            }

            public void setUnuse_points(String unuse_points) {
                this.unuse_points = unuse_points;
            }



        }



        @SerializedName("Order")
        private Order order;


        public Order getOrder() {
            return order;
        }

        public void setOrder(Order order) {
            this.order = order;
        }


        public class Order{



            @SerializedName("totalOrders")
            private String totalOrders;

            @SerializedName("orderTotal")
            private String orderTotal;

            @SerializedName("avgOrderValue")
            private String avgOrderValue;


            public String getTotalOrders() {
                return totalOrders;
            }

            public void setTotalOrders(String totalOrders) {
                this.totalOrders = totalOrders;
            }

            public String getOrderTotal() {
                return orderTotal;
            }

            public void setOrderTotal(String orderTotal) {
                this.orderTotal = orderTotal;
            }

            public String getAvgOrderValue() {
                return avgOrderValue;
            }

            public void setAvgOrderValue(String avgOrderValue) {
                this.avgOrderValue = avgOrderValue;
            }






        }



        @SerializedName("OperatingPartnerReview")
        private OperatingPartnerReview operatingPartnerReview;

        public OperatingPartnerReview getOperatingPartnerReview() {
            return operatingPartnerReview;
        }

        public void setOperatingPartnerReview(OperatingPartnerReview operatingPartnerReview) {
            this.operatingPartnerReview = operatingPartnerReview;
        }





        public class OperatingPartnerReview{

            @SerializedName("totalReviews")
            private String totalReviews;

            @SerializedName("unratedReviews")
            private String unratedReviews;


            public String getTotalReviews() {
                return totalReviews;
            }

            public void setTotalReviews(String totalReviews) {
                this.totalReviews = totalReviews;
            }

            public String getUnratedReviews() {
                return unratedReviews;
            }

            public void setUnratedReviews(String unratedReviews) {
                this.unratedReviews = unratedReviews;
            }



        }




        @SerializedName("ReferralUser")
        private ReferralUser referralUser;


        public ReferralUser getReferralUser() {
            return referralUser;
        }

        public void setReferralUser(ReferralUser referralUser) {
            this.referralUser = referralUser;
        }




        public class ReferralUser{


            @SerializedName("invite_friends")
            private String invite_friends;

            @SerializedName("friend_orders")
            private String friend_orders;

            public String getInvite_friends() {
                return invite_friends;
            }

            public void setInvite_friends(String invite_friends) {
                this.invite_friends = invite_friends;
            }

            public String getFriend_orders() {
                return friend_orders;
            }

            public void setFriend_orders(String friend_orders) {
                this.friend_orders = friend_orders;
            }






        }


    }
}
