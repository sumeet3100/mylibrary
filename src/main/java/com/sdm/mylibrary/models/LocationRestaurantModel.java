package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by jagdeeps on 5/29/2015.
 */
public class LocationRestaurantModel implements Serializable{



    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message="";

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


        @SerializedName("0")
        private Distance distance;

        @SerializedName("OperatingPartnerLocation")
        private OperatingPartnerLocation operatingPartnerLocation;

        public Distance getDistance() {
            return distance;
        }

        public void setDistance(Distance distance) {
            this.distance = distance;
        }

        public OperatingPartnerLocation getOperatingPartnerLocation() {
            return operatingPartnerLocation;
        }

        public void setOperatingPartnerLocation(OperatingPartnerLocation operatingPartnerLocation) {
            this.operatingPartnerLocation = operatingPartnerLocation;
        }


        public class Distance implements Serializable{

            @SerializedName("distance")
            private String distance="";

            @SerializedName("is_default")
            private String is_default="";

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public String getIs_default() {
                return is_default;
            }

            public void setIs_default(String is_default) {
                this.is_default = is_default;
            }
        }

        public class OperatingPartnerLocation implements Serializable{

            @SerializedName("id")
           private String id="";



            @SerializedName("distance")
            private String distance="";

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            @SerializedName("unique_op_location_number")
            private String unique_op_location_number="";

            @SerializedName("market_id")
            private String market_id="";

            @SerializedName("location_id")
            private String location_id="";

            @SerializedName("yelp_id")
            private String yelp_id="";

            @SerializedName("name")
            private String name="";

            @SerializedName("location_name")
            private String location_name="";

            @SerializedName("meta_keywords")
            private String meta_keywords="";

            @SerializedName("meta_description")
            private String meta_description="";

            @SerializedName("logo")
            private String logo="";

            @SerializedName("operating_partner_id")
            private String operating_partner_id="";

            @SerializedName("street_address")
            private String street_address="";

            @SerializedName("apt_code")
            private String apt_code="";

            @SerializedName("apt_value")
            private String apt_value="";

            @SerializedName("suite")
            private String suite="";

            @SerializedName("city")
            private String city="";

            @SerializedName("zip_code")
            private String zip_code="";

            @SerializedName("state_id")
            private String state_id="";

            @SerializedName("business_phone")
            private String business_phone="";

            @SerializedName("business_fax")
            private String business_fax="";

            @SerializedName("timezone")
            private String timezone="";

            @SerializedName("mon_open_time")
            private String mon_open_time="";

            @SerializedName("mon_close_time")
            private String mon_close_time="";

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

            @SerializedName("dinner_mon_open_time")
            private String dinner_mon_open_time="";

            @SerializedName("dinner_mon_close_time")
            private String dinner_mon_close_time="";

            @SerializedName("dinner_tue_open_time")
            private String dinner_tue_open_time="";

            @SerializedName("dinner_tue_close_time")
            private String dinner_tue_close_time="";

            @SerializedName("dinner_wed_open_time")
            private String dinner_wed_open_time="";

            @SerializedName("dinner_wed_close_time")
            private String dinner_wed_close_time="";

            @SerializedName("dinner_thr_open_time")
            private String dinner_thr_open_time="";

            @SerializedName("dinner_thr_close_time")
            private String dinner_thr_close_time="";

            @SerializedName("dinner_fri_open_time")
            private String dinner_fri_open_time="";

            @SerializedName("dinner_fri_close_time")
            private String dinner_fri_close_time="";

            @SerializedName("dinner_sat_open_time")
            private String dinner_sat_open_time="";

            @SerializedName("dinner_sat_close_time")
            private String dinner_sat_close_time="";

            @SerializedName("dinner_sun_open_time")
            private String dinner_sun_open_time="";

            @SerializedName("dinner_sun_close_time")
            private String dinner_sun_close_time="";

            @SerializedName("is_mon_closed")
            private String is_mon_closed="";

            @SerializedName("is_tue_closed")
            private String is_tue_closed="";

            @SerializedName("is_wed_closed")
            private String is_wed_closed="";

            @SerializedName("is_thr_closed")
            private String is_thr_closed="";

            @SerializedName("is_fri_closed")
            private String is_fri_closed="";

            @SerializedName("is_sat_closed")
            private String is_sat_closed="";

