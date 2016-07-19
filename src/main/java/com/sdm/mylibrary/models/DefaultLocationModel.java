package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by jatindersi on 6/18/2015.
 */
public class DefaultLocationModel implements Serializable {



    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message="";

    @SerializedName("userdata")
    private userdata mLocation;

    public userdata getmLocation() {
        return mLocation;
    }

    public void setmLocation(userdata mLocation) {
        this.mLocation = mLocation;
    }

    public class userdata  implements Serializable{

        @SerializedName("formatted_address")
        private String formatted_address="";

        @SerializedName("latitude")
        private String latitude="";


        @SerializedName("longitude")
        private String longitude="";

        @SerializedName("street_number")
        private String street_number="";

        @SerializedName("street_address")
        private String street_address="";

        @SerializedName("city")
        private String city="";

        @SerializedName("state_name")
        private String state_name="";

        @SerializedName("country")
        private String country="";

        @SerializedName("zip_code")
        private String zip_code="";


        private String customer_suite;

        private String customer_suite_number;


        public String getCustomer_suite() {
            return customer_suite;
        }

        public void setCustomer_suite(String customer_suite) {
            this.customer_suite = customer_suite;
        }

        public String getCustomer_suite_number() {
            return customer_suite_number;
        }

        public void setCustomer_suite_number(String customer_suite_number) {
            this.customer_suite_number = customer_suite_number;
        }

        public String getStreet_number() {
            return street_number;
        }

        public void setStreet_number(String street_number) {
            this.street_number = street_number;
        }

        public String getStreet_address() {
            return street_address;
        }

        public void setStreet_address(String street_address) {
            this.street_address = street_address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState_name() {
            return state_name;
        }

        public void setState_name(String state_name) {
            this.state_name = state_name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getZip_code() {
            return zip_code;
        }

        public void setZip_code(String zip_code) {
            this.zip_code = zip_code;
        }

        public String getFormatted_address() {

            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }
    }

    @SerializedName("data")
    private ArrayList<Data> data;

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

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }


    public class Data implements Serializable{


//        @SerializedName("0")
//        private Distance distance;

        @SerializedName("OperatingPartnerLocation")
        private OperatingPartnerLocation operatingPartnerLocation;

//        public Distance getDistance() {
//            return distance;
//        }
//
//        public void setDistance(Distance distance) {
//            this.distance = distance;
//        }

        public OperatingPartnerLocation getOperatingPartnerLocation() {
            return operatingPartnerLocation;
        }

        public void setOperatingPartnerLocation(OperatingPartnerLocation operatingPartnerLocation) {
            this.operatingPartnerLocation = operatingPartnerLocation;
        }


        public class Distance implements Serializable{


        }

        public class OperatingPartnerLocation implements Serializable{
            @SerializedName("distance")
            private String distance="";

            @SerializedName("is_default")
            private String is_default="";

            public String getDistance() {
                if(distance==null ||distance.equalsIgnoreCase("") ){

                    distance="0.00";
                }
                return distance;
            }

            public void setDistance(String distance) {
                if(distance==null){
                    distance="";
                }
                this.distance = distance;
            }


            private String catering_delivery_distance;

            private String catering_setup_fee;

            private String catering_delivery_fee;

            private String is_lunch_dinner;

            public String getIs_lunch_dinner() {
                return is_lunch_dinner;
            }

            public void setIs_lunch_dinner(String is_lunch_dinner) {
                this.is_lunch_dinner = is_lunch_dinner;
            }

            public String getCatering_setup_fee() {
                return catering_setup_fee;
            }

            public void setCatering_setup_fee(String catering_setup_fee) {
                this.catering_setup_fee = catering_setup_fee;
            }

            public String getCatering_delivery_fee() {
                return catering_delivery_fee;
            }

            public void setCatering_delivery_fee(String catering_delivery_fee) {
                this.catering_delivery_fee = catering_delivery_fee;
            }

            private String group_delivery_distance;


            public String getCatering_delivery_distance() {

                if(catering_delivery_distance==null ||catering_delivery_distance.equalsIgnoreCase("") ){
                    catering_delivery_distance="0.00";
                }
                return catering_delivery_distance;
            }

            public void setCatering_delivery_distance(String catering_delivery_distance) {
                this.catering_delivery_distance = catering_delivery_distance;
            }

