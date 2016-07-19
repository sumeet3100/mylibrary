package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sumeetb on 9/21/15.
 */
public class HouseAccountModel {

    @SerializedName("status")
    private String status;

    @SerializedName("data")
    private data mData;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public data getmData() {
        return mData;
    }

    public void setmData(data mData) {
        this.mData = mData;
    }

    public class data{
       @SerializedName("HouseAccount")
       HouseAccount account;


        public HouseAccount getAccount() {
            return account;
        }

        public void setAccount(HouseAccount account) {
            this.account = account;
        }

        public class HouseAccount{


            @SerializedName("id")
            private String id;

            @SerializedName("credit_limit")
            private String credit_limit;

            @SerializedName("HA_customer_id")
            private String HA_customer_id;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCredit_limit() {
                return credit_limit;
            }

            public void setCredit_limit(String credit_limit) {
                this.credit_limit = credit_limit;
            }


            public String getHA_customer_id() {
                return HA_customer_id;
            }

            public void setHA_customer_id(String HA_customer_id) {
                this.HA_customer_id = HA_customer_id;
            }
        }

    }



}