            @SerializedName("is_sun_closed")
            private String is_sun_closed="";

            @SerializedName("rsp_percentage")
            private String rsp_percentage="";

            @SerializedName("rsp_update_frequency")
            private String rsp_update_frequency="";

            @SerializedName("rsp_last_updated")
            private String rsp_last_updated="";

            @SerializedName("volume_target")
            private String volume_target="";

            @SerializedName("volume_target_frquency")
            private String volume_target_frquency="";

            @SerializedName("capacity_available")
            private String capacity_available="";

            @SerializedName("created")
            private String created="";

            @SerializedName("modified")
            private String modified="";

            @SerializedName("delivery_driver_rating_avg")
            private String delivery_driver_rating_avg="";

            @SerializedName("delivery_time_rating_avg")
            private String delivery_time_rating_avg="";

            @SerializedName("food_quality_rating_avg")
            private String food_quality_rating_avg="";

            @SerializedName("presentation_rating_avg")
            private String presentation_rating_avg="";

            @SerializedName("overall_rating_avg")
            private String overall_rating_avg="";

            @SerializedName("num_ratings")
            private String num_ratings="";

            @SerializedName("is_accepting_order")
            private String is_accepting_order="";

            @SerializedName("is_accepting_order_fax")
            private String is_accepting_order_fax="";

            @SerializedName("min_order")
            private String min_order="";

            @SerializedName("delivery_fee")
            private String delivery_fee="";

            @SerializedName("pickup")
            private String pickup="";

            @SerializedName("delivery")
            private String delivery="";

            @SerializedName("catering")
            private String catering="";

            @SerializedName("delivery_radius")
            private String delivery_radius="";

            @SerializedName("pickup_radius")
            private String pickup_radius="";

            @SerializedName("latitude")
            private String latitude="";

            @SerializedName("longitude")
            private String longitude="";

            @SerializedName("estimated_delivery_time")
            private String estimated_delivery_time="";

            @SerializedName("sales_tax_rate")
            private String sales_tax_rate="";

            @SerializedName("tax_id")
            private String tax_id="";

            @SerializedName("restaurant_url")
            private String restaurant_url="";

            @SerializedName("short_url")
            private String short_url="";

            @SerializedName("pork_status")
            private String pork_status="";

            @SerializedName("coke_status")
            private String coke_status="";

            @SerializedName("pepsi_status")
            private String pepsi_status="";

            @SerializedName("donut_status")
            private String donut_status="";

            @SerializedName("fax_order")
            private String fax_order="";

            @SerializedName("status")
            private String status="";

            @SerializedName("delivery_fee_1_3")
            private String delivery_fee_1_3="";

            @SerializedName("delivery_fee_3_4")
            private String delivery_fee_3_4="";

            @SerializedName("delivery_fee_4_5")
            private String delivery_fee_4_5="";

            @SerializedName("delivery_fee_5_6")
            private String delivery_fee_5_6="";

            @SerializedName("delivery_fee_6_8")
            private String delivery_fee_6_8="";

            @SerializedName("delivery_fee_8_9")
            private String  delivery_fee_8_9="";

            @SerializedName("delivery_fee_9_10")
            private String delivery_fee_9_10="";

            @SerializedName("delivery_fee_10_11")
            private String delivery_fee_10_11="";

            @SerializedName("delivery_fee_11_plus")
            private String delivery_fee_11_plus="";

            @SerializedName("state_name")
            private String state_name="";

            @SerializedName("state_code")
            private String state_code="";

            @SerializedName("AVGrating")
            private String AVGrating="";

            @SerializedName("Reviewtotal")
            private String Reviewtotal="";

            @SerializedName("is_catering")
            private String is_catering="";

            @SerializedName("is_open")
            private String is_open="";

            @SerializedName("is_open_close_time")
            private String is_open_close_time="";

            @SerializedName("is_lunch_dinner")
            private String is_lunch_dinner="";

            @SerializedName("current_time")
            private String  current_time="";

            @SerializedName("selected_date")
            private String selected_date="";

            @SerializedName("real_date")
            private String real_date="";

            @SerializedName("del_date")
            private String del_date="";

            @SerializedName("open_time")
            private String open_time="";

            @SerializedName("close_time")
            private String close_time="";

