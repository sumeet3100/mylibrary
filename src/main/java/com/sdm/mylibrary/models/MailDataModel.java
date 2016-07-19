package com.sdm.mylibrary.models;

/**
 * Created by sumeetb on 5/12/2015.
 */
public class MailDataModel {


    private String mail;

    private boolean checked;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
