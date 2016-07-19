package com.sdm.mylibrary.models;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumeetb on 9/3/15.
 */
public class ProgramCodeModel {


    @Expose
    private String status;
    @Expose
    private String message;
    @Expose
    private ArrayList<EmailData> data = new ArrayList<EmailData>();

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The data
     */
    public ArrayList<EmailData> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(ArrayList<EmailData> data) {
        this.data = data;
    }


    public class EmailData{

        @Expose
        private String id;
        @Expose
        private String email;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}

