package com.sdm.mylibrary.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by sumeetb on 5/13/2015.
 */
public class MailNameModel {

    private String name;

    private String lastName;

    private String firstName;

    private String email;
private ArrayList<String> mailsName;


    public ArrayList<String> getMailsName() {
        return mailsName;
    }

    public void setMailsName(ArrayList<String> mailsName) {
        this.mailsName = mailsName;
    }

    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private ArrayList<MailDataModel> emails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MailDataModel> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<MailDataModel> emails) {
        this.emails = emails;
    }

    public String getLastName() {
        if(lastName==null){
            lastName ="";
        }
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        if(firstName==null){
            firstName="";

        }
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
