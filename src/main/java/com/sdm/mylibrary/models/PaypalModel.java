package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sumeetb on 8/13/2015.
 */
public class PaypalModel {

    @SerializedName("payment")
    payment mPayment;


    public payment getmPayment() {
        return mPayment;
    }

    public void setmPayment(payment mPayment) {
        this.mPayment = mPayment;
    }

    public class payment {

        private String short_description;

        private String amount;

        private String currency_code;

        public String getShort_description() {
            return short_description;
        }

        public void setShort_description(String short_description) {
            this.short_description = short_description;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getCurrency_code() {
            return currency_code;
        }

        public void setCurrency_code(String currency_code) {
            this.currency_code = currency_code;
        }
    }

    @SerializedName("client")
    client mClient;

    public client getmClient() {
        return mClient;
    }

    public void setmClient(client mClient) {
        this.mClient = mClient;
    }

    public class client {

        private String platform;

        private String paypal_sdk_version;

        private String product_name;

        private String environment;

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }


        public String getPaypal_sdk_version() {
            return paypal_sdk_version;
        }

        public void setPaypal_sdk_version(String paypal_sdk_version) {
            this.paypal_sdk_version = paypal_sdk_version;
        }

        public String getProduct_name() {
            return product_name;
        }

        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }

        public String getEnvironment() {
            return environment;
        }

        public void setEnvironment(String environment) {
            this.environment = environment;
        }
    }

    @SerializedName("proof_of_payment")
    proof_of_payment mPaymentProff;

    public proof_of_payment getmPaymentProff() {
        return mPaymentProff;
    }

    public void setmPaymentProff(proof_of_payment mPaymentProff) {
        this.mPaymentProff = mPaymentProff;
    }

    public class proof_of_payment {
        @SerializedName("adaptive_payment")
        adaptive_payment mAdaptivePayment;

        public adaptive_payment getmAdaptivePayment() {
            return mAdaptivePayment;
        }

        public void setmAdaptivePayment(adaptive_payment mAdaptivePayment) {
            this.mAdaptivePayment = mAdaptivePayment;
        }

        public class adaptive_payment {
            private String timestamp;

            public String getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            private String payment_exec_status;

            private String app_id;

            private String pay_key;

            public String getPayment_exec_status() {
                return payment_exec_status;
            }

            public void setPayment_exec_status(String payment_exec_status) {
                this.payment_exec_status = payment_exec_status;
            }

            public String getApp_id() {
                return app_id;
            }

            public void setApp_id(String app_id) {
                this.app_id = app_id;
            }

            public String getPay_key() {
                return pay_key;
            }

            public void setPay_key(String pay_key) {
                this.pay_key = pay_key;
            }
        }


    }


}
