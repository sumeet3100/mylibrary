package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sumeetb on 5/6/2015.
 */
public class LoginModel {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private data mData;

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

    public data getmData() {
        return mData;
    }

    public void setmData(data mData) {
        this.mData = mData;
    }

    public class data{

        @SerializedName("User")
        private users mUsers;

        public class users{

            @SerializedName("id")
            private String id;

            @SerializedName("role_id")
            private String role_id;

            @SerializedName("group")
            private String group;

            @SerializedName("is_superadmin")
            private String is_superadmin;


            @SerializedName("email")
            private String email;

            @SerializedName("status")
            private String status;

            @SerializedName("cookie_id")
            private String cookie_id;

            @SerializedName("token")
            private String token;

            @SerializedName("key")
            private String key;

            @SerializedName("encId")
            private String encId;

            public String getEncId() {
                return encId;
            }

            public void setEncId(String encId) {
                this.encId = encId;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getRole_id() {
                return role_id;
            }

            public void setRole_id(String role_id) {
                this.role_id = role_id;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getIs_superadmin() {
                return is_superadmin;
            }

            public void setIs_superadmin(String is_superadmin) {
                this.is_superadmin = is_superadmin;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getCookie_id() {
                return cookie_id;
            }

            public void setCookie_id(String cookie_id) {
                this.cookie_id = cookie_id;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }
        }

        @SerializedName("Customer")
        private Customer mCustomer;

        public class Customer{

            @SerializedName("id")
            private String id;

            @SerializedName("user_id")
            private String user_id;

            @SerializedName("first_name")
            private String first_name;

            @SerializedName("last_name")
            private String last_name;


            @SerializedName("email_alert")
            private String email_alert;

            @SerializedName("special_offers")
            private String special_offers;

            @SerializedName("mobile")
            private String mobile;

            @SerializedName("organization")
            private String organization;

            @SerializedName("fax")
            private String fax;

            public String getFax() {
                return fax;
            }

            public void setFax(String fax) {
                this.fax = fax;
            }

            public String getOrganization() {
                return organization;
            }

            public void setOrganization(String organization) {
                this.organization = organization;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
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

            public String getEmail_alert() {
                return email_alert;
            }

            public void setEmail_alert(String email_alert) {
                this.email_alert = email_alert;
            }

            public String getSpecial_offers() {
                return special_offers;
            }

            public void setSpecial_offers(String special_offers) {
                this.special_offers = special_offers;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }
        }

        @SerializedName("Role")
        private users Role;

        public users getmUsers() {
            return mUsers;
        }

        public void setmUsers(users mUsers) {
            this.mUsers = mUsers;
        }

        public Customer getmCustomer() {
            return mCustomer;
        }

        public void setmCustomer(Customer mCustomer) {
            this.mCustomer = mCustomer;
        }

        public users getRole() {
            return Role;
        }

        public void setRole(users role) {
            Role = role;
        }

        public class Role{

            @SerializedName("group")
            private String group;

            @SerializedName("name")
            private String name;

            @SerializedName("id")
            private String id;

            @SerializedName("status")
            private String status;


            @SerializedName("description")
            private String description;


            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }



    }






}
