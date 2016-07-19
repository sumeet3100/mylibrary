package com.sdm.mylibrary.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sumeetb on 5/8/2015.
 */
public class ProfileModel  {


    @SerializedName("status")
    private String status;

    @SerializedName("data")
    private message data;

    @SerializedName("message")
    private String errorMesage;

    public String getErrorMesage() {
        return errorMesage;
    }

    public void setErrorMesage(String errorMesage) {
        this.errorMesage = errorMesage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public message getData() {
        if(data ==null){
    data = new message();
            return data ;
        }else{
        return data;
    }
    }

    public void setData(message data) {
        this.data = data;
    }



    public class message{

        @SerializedName("User")
        user User;

        public class user {

            @SerializedName("email")
            private String email;

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }
        @SerializedName("Customer")
        private customer mCustomer;

        public user getUser() {
            return User;
        }

        public void setUser(user user) {
            User = user;
        }

        public customer getmCustomer() {
            return mCustomer;
        }

        public void setmCustomer(customer mCustomer) {
            this.mCustomer = mCustomer;
        }

        public class customer{

            @SerializedName("first_name")
            private String first_name;

            @SerializedName("last_name")
            private String last_name;

            @SerializedName("mobile")
            private String mobile;

            @SerializedName("birth_day")
            private String birth_day;

            @SerializedName("birth_month")
            private String birth_month;

            @SerializedName("birth_year")
            private String birth_year;

            @SerializedName("special_offers")
            private String special_offers;


            @SerializedName("email_alert")
            private String email_alert;

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

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getBirth_day() {
                if(birth_day ==null || birth_day.equalsIgnoreCase("null")){

                    return "";
                }else{

                    return birth_day;
                }


            }

            public void setBirth_day(String birth_day) {
                if(birth_day ==null || birth_day.equalsIgnoreCase("null")){

                    this.birth_day = "";
                }else{

                this.birth_day = birth_day;
            }

            }

            public String getBirth_month() {
                if(birth_month ==null || birth_month.equalsIgnoreCase("null")){

                    return "";
                }else{

                    return birth_month;
                }

            }

            public void setBirth_month(String birth_month) {
                if(birth_day ==null){

                    this.birth_month = "";
                }else{

                    this.birth_month = birth_day;
                }

            }

            public String getBirth_year() {
                if(birth_year ==null || birth_year.equalsIgnoreCase("null")){

                    return "";
                }else{

                    return birth_year;
                }


            }

            public void setBirth_year(String birth_year) {
                if(birth_month ==null){

                    this.birth_month = "";
                }else{

                    this.birth_month = birth_day;
                }

            }

            public String getSpecial_offers() {
                return special_offers;
            }

            public void setSpecial_offers(String special_offers) {
                this.special_offers = special_offers;
            }

            public String getEmail_alert() {
                return email_alert;
            }

            public void setEmail_alert(String email_alert) {
                this.email_alert = email_alert;
            }
        }


    }


}
