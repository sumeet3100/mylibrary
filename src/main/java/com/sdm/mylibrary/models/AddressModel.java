package com.sdm.mylibrary.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by sumeetb on 5/14/2015.
 */
public class AddressModel {


    @SerializedName("status")
    private String status;

    @SerializedName("message")
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
    private ArrayList<data> mData;

    public ArrayList<data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<data> mData) {
        this.mData = mData;
    }

    public class data implements  Parcelable{
        @SerializedName("CustomerAddress")
        CustomerAddress customer;

        public CustomerAddress getCustomer() {
            return customer;
        }

        public void setCustomer(CustomerAddress customer) {
            this.customer = customer;
        }

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(customer.getId());
            parcel.writeString(customer.getApt_value());
            parcel.writeString(customer.getCustomer_id());
            parcel.writeString(customer.getFirst_name());
            parcel.writeString(customer.getLast_name());
            parcel.writeString(customer.getPhone());
            parcel.writeString(customer.getMobile_phone());
            parcel.writeString(customer.getStreet_address());
            parcel.writeString(customer.getIs_default_address());
            parcel.writeString(customer.getCity());
            parcel.writeString(customer.getZip_code());
            parcel.writeString(customer.getLocation_name());
            parcel.writeString(state.getId());
            parcel.writeString(state.getName());

        }
        private data(Parcel in){
            customer.id = in.readString();
           customer.apt_value = in.readString();
            customer.customer_id = in.readString();
            customer.first_name = in.readString();
            customer.last_name = in.readString();
            customer.phone = in.readString();
            customer.mobile_phone = in.readString();
            customer.street_address=in.readString();
            customer.is_default_address=in.readString();
            customer.city=in.readString();
            customer.zip_code=in.readString();
            customer.location_name=in.readString();
            state.id=in.readString();
            state.name=in.readString();
        }
        public  final Creator<data> CREATOR = new Creator<data>() {

            @Override
            public data createFromParcel(Parcel source) {
                return new data(source);
            }

            @Override
            public data[] newArray(int size) {
                return new data[size];
            }
        };
        public class CustomerAddress {


            @SerializedName("id")
            private String id;

            @SerializedName("apt_value")
            private String apt_value;

            @SerializedName("customer_id")
            private String customer_id;

            @SerializedName("first_name")
            private String first_name;

            @SerializedName("last_name")
            private String last_name;

            @SerializedName("phone")
            private String phone;
            @SerializedName("mobile_phone")
            private String mobile_phone;
            @SerializedName("street_address")
            private String street_address;
            @SerializedName("is_default_address")
            private String is_default_address;

            @SerializedName("city")
            private String city;
            @SerializedName("zip_code")
            private String zip_code;

            @SerializedName("location_name")
            private String location_name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getApt_value() {
                return apt_value;
            }

            public void setApt_value(String apt_value) {
                this.apt_value = apt_value;
            }

            public String getCustomer_id() {
                return customer_id;
            }

            public void setCustomer_id(String customer_id) {
                this.customer_id = customer_id;
            }

            public String getFirst_name() {
                return first_name;
            }

            public void setFirst_name(String first_name) {
                this.first_name = first_name;
            }

            public String getLast_name() {
                return last_name;
            }

            public void setLast_name(String last_name) {
                this.last_name = last_name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getMobile_phone() {
                return mobile_phone;
            }

            public void setMobile_phone(String mobile_phone) {
                this.mobile_phone = mobile_phone;
            }

            public String getStreet_address() {
                return street_address;
            }

            public void setStreet_address(String street_address) {
                this.street_address = street_address;
            }

            public String getIs_default_address() {
                return is_default_address;
            }

            public void setIs_default_address(String is_default_address) {
                this.is_default_address = is_default_address;
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

            public String getLocation_name() {
                return location_name;
            }

            public void setLocation_name(String location_name) {
                this.location_name = location_name;
            }


        }

        @SerializedName("State")
        State state;

        public class State {

            @SerializedName("id")
            private String id;

            @SerializedName("name")
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
        }

    }


}
