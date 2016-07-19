package com.sdm.mylibrary.models;

import java.util.ArrayList;

/**
 * Created by sumeetb on 2/15/16.
 */
public class DatesModel {



    private ArrayList<String> dates;


    public ArrayList<String> getDates() {
        return dates;
    }

    public void setDates(ArrayList<String> dates) {
        this.dates = dates;
    }

    ArrayList<scheduleArray> schedule;

    public ArrayList<scheduleArray> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<scheduleArray> schedule) {
        this.schedule = schedule;
    }

    public class scheduleArray{


        private String date ;


        private ArrayList<String> hours;

        private ArrayList<String> minutes;

        private ArrayList<String> meridian;


        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public ArrayList<String> getHours() {
            return hours;
        }

        public void setHours(ArrayList<String> hours) {
            this.hours = hours;
        }

        public ArrayList<String> getMinutes() {
            return minutes;
        }

        public void setMinutes(ArrayList<String> minutes) {
            this.minutes = minutes;
        }

        public ArrayList<String> getMeridian() {
            return meridian;
        }

        public void setMeridian(ArrayList<String> meridian) {
            this.meridian = meridian;
        }
    }
}