            @SerializedName("open_hours")
            private String open_hours="";

            @SerializedName("open_minutes")
            private String open_minutes="";

            @SerializedName("open_meridian")
            private String open_meridian="";

            @SerializedName("open_future_time")
            private String open_future_time="";

            @SerializedName("close_hours")
            private String close_hours="";

            @SerializedName("close_minutes")
            private String close_minutes="";

            @SerializedName("close_meridian")
            private String  close_meridian="";

            @SerializedName("close_future_time")
            private String close_future_time="";

            @SerializedName("service_type")
            private String service_type="";

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

            public String getMarket_id() {
                return market_id;
            }

            public void setMarket_id(String market_id) {
                this.market_id = market_id;
            }

            public String getLocation_id() {
                return location_id;
            }

            public void setLocation_id(String location_id) {
                this.location_id = location_id;
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

            public String getMeta_keywords() {
                return meta_keywords;
            }

            public void setMeta_keywords(String meta_keywords) {
                this.meta_keywords = meta_keywords;
            }

            public String getMeta_description() {
                return meta_description;
            }

            public void setMeta_description(String meta_description) {
                this.meta_description = meta_description;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
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

            public String getApt_code() {
                return apt_code;
            }

            public void setApt_code(String apt_code) {
                this.apt_code = apt_code;
            }

            public String getApt_value() {
                return apt_value;
            }

            public void setApt_value(String apt_value) {
                this.apt_value = apt_value;
            }

            public String getSuite() {
                return suite;
            }

            public void setSuite(String suite) {
                this.suite = suite;
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

            public String getBusiness_phone() {
                return business_phone;
            }

            public void setBusiness_phone(String business_phone) {
                this.business_phone = business_phone;
            }

            public String getBusiness_fax() {
                return business_fax;
            }

            public void setBusiness_fax(String business_fax) {
                this.business_fax = business_fax;
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

            public String getDinner_mon_open_time() {
                return dinner_mon_open_time;
            }

            public void setDinner_mon_open_time(String dinner_mon_open_time) {
                this.dinner_mon_open_time = dinner_mon_open_time;
            }

            public String getDinner_mon_close_time() {
                return dinner_mon_close_time;
            }

            public void setDinner_mon_close_time(String dinner_mon_close_time) {
                this.dinner_mon_close_time = dinner_mon_close_time;
            }

            public String getDinner_tue_open_time() {
                return dinner_tue_open_time;
            }

            public void setDinner_tue_open_time(String dinner_tue_open_time) {
                this.dinner_tue_open_time = dinner_tue_open_time;
            }

            public String getDinner_tue_close_time() {
                return dinner_tue_close_time;
            }

            public void setDinner_tue_close_time(String dinner_tue_close_time) {
                this.dinner_tue_close_time = dinner_tue_close_time;
            }

            public String getDinner_wed_open_time() {
                return dinner_wed_open_time;
            }

            public void setDinner_wed_open_time(String dinner_wed_open_time) {
                this.dinner_wed_open_time = dinner_wed_open_time;
            }

            public String getDinner_wed_close_time() {
                return dinner_wed_close_time;
            }

            public void setDinner_wed_close_time(String dinner_wed_close_time) {
                this.dinner_wed_close_time = dinner_wed_close_time;
            }

            public String getDinner_thr_open_time() {
                return dinner_thr_open_time;
            }

            public void setDinner_thr_open_time(String dinner_thr_open_time) {
                this.dinner_thr_open_time = dinner_thr_open_time;
            }

            public String getDinner_thr_close_time() {
                return dinner_thr_close_time;
            }

            public void setDinner_thr_close_time(String dinner_thr_close_time) {
                this.dinner_thr_close_time = dinner_thr_close_time;
            }

            public String getDinner_fri_open_time() {
                return dinner_fri_open_time;
            }

            public void setDinner_fri_open_time(String dinner_fri_open_time) {
                this.dinner_fri_open_time = dinner_fri_open_time;
            }

            public String getDinner_fri_close_time() {
                return dinner_fri_close_time;
            }

            public void setDinner_fri_close_time(String dinner_fri_close_time) {
                this.dinner_fri_close_time = dinner_fri_close_time;
            }

            public String getDinner_sat_open_time() {
                return dinner_sat_open_time;
            }

            public void setDinner_sat_open_time(String dinner_sat_open_time) {
                this.dinner_sat_open_time = dinner_sat_open_time;
            }

            public String getDinner_sat_close_time() {
                return dinner_sat_close_time;
            }

            public void setDinner_sat_close_time(String dinner_sat_close_time) {
                this.dinner_sat_close_time = dinner_sat_close_time;
            }

            public String getDinner_sun_open_time() {
                return dinner_sun_open_time;
            }

            public void setDinner_sun_open_time(String dinner_sun_open_time) {
                this.dinner_sun_open_time = dinner_sun_open_time;
            }

            public String getDinner_sun_close_time() {
                return dinner_sun_close_time;
            }

            public void setDinner_sun_close_time(String dinner_sun_close_time) {
                this.dinner_sun_close_time = dinner_sun_close_time;
            }

            public String getIs_mon_closed() {
                return is_mon_closed;
            }

            public void setIs_mon_closed(String is_mon_closed) {
                this.is_mon_closed = is_mon_closed;
            }

            public String getIs_tue_closed() {
                return is_tue_closed;
            }

            public void setIs_tue_closed(String is_tue_closed) {
                this.is_tue_closed = is_tue_closed;
            }

            public String getIs_wed_closed() {
                return is_wed_closed;
            }

            public void setIs_wed_closed(String is_wed_closed) {
                this.is_wed_closed = is_wed_closed;
            }

            public String getIs_thr_closed() {
                return is_thr_closed;
            }

            public void setIs_thr_closed(String is_thr_closed) {
                this.is_thr_closed = is_thr_closed;
            }

            public String getIs_fri_closed() {
                return is_fri_closed;
            }

            public void setIs_fri_closed(String is_fri_closed) {
                this.is_fri_closed = is_fri_closed;
            }

            public String getIs_sat_closed() {
                return is_sat_closed;
            }

            public void setIs_sat_closed(String is_sat_closed) {
                this.is_sat_closed = is_sat_closed;
            }

            public String getIs_sun_closed() {
                return is_sun_closed;
            }

            public void setIs_sun_closed(String is_sun_closed) {
                this.is_sun_closed = is_sun_closed;
            }

            public String getRsp_percentage() {
                return rsp_percentage;
            }

            public void setRsp_percentage(String rsp_percentage) {
                this.rsp_percentage = rsp_percentage;
            }

            public String getRsp_update_frequency() {
                return rsp_update_frequency;
            }

            public void setRsp_update_frequency(String rsp_update_frequency) {
                this.rsp_update_frequency = rsp_update_frequency;
            }

            public String getRsp_last_updated() {
                return rsp_last_updated;
            }

            public void setRsp_last_updated(String rsp_last_updated) {
                this.rsp_last_updated = rsp_last_updated;
            }

            public String getVolume_target() {
                return volume_target;
            }

            public void setVolume_target(String volume_target) {
                this.volume_target = volume_target;
            }

            public String getVolume_target_frquency() {
                return volume_target_frquency;
            }

            public void setVolume_target_frquency(String volume_target_frquency) {
                this.volume_target_frquency = volume_target_frquency;
            }

            public String getCapacity_available() {
                return capacity_available;
            }

            public void setCapacity_available(String capacity_available) {
                this.capacity_available = capacity_available;
            }

            public String getCreated() {
                return created;
            }

            public void setCreated(String created) {
                this.created = created;
            }

            public String getModified() {
                return modified;
            }

            public void setModified(String modified) {
                this.modified = modified;
            }

            public String getDelivery_driver_rating_avg() {
                return delivery_driver_rating_avg;
            }

            public void setDelivery_driver_rating_avg(String delivery_driver_rating_avg) {
                this.delivery_driver_rating_avg = delivery_driver_rating_avg;
            }

            public String getDelivery_time_rating_avg() {
                return delivery_time_rating_avg;
            }

            public void setDelivery_time_rating_avg(String delivery_time_rating_avg) {
                this.delivery_time_rating_avg = delivery_time_rating_avg;
            }

            public String getFood_quality_rating_avg() {
                return food_quality_rating_avg;
            }

            public void setFood_quality_rating_avg(String food_quality_rating_avg) {
                this.food_quality_rating_avg = food_quality_rating_avg;
            }

            public String getPresentation_rating_avg() {
                return presentation_rating_avg;
            }

            public void setPresentation_rating_avg(String presentation_rating_avg) {
                this.presentation_rating_avg = presentation_rating_avg;
            }

            public String getOverall_rating_avg() {
                return overall_rating_avg;
            }

            public void setOverall_rating_avg(String overall_rating_avg) {
                this.overall_rating_avg = overall_rating_avg;
            }

            public String getNum_ratings() {
                return num_ratings;
            }

            public void setNum_ratings(String num_ratings) {
                this.num_ratings = num_ratings;
            }

            public String getIs_accepting_order() {
                return is_accepting_order;
            }

            public void setIs_accepting_order(String is_accepting_order) {
                this.is_accepting_order = is_accepting_order;
            }

            public String getIs_accepting_order_fax() {
                return is_accepting_order_fax;
            }

            public void setIs_accepting_order_fax(String is_accepting_order_fax) {
                this.is_accepting_order_fax = is_accepting_order_fax;
            }

            public String getMin_order() {
                return min_order;
            }

            public void setMin_order(String min_order) {
                this.min_order = min_order;
            }

            public String getDelivery_fee() {
                return delivery_fee;
            }

            public void setDelivery_fee(String delivery_fee) {
                this.delivery_fee = delivery_fee;
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

            public String getDelivery_radius() {
                return delivery_radius;
            }

            public void setDelivery_radius(String delivery_radius) {
                this.delivery_radius = delivery_radius;
            }

            public String getPickup_radius() {
                return pickup_radius;
            }

            public void setPickup_radius(String pickup_radius) {
                this.pickup_radius = pickup_radius;
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

            public String getEstimated_delivery_time() {
                return estimated_delivery_time;
            }

            public void setEstimated_delivery_time(String estimated_delivery_time) {
                this.estimated_delivery_time = estimated_delivery_time;
            }

            public String getSales_tax_rate() {
                return sales_tax_rate;
            }

            public void setSales_tax_rate(String sales_tax_rate) {
                this.sales_tax_rate = sales_tax_rate;
            }

            public String getTax_id() {
                return tax_id;
            }

            public void setTax_id(String tax_id) {
                this.tax_id = tax_id;
            }

            public String getRestaurant_url() {
                return restaurant_url;
            }

            public void setRestaurant_url(String restaurant_url) {
                this.restaurant_url = restaurant_url;
            }

            public String getShort_url() {
                return short_url;
            }

            public void setShort_url(String short_url) {
                this.short_url = short_url;
            }

            public String getPork_status() {
                return pork_status;
            }

            public void setPork_status(String pork_status) {
                this.pork_status = pork_status;
            }

            public String getCoke_status() {
                return coke_status;
            }

            public void setCoke_status(String coke_status) {
                this.coke_status = coke_status;
            }

            public String getPepsi_status() {
                return pepsi_status;
            }

            public void setPepsi_status(String pepsi_status) {
                this.pepsi_status = pepsi_status;
            }

            public String getDonut_status() {
                return donut_status;
            }

            public void setDonut_status(String donut_status) {
                this.donut_status = donut_status;
            }

            public String getFax_order() {
                return fax_order;
            }

            public void setFax_order(String fax_order) {
                this.fax_order = fax_order;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDelivery_fee_1_3() {
                return delivery_fee_1_3;
            }

            public void setDelivery_fee_1_3(String delivery_fee_1_3) {
                this.delivery_fee_1_3 = delivery_fee_1_3;
            }

            public String getDelivery_fee_3_4() {
                return delivery_fee_3_4;
            }

            public void setDelivery_fee_3_4(String delivery_fee_3_4) {
                this.delivery_fee_3_4 = delivery_fee_3_4;
            }

            public String getDelivery_fee_4_5() {
                return delivery_fee_4_5;
            }

            public void setDelivery_fee_4_5(String delivery_fee_4_5) {
                this.delivery_fee_4_5 = delivery_fee_4_5;
            }

            public String getDelivery_fee_5_6() {
                return delivery_fee_5_6;
            }

            public void setDelivery_fee_5_6(String delivery_fee_5_6) {
                this.delivery_fee_5_6 = delivery_fee_5_6;
            }

            public String getDelivery_fee_6_8() {
                return delivery_fee_6_8;
            }

            public void setDelivery_fee_6_8(String delivery_fee_6_8) {
                this.delivery_fee_6_8 = delivery_fee_6_8;
            }

            public String getDelivery_fee_8_9() {
                return delivery_fee_8_9;
            }

            public void setDelivery_fee_8_9(String delivery_fee_8_9) {
                this.delivery_fee_8_9 = delivery_fee_8_9;
            }

            public String getDelivery_fee_9_10() {
                return delivery_fee_9_10;
            }

            public void setDelivery_fee_9_10(String delivery_fee_9_10) {
                this.delivery_fee_9_10 = delivery_fee_9_10;
            }

            public String getDelivery_fee_10_11() {
                return delivery_fee_10_11;
            }

            public void setDelivery_fee_10_11(String delivery_fee_10_11) {
                this.delivery_fee_10_11 = delivery_fee_10_11;
            }

            public String getDelivery_fee_11_plus() {
                return delivery_fee_11_plus;
            }

            public void setDelivery_fee_11_plus(String delivery_fee_11_plus) {
                this.delivery_fee_11_plus = delivery_fee_11_plus;
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
                return AVGrating;
            }

            public void setAVGrating(String AVGrating) {
                this.AVGrating = AVGrating;
            }

            public String getReviewtotal() {
                return Reviewtotal;
            }

            public void setReviewtotal(String reviewtotal) {
                Reviewtotal = reviewtotal;
            }

            public String getIs_catering() {
                return is_catering;
            }

            public void setIs_catering(String is_catering) {
                this.is_catering = is_catering;
            }

            public String getIs_open() {
                return is_open;
            }

            public void setIs_open(String is_open) {
                this.is_open = is_open;
            }

            public String getIs_open_close_time() {
                return is_open_close_time;
            }

            public void setIs_open_close_time(String is_open_close_time) {
                this.is_open_close_time = is_open_close_time;
            }

            public String getIs_lunch_dinner() {
                return is_lunch_dinner;
            }

            public void setIs_lunch_dinner(String is_lunch_dinner) {
                this.is_lunch_dinner = is_lunch_dinner;
            }

            public String getCurrent_time() {
                return current_time;
            }

            public void setCurrent_time(String current_time) {
                this.current_time = current_time;
            }

            public String getSelected_date() {
                return selected_date;
            }

            public void setSelected_date(String selected_date) {
                this.selected_date = selected_date;
            }

            public String getReal_date() {
                return real_date;
            }

            public void setReal_date(String real_date) {
                this.real_date = real_date;
            }

            public String getDel_date() {
                return del_date;
            }

            public void setDel_date(String del_date) {
                this.del_date = del_date;
            }

            public String getOpen_time() {
                return open_time;
            }

            public void setOpen_time(String open_time) {
                this.open_time = open_time;
            }

            public String getClose_time() {
                return close_time;
            }

            public void setClose_time(String close_time) {
                this.close_time = close_time;
            }

            public String getOpen_hours() {
                return open_hours;
            }

            public void setOpen_hours(String open_hours) {
                this.open_hours = open_hours;
            }

            public String getOpen_minutes() {
                return open_minutes;
            }

            public void setOpen_minutes(String open_minutes) {
                this.open_minutes = open_minutes;
            }

            public String getOpen_meridian() {
                return open_meridian;
            }

            public void setOpen_meridian(String open_meridian) {
                this.open_meridian = open_meridian;
            }

            public String getOpen_future_time() {
                return open_future_time;
            }

            public void setOpen_future_time(String open_future_time) {
                this.open_future_time = open_future_time;
            }

            public String getClose_hours() {
                return close_hours;
            }

            public void setClose_hours(String close_hours) {
                this.close_hours = close_hours;
            }

            public String getClose_minutes() {
                return close_minutes;
            }

            public void setClose_minutes(String close_minutes) {
                this.close_minutes = close_minutes;
            }

            public String getClose_meridian() {
                return close_meridian;
            }

            public void setClose_meridian(String close_meridian) {
                this.close_meridian = close_meridian;
            }

            public String getClose_future_time() {
                return close_future_time;
            }

            public void setClose_future_time(String close_future_time) {
                this.close_future_time = close_future_time;
            }

            public String getService_type() {
                return service_type;
            }

            public void setService_type(String service_type) {
                this.service_type = service_type;
            }
        }
    }


}