            public String getGroup_delivery_distance() {

                if(group_delivery_distance==null ||group_delivery_distance.equalsIgnoreCase("") ){
                    group_delivery_distance="0.00";
                }

                return group_delivery_distance;
            }

            public void setGroup_delivery_distance(String group_delivery_distance) {
                this.group_delivery_distance = group_delivery_distance;
            }

            public String getIs_default() {
                return is_default;
            }

            public void setIs_default(String is_default) {
                this.is_default = is_default;
            }
            @SerializedName("id")
            private String id="";

            @SerializedName("unique_op_location_number")
            private String unique_op_location_number="";


            private String yelp_id="";

            @SerializedName("name")
            private String name="";

            @SerializedName("location_name")
            private String location_name="";

            @SerializedName("is_catering")
            private String is_catering="";

            @SerializedName("operating_partner_id")
            private String operating_partner_id="";

            @SerializedName("street_address")
            private String street_address="";

            @SerializedName("Reviewtotal")
            private String Reviewtotal="";

            @SerializedName("city")
            private String city="";

            @SerializedName("zip_code")
            private String zip_code="";

            @SerializedName("state_id")
            private String state_id="";

            @SerializedName("pickup_radius")
            private String pickup_radius="";

            @SerializedName("timezone")
            private String timezone="";

            @SerializedName("mon_open_time")
            private String mon_open_time="";

            @SerializedName("mon_close_time")
            private String mon_close_time="";

            @SerializedName("open_future_time")
            private String open_future_time="";

            @SerializedName("tue_open_time")
            private String tue_open_time="";

            @SerializedName("tue_close_time")
            private String tue_close_time="";

            @SerializedName("wed_open_time")
            private String wed_open_time="";

            @SerializedName("wed_close_time")
            private String wed_close_time="";

            @SerializedName("thr_open_time")
            private String thr_open_time="";

            @SerializedName("thr_close_time")
            private String thr_close_time="";

            @SerializedName("fri_open_time")
            private String fri_open_time="";

            @SerializedName("fri_close_time")
            private String fri_close_time="";

            @SerializedName("sat_open_time")
            private String sat_open_time="";

            @SerializedName("sat_close_time")
            private String sat_close_time="";

            @SerializedName("sun_open_time")
            private String sun_open_time="";

            @SerializedName("sun_close_time")
            private String sun_close_time="";


            @SerializedName("is_open_close_time")
            private String is_open_close_time="";
            @SerializedName("num_ratings")
            private String num_ratings="";


            @SerializedName("consumer_min_order")
            private String min_order="";


            @SerializedName("catering_min_order")
            private String catering_min_order="";

            @SerializedName("group_min_order")
            private String group_min_order="";


            public String getCatering_min_order() {
                return catering_min_order;
            }

            public void setCatering_min_order(String catering_min_order) {
                this.catering_min_order = catering_min_order;
            }

            public String getGroup_min_order() {
                return group_min_order;
            }

            public void setGroup_min_order(String group_min_order) {
                this.group_min_order = group_min_order;
            }

            @SerializedName("delivery_fee")
            private String delivery_fee="";



            @SerializedName("pickup")
            private String pickup="";

            @SerializedName("delivery")
            private String delivery="";

            @SerializedName("catering")
            private String catering="";



            @SerializedName("latitude")
            private String latitude="";

            @SerializedName("longitude")
            private String longitude="";

            @SerializedName("close_hours")
            private String close_hours="";

            @SerializedName("close_minutes")
            private String close_minutes="";

            @SerializedName("close_meridian")
            private String close_meridian="";

            public String getClose_meridian() {
                return close_meridian;
            }

            public void setClose_meridian(String close_meridian) {
                this.close_meridian = close_meridian;
            }

            public String getClose_minutes() {
                return close_minutes;
            }

            public void setClose_minutes(String close_minutes) {
                this.close_minutes = close_minutes;
            }

            public String getClose_hours() {
                return close_hours;
            }

            public void setClose_hours(String close_hours) {
                this.close_hours = close_hours;
            }

            @SerializedName("open_meridian")
            private String open_meridian="";

            public String getOpen_meridian() {
                return open_meridian;
            }

            public void setOpen_meridian(String open_meridian) {
                this.open_meridian = open_meridian;
            }

