package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by sumeetb on 2/12/16.
 */
public class GetDefaultModel {


    private String status;

    private String message;


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

    @SerializedName("data")
    data Data;

    public data getData() {
        return Data;
    }

    public void setData(data data) {
        Data = data;
    }

    public class data {

        private String catering_delivery_fee;

        private String catering_setup_fee;

        private String consumer_delivery_fee;

        private String catering_order_days_limit;

        private String consumer_order_days_limit;

        private String go_order_days_limit;

        public String getCatering_delivery_fee() {
            return catering_delivery_fee;
        }

        public void setCatering_delivery_fee(String catering_delivery_fee) {
            this.catering_delivery_fee = catering_delivery_fee;
        }

        public String getCatering_setup_fee() {
            return catering_setup_fee;
        }

        public void setCatering_setup_fee(String catering_setup_fee) {
            this.catering_setup_fee = catering_setup_fee;
        }

        public String getConsumer_delivery_fee() {
            return consumer_delivery_fee;
        }

        public void setConsumer_delivery_fee(String consumer_delivery_fee) {
            this.consumer_delivery_fee = consumer_delivery_fee;
        }

        public String getCatering_order_days_limit() {
            return catering_order_days_limit;
        }

        public void setCatering_order_days_limit(String catering_order_days_limit) {
            this.catering_order_days_limit = catering_order_days_limit;
        }

        public String getConsumer_order_days_limit() {
            return consumer_order_days_limit;
        }

        public void setConsumer_order_days_limit(String consumer_order_days_limit) {
            this.consumer_order_days_limit = consumer_order_days_limit;
        }

        public String getGo_order_days_limit() {
            return go_order_days_limit;
        }

        public void setGo_order_days_limit(String go_order_days_limit) {
            this.go_order_days_limit = go_order_days_limit;
        }

        @SerializedName("dd_location_type")
        ArrayList<LocationType> locationArray = new ArrayList<>();

        public ArrayList<LocationType> getLocationArray() {
            return locationArray;
        }

        public void setLocationArray(ArrayList<LocationType> locationArray) {
            this.locationArray = locationArray;
        }

        public class LocationType {
            @SerializedName("key")
            private String id;

            @SerializedName("value")
            private String name;


            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return name;
            }
        }


    }


}
