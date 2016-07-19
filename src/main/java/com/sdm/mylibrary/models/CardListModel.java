package com.sdm.mylibrary.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by jatindersi on 5/12/2015.
 */
public class CardListModel {

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


    public class data implements Parcelable {
        @SerializedName("id")
        public String id;
        @SerializedName("is_default")
        public String is_default;
        @SerializedName("status")
        public String status;
        @SerializedName("zipcode")
        public String zipcode;


        @SerializedName("cardTypeKey")
        public String cardTypeKey;

        public String getCardTypeKey() {
            return cardTypeKey;
        }

        public void setCardTypeKey(String cardTypeKey) {
            this.cardTypeKey = cardTypeKey;
        }

        @SerializedName("arrCredeitCardDetails")
        public CardData Data;

        public void setCard(CardData dataCard) {
            this.Data = dataCard;
        }

        public CardData getCard() {
            return Data;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(id);
            parcel.writeString(is_default);
            parcel.writeString(status);
            parcel.writeString(Data.getType());
            parcel.writeString(Data.getExpireDate());
            parcel.writeString(Data.getExpireYear());
            parcel.writeString(Data.getMask());
            parcel.writeString(zipcode);
            parcel.writeString(Data.getToken());
            parcel.writeString(Data.getCardTypeKey());
        }

        private data(Parcel in) {
            this.id = in.readString();
            this.is_default = in.readString();
            this.status = in.readString();
            this.Data.CardType = in.readString();
            this.Data.ExpireMonth = in.readString();
            this.Data.ExpireYear = in.readString();
            this.Data.MaskedNumber = in.readString();
            this.zipcode = in.readString();
            this.Data.token = in.readString();
            this.Data.cardTypeKey = in.readString();
        }

        public final Creator<data> CREATOR = new Creator<data>() {

            @Override
            public data createFromParcel(Parcel source) {
                return new data(source);
            }

            @Override
            public data[] newArray(int size) {
                return new data[size];
            }
        };

        public class CardData {
            @SerializedName("cardType")
            private String CardType;

            @SerializedName("cardTypeKey")
            private String cardTypeKey;

            public String getCardTypeKey() {
                return cardTypeKey;
            }

            public void setCardTypeKey(String cardTypeKey) {
                this.cardTypeKey = cardTypeKey;
            }

            public String getType() {
                return CardType;

            }

            public void setType(String ctype) {
                this.CardType = ctype;
            }

            @SerializedName("expirationMonth")
            private String ExpireMonth;

            public String getExpireDate() {
                return ExpireMonth;
            }

            public void setExpireDate(String edate) {
                this.ExpireMonth = edate;
            }

            @SerializedName("expirationYear")
            private String ExpireYear;

            public String getExpireYear() {
                return ExpireYear;
            }

            public void setExpireYear(String eyear) {
                this.ExpireYear = eyear;
            }

            @SerializedName("maskedNumber")
            private String MaskedNumber;

            public String getMask() {
                return MaskedNumber;
            }

            public void setMask(String mask) {
                this.MaskedNumber = mask;
            }

            @SerializedName("token")
            private String token;

            public String getToken() {
                return token;
            }

            public void setToken(String tokenn) {
                this.token = tokenn;
            }
        }
    }
}