            @SerializedName("open_minutes")
            private String open_minutes="";

            public String getOpen_minutes() {
                return open_minutes;
            }

            public void setOpen_minutes(String open_minutes) {
                this.open_minutes = open_minutes;
            }

            @SerializedName("real_date")
            private String real_date="";

            @SerializedName("open_hours")
            private String open_hours="";

            public String getOpen_hours() {
                return open_hours;
            }

            public void setOpen_hours(String open_hours) {
                this.open_hours = open_hours;
            }

            public String getReal_date() {
                return real_date;
            }

            public void setReal_date(String real_date) {
                this.real_date = real_date;
            }

            @SerializedName("sales_tax_rate")
            private String sales_tax_rate="";

            public String getSales_tax_rate() {
                if(sales_tax_rate.equalsIgnoreCase("")){
                    sales_tax_rate="0.0";
                }
                return sales_tax_rate;
            }

            public void setSales_tax_rate(String sales_tax_rate) {
                this.sales_tax_rate = sales_tax_rate;
            }

            @SerializedName("status")
            private String status="";


            @SerializedName("state_name")
            private String state_name="";

            @SerializedName("state_code")
            private String state_code="";

            @SerializedName("AVGrating")
            private String AVGrating="";

            @SerializedName("asap_datetime")
            private String asap_datetime;

            @SerializedName("business_phone")
            private String business_phone;

            public String getBusiness_phone() {
                return business_phone;
            }

            public void setBusiness_phone(String business_phone) {
                this.business_phone = business_phone;
            }

            public String getAsap_datetime() {
                return asap_datetime;
            }

            public void setAsap_datetime(String asap_datetime) {
                this.asap_datetime = asap_datetime;
            }

            @SerializedName("is_open")
            private String is_open="";

            @SerializedName("consumer_delivery_distance")
            private String delivery_radius;

            public String getDelivery_radius() {
                if(delivery_radius==null || delivery_radius.equalsIgnoreCase("")){

                    delivery_radius="";
                }
                return delivery_radius;
            }

            public void setDelivery_radius(String delivery_radius) {
                this.delivery_radius = delivery_radius;
            }

            @SerializedName("is_favourite")
            private String is_favourite;

            public String getIs_favourite() {
                return is_favourite;
            }

            public void setIs_favourite(String is_favourite) {
                this.is_favourite = is_favourite;
            }



            @SerializedName("group_order")
            private String group_order="";

            public String getGroup_order() {
                return group_order;
            }

