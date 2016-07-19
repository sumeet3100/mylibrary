package com.sdm.mylibrary.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by sumeetb on 5/5/2015.
 */
public class SupportModel {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;


    @SerializedName("data")
    private ArrayList<data> mData;


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

    public ArrayList<data> getmData() {
        return mData;
    }

    public void setmData(ArrayList<data> mData) {
        this.mData = mData;
    }

    public class data{
        @SerializedName("Faq")
        private faq mFAq;


        public faq getmFAq() {
            return mFAq;
        }

        public void setmFAq(faq mFAq) {
            this.mFAq = mFAq;
        }

        public class faq{


            @SerializedName("id")
            private String id;

            @SerializedName("question")
            private String question;

            @SerializedName("answer")
            private String answer;

            @SerializedName("weight")
            private String weight;

            @SerializedName("created")
            private String created;

            @SerializedName("modified")
            private String modified;


            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getQuestion() {
                return question;
            }

            public void setQuestion(String question) {
                this.question = question;
            }

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
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
        }



    }

}
