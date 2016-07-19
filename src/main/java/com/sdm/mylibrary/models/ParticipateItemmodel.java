package com.sdm.mylibrary.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sumeetb on 9/7/15.
 */
public class ParticipateItemmodel {

    @Expose
    private String status;
    @Expose
    private String message;

    private String time_status;

    public String getTime_status() {
        return time_status;
    }

    public void setTime_status(String time_status) {
        this.time_status = time_status;
    }

    @Expose
    private Data data;

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The data
     */
    public Data getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(Data data) {
        this.data = data;
    }

    public class Data {

        @SerializedName("GroupOrderParticipant")
        GroupOrderParticipant goParticipant;

        public class GroupOrderParticipant{


            private String id;

            private String participant_id;

            private String order_for;

            private String order_type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getParticipant_id() {
                return participant_id;
            }

            public void setParticipant_id(String participant_id) {
                this.participant_id = participant_id;
            }

            public String getOrder_for() {
                return order_for;
            }

            public void setOrder_for(String order_for) {
                this.order_for = order_for;
            }

            public String getOrder_type() {
                return order_type;
            }

            public void setOrder_type(String order_type) {
                this.order_type = order_type;
            }
        }


        @SerializedName("OperatingPartnerLocation")
        DefaultLocationModel.Data.OperatingPartnerLocation item ;

        @SerializedName("GroupOrder")
        GroupOrder groupOrder;

        public GroupOrder getGroupOrder() {
            return groupOrder;
        }

        public void setGroupOrder(GroupOrder groupOrder) {
            this.groupOrder = groupOrder;
        }

        public GroupOrderParticipant getGoParticipant() {
            return goParticipant;
        }

        public void setGoParticipant(GroupOrderParticipant goParticipant) {
            this.goParticipant = goParticipant;
        }

        public DefaultLocationModel.Data.OperatingPartnerLocation getItem() {
            return item;
        }

        public void setItem(DefaultLocationModel.Data.OperatingPartnerLocation item) {
            this.item = item;
        }



        public class GroupOrder{

            @SerializedName("userdata")
            DefaultLocationModel.userdata userData;

            private String id;

            private String delivery_date;

            private String delivery_time;

            private String delivery_hour;

            private String delivery_min;
            private String time_meridian;

            private String datetime;

            private String order_type;

            private String org_mail;

            private String org_name;


            private String who_pays;


            private String max_amount;


            public DefaultLocationModel.userdata getUserData() {
                return userData;
            }

            public void setUserData(DefaultLocationModel.userdata userData) {
                this.userData = userData;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getDelivery_date() {
                return delivery_date;
            }

            public void setDelivery_date(String delivery_date) {
                this.delivery_date = delivery_date;
            }

            public String getDelivery_time() {
                return delivery_time;
            }

            public void setDelivery_time(String delivery_time) {
                this.delivery_time = delivery_time;
            }

            public String getDelivery_hour() {
                return delivery_hour;
            }

            public void setDelivery_hour(String delivery_hour) {
                this.delivery_hour = delivery_hour;
            }

            public String getDelivery_min() {
                return delivery_min;
            }

            public void setDelivery_min(String delivery_min) {
                this.delivery_min = delivery_min;
            }

            public String getTime_meridian() {
                return time_meridian;
            }

            public void setTime_meridian(String time_meridian) {
                this.time_meridian = time_meridian;
            }

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public String getOrder_type() {
                return order_type;
            }

            public void setOrder_type(String order_type) {
                this.order_type = order_type;
            }

            public String getOrg_mail() {
                return org_mail;
            }

            public void setOrg_mail(String org_mail) {
                this.org_mail = org_mail;
            }

            public String getOrg_name() {
                return org_name;
            }

            public void setOrg_name(String org_name) {
                this.org_name = org_name;
            }

            public String getWho_pays() {
                return who_pays;
            }

            public void setWho_pays(String who_pays) {
                this.who_pays = who_pays;
            }

            public String getMax_amount() {
                if(max_amount==null){
                    max_amount="";

                }
                return max_amount;
            }

            public void setMax_amount(String max_amount) {
                this.max_amount = max_amount;
            }
        }



    }
}