            public void setGroup_order(String group_order) {
                this.group_order = group_order;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUnique_op_location_number() {
                return unique_op_location_number;
            }

            public void setUnique_op_location_number(String unique_op_location_number) {
                this.unique_op_location_number = unique_op_location_number;
            }



            public String getYelp_id() {
                return yelp_id;
            }

            public void setYelp_id(String yelp_id) {
                this.yelp_id = yelp_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLocation_name() {
                return location_name;
            }

            public void setLocation_name(String location_name) {
                this.location_name = location_name;
            }




            public String getOperating_partner_id() {
                return operating_partner_id;
            }

            public void setOperating_partner_id(String operating_partner_id) {
                this.operating_partner_id = operating_partner_id;
            }

            public String getStreet_address() {
                return street_address;
            }

            public void setStreet_address(String street_address) {
                this.street_address = street_address;
            }



            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getZip_code() {
                return zip_code;
            }

            public void setZip_code(String zip_code) {
                this.zip_code = zip_code;
            }

            public String getState_id() {
                return state_id;
            }

            public void setState_id(String state_id) {
                this.state_id = state_id;
            }



            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            public String getMon_open_time() {
                return mon_open_time;
            }

            public void setMon_open_time(String mon_open_time) {
                this.mon_open_time = mon_open_time;
            }

            public String getMon_close_time() {
                return mon_close_time;
            }

            public void setMon_close_time(String mon_close_time) {
                this.mon_close_time = mon_close_time;
            }

            public String getTue_open_time() {
                return tue_open_time;
            }

            public void setTue_open_time(String tue_open_time) {
                this.tue_open_time = tue_open_time;
            }

            public String getTue_close_time() {
                return tue_close_time;
            }

            public void setTue_close_time(String tue_close_time) {
                this.tue_close_time = tue_close_time;
            }

            public String getWed_open_time() {
                return wed_open_time;
            }

            public void setWed_open_time(String wed_open_time) {
                this.wed_open_time = wed_open_time;
            }

            public String getWed_close_time() {
                return wed_close_time;
            }

            public void setWed_close_time(String wed_close_time) {
                this.wed_close_time = wed_close_time;
            }

            public String getThr_open_time() {
                return thr_open_time;
            }

            public void setThr_open_time(String thr_open_time) {
                this.thr_open_time = thr_open_time;
            }

            public String getThr_close_time() {
                return thr_close_time;
            }

            public void setThr_close_time(String thr_close_time) {
                this.thr_close_time = thr_close_time;
            }

            public String getFri_open_time() {
                return fri_open_time;
            }

            public void setFri_open_time(String fri_open_time) {
                this.fri_open_time = fri_open_time;
            }

            public String getFri_close_time() {
                return fri_close_time;
            }

            public void setFri_close_time(String fri_close_time) {
                this.fri_close_time = fri_close_time;
            }

            public String getSat_open_time() {
                return sat_open_time;
            }

            public void setSat_open_time(String sat_open_time) {
                this.sat_open_time = sat_open_time;
            }

            public String getSat_close_time() {
                return sat_close_time;
            }

            public void setSat_close_time(String sat_close_time) {
                this.sat_close_time = sat_close_time;
            }

            public String getSun_open_time() {
                return sun_open_time;
            }

            public void setSun_open_time(String sun_open_time) {
                this.sun_open_time = sun_open_time;
            }

            public String getSun_close_time() {
                return sun_close_time;
            }

            public void setSun_close_time(String sun_close_time) {
                this.sun_close_time = sun_close_time;
            }




            public String getIs_open_close_time() {
                return is_open_close_time;
            }

            public void setIs_open_close_time(String is_open_close_time) {
                this.is_open_close_time = is_open_close_time;
            }


















            public String getNum_ratings() {
                return num_ratings;
            }

            public void setNum_ratings(String num_ratings) {
                this.num_ratings = num_ratings;
            }

            public String getPickup_radius() {
                if(pickup_radius.equalsIgnoreCase("")||pickup_radius==null ){

                    pickup_radius="0.0";
                }
                return pickup_radius;
            }

            public void setPickup_radius(String pickup_radius) {
                this.pickup_radius = pickup_radius;
            }

            public String getOpen_future_time() {
                return open_future_time;
            }

            public void setOpen_future_time(String open_future_time) {
                this.open_future_time = open_future_time;
            }

            public String getReviewtotal() {
                return Reviewtotal;
            }

            public void setReviewtotal(String reviewtotal) {
                Reviewtotal = reviewtotal;
            }



            public String getPickup() {
                return pickup;
            }

            public void setPickup(String pickup) {
                this.pickup = pickup;
            }

            public String getDelivery() {
                return delivery;
            }

            public void setDelivery(String delivery) {
                this.delivery = delivery;
            }

            public String getCatering() {
                return catering;
            }

            public void setCatering(String catering) {
                this.catering = catering;
            }

            public String getIs_catering() {
                return is_catering;
            }

            public void setIs_catering(String is_catering) {
                this.is_catering = is_catering;
            }
            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }






            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }






            public String getMin_order() {
                return min_order;
            }

            public void setMin_order(String min_order) {
                this.min_order = min_order;
            }

            public String getDelivery_fee() {
                if(delivery_fee==null && delivery_fee.equalsIgnoreCase("")){

                    delivery_fee="0.0";

                }
                return delivery_fee;
            }

            public void setDelivery_fee(String delivery_fee) {
                this.delivery_fee = delivery_fee;
            }



            public String getState_name() {
                return state_name;
            }

            public void setState_name(String state_name) {
                this.state_name = state_name;
            }

            public String getState_code() {
                return state_code;
            }

            public void setState_code(String state_code) {
                this.state_code = state_code;
            }

            public String getAVGrating() {
                if(AVGrating==null || AVGrating.equalsIgnoreCase("")){

                    AVGrating="0.0";
                }
                return AVGrating;
            }

            public void setAVGrating(String AVGrating) {
                this.AVGrating = AVGrating;
            }



            public String getIs_open() {
                return is_open;
            }

            public void setIs_open(String is_open) {
                this.is_open = is_open;
            }











        }
    }


}

