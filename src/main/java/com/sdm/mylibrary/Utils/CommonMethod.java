package com.sdm.mylibrary.Utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.location.Address;
import android.location.Geocoder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.ParseException;
import android.provider.Settings;

import android.support.v4.content.LocalBroadcastManager;
import android.text.format.DateUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.sdm.mylibrary.R;
import com.sdm.mylibrary.callbacks.InternetCallBack;
import com.sdm.mylibrary.receivers.NetworkReceiver;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;


public class CommonMethod extends Activity {
    public final static Pattern EMAIL_ADDRESS_PATTERN = Pattern
            .compile("[a-zA-Z0-9+._%-+]{1,256}" + "@"
                    + "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" + "(" + "."
                    + "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" + ")+");
//    public static boolean sBugsenceObject;
//    static Date date;
//    static String sTimeStamp;
//    static int sStatusOnlineId;
//    private static String fromdate;
//    public boolean connected;
//    ProgressDialog authDialog;
//    Calendar calender;
//    SimpleDateFormat dateformat;
//    private Dialog mauthDialog;
    public final Pattern FIRST_LAST_NAME = Pattern.compile("^[a-zA-Z ]*$");
    /**
     * ChangeDateFormat -- Change the format of date into the MMM dd yyyy format
     *
//     * @param month -- month of the year
//     * @param year  -- year
//     * @param day   -- selected day
     * @return string of formated date
     */
  /*  public static String ChangeDateFormat(String month, String year, String day) {
        SimpleDateFormat mdateformat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fromUser = new SimpleDateFormat("dd/MM/yyyy");
        int changedMonth = Integer.parseInt(month);

        fromdate = day + "/" + changedMonth + "/" + year;


        String reformattedStr = null, formattedToDate = null;
        String fromdateformat = "";
        try {

            try {

                reformattedStr = mdateformat.format(fromUser.parse(fromdate));
            } catch (java.text.ParseException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            try {
                try {
                    date = mdateformat.parse(reformattedStr);
                } catch (java.text.ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                Log.i("date", date + "");
                mdateformat.applyPattern("MMMM dd, yyyy");
                fromdateformat = mdateformat.format(date);

                Log.e("date to be print in new pattern iss...........",
                        fromdateformat);

            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Log.i("formatted date of date picker issssssx", reformattedStr
                    + "   " + formattedToDate);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return fromdateformat;
    }

    public static void deleteCache(Context context) {
        try {
            File dir = context.getCacheDir();
            if (dir != null && dir.isDirectory()) {
                deleteDir(dir);
            }
        } catch (Exception e) {
        }
    }*/

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }







     /**
     * This method use to get current time Return: Timestamp
     */

  /*  public String getTimeStamp() {
        calender = Calendar.getInstance();
        dateformat = new SimpleDateFormat("dd-MM-yyyy");
        sTimeStamp = dateformat.format(calender.getTime());
        return sTimeStamp;
    }*/

    /**
     * This method use to check internet connection status Return: true or false
     */

  /*  public boolean connectionStatus() {

        boolean mconnectionStatus = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = connectivityManager
                    .getActiveNetworkInfo();
            connected = activeNetworkInfo != null
                    && activeNetworkInfo.isAvailable()
                    && activeNetworkInfo.isConnected();

            if (connected == false) {
                mconnectionStatus = false;

            } else {
                mconnectionStatus = true;
            }

        } catch (Exception e) {
            System.out
                    .println("CheckConnectivity Exception: " + e.getMessage());
            Log.v("connectivity", e.toString());
        }

        return mconnectionStatus;

    }*/

    /**
     * This method return service url Input: Service Name,parameter list Return:
     * server url
     */



    public boolean checkEmail(String email) {
        return EMAIL_ADDRESS_PATTERN.matcher(email).matches();
    }

    /**
     * This method show error message dialog box Input: File Context,Error
     * string
     */
   /* public void errorAndExit(Context cntx, String paramString) {
        Validate.showAlertBox(cntx, paramString, "");
        exit();
    }*/

    /**
     * This method finish the activity
     */
    public void exit() {
        finish();
    }

    /**
     * Integer array of the Icon images used for events
     */


    public String getCurrentTime() {


        Calendar calendar = new GregorianCalendar();

        calendar.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));

        System.out.println("UTC: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("UTC: " + calendar.getTimeInMillis());

        TimeZone tz1 = TimeZone.getTimeZone("Asia/Kolkata");

        calendar.setTimeZone(tz1);

        System.out.println("CPH: " + calendar.get(Calendar.HOUR_OF_DAY));
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        int dom = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int second = calendar.get(Calendar.SECOND);
        month = month + 1;

        String mtimestamp = year + "-" + month + "-" + dom + " " + hour + ":"
                + min + ":" + second;
        return mtimestamp;

    }

    /**
     * pad -- used to change the date and month from single digit to double
     * digit value(9 to 09)
     *
     * @param c -- int value need to be pad
     * @return padded integer value
     */
   /* public String pad(int c) {
        if (c >= 10)
            return String.valueOf(c);
        else
            return "0" + String.valueOf(c);
    }
*/
    //


   /* public void viewProgressGone() {
        mauthDialog.dismiss();
    }*/

    /*public void viewProgressVisible(Context context, String paramString) {
        mauthDialog = ProgressDialog
                .show(context, "", paramString, true, false);
    }*/

    /**
     * Convert Time format to hh:mm aa
     *
     * @param mDate
     * @return
     */
  /*  public String getConvertedTime(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("hh:mm");

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime;
    }
*/

    /**
     * Convert Time format to hh:mm aa
     *
     * @param mDate
     * @return
     */
  /*  public String getDatemonth(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("dd/MM");

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime;
    }*/


    /**
     * Convert Time format to hh:mm aa
     *
     * @param mDate
     * @return
     */
   /* public String getmonthDate(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("dd MMM");

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime;
    }*/


    // change to hh:mm:ss
  /*  public String getConvertedToTime(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("hh:mm:ss");


        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime;
    }*/


    /**
     * Convert Time format to hh:mm aa
     *
     * @param mDate
     * @return
     */
    public String timeinHHMMSS(String mDate) {
        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("h:mm aa");

        Date mTimeIs;
        String mChangedTime = "00:00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {
                Log.e("value",e.getMessage());
            e.printStackTrace();

        }

//		Log.v("Changed time is","Chaned time is"+mChangedTime);

        return mChangedTime.toUpperCase();
    }

    /**
     * Conver the date format
     *
     * @param mDate
     * @return
     */
   /* public Date getConvertedDate(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("dd MMM yyyy");

        Date mTimeIs = null;
        String mChangedTime = "dd MMM";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);
            mTimeIs = mChangedDateSource.parse(mChangedTime);
        } catch (Exception e) {

            e.printStackTrace();

        }

        return mTimeIs;
    }
*/
    /**
     * Convert the date Format
     *
     * @param mDate
     * @return
     */
    public String getConvertedHHMM(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
                "hh.mm");
//        mChangedDateSource.setTimeZone(TimeZone.getTimeZone(mDate));

        Date mTimeIs;
        String mChangedTime = "dd MMM";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);
//			Log.e("changed date is", "" + mChangedTime);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }


    /**
     * Convert the date Format
     *
     * @param mDate
     * @return
     */
  /*  public String getDate(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
                "dd");

        Date mTimeIs;
        String mChangedTime = "dd";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);
//			Log.e("changed date is", "" + mChangedTime);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }*/

    /**
     * Convert the date Format
     *
     * @param mDate
     * @return
     */
   /* public String getDayName(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
                "EEEE");

        Date mTimeIs;
        String mChangedTime = "dd";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);
//			Log.e("changed date is", "" + mChangedTime);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }*/


    /**
     * Convert the date Format
     *
     * @param mDate
     * @return 24 october
     */
 /*   public String getDayMonth(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
                "dd MMMM");

        Date mTimeIs;
        String mChangedTime = "dd";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);
//			Log.e("changed date is", "" + mChangedTime);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime;
    }
*/

    /**
     * Convert the date Format
     *
     * @param mDate
     * @return october
     */
   /* public String getMonth(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
                "MMM");

        Date mTimeIs;
        String mChangedTime = "mm";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);


            mChangedTime = mChangedDateSource.format(mTimeIs);
//			Log.e("changed date is", "" + mChangedTime);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime;
    }*/


  /*  public boolean checkvalidDate(String input) {
        // Add your own format here.
        boolean check = false;
        List<SimpleDateFormat>
                dateFormats = new ArrayList<SimpleDateFormat>() {{

            add(new SimpleDateFormat("dd-mm-yyyy"));
        }};

        Date date = null;
        if (null == input) {
            return check;
        }
        for (SimpleDateFormat format : dateFormats) {
            try {
                format.setLenient(false);
                date = format.parse(input);
            } catch (Exception e) {
                //Shhh.. try other formats
            }
            if (date != null) {

                return true;
            }
        }


        return false;
    }
*/
  /*  public boolean isDateInCurrentWeek(String selectedEvent) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone(selectedEvent));
        Date date = null;
        try {
            date = dateFormat.parse(selectedEvent);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        Calendar currentCalendar = Calendar.getInstance();
        int week = currentCalendar.get(Calendar.WEEK_OF_YEAR);
        int year = currentCalendar.get(Calendar.YEAR);
        Calendar targetCalendar = Calendar.getInstance();
        targetCalendar.setTime(date);
        int targetWeek = targetCalendar.get(Calendar.WEEK_OF_YEAR);
        int targetYear = targetCalendar.get(Calendar.YEAR);
        return week == targetWeek && year == targetYear;
    }*/

  /*  public String eventIsPastEvent(String selectedEvent) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setTimeZone(TimeZone.getTimeZone(selectedEvent));
        String mChangedTime = "mm";
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.SUNDAY);
        String currentDateTime = dateFormat.format(cal.getTime());
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        int year = cal.get(Calendar.YEAR);


        int type = 0;
        String startDateTime = selectedEvent;
        try {
            Date startdate = dateFormat.parse(startDateTime);
            Date currentDate = dateFormat.parse(currentDateTime);
            Calendar targetCalendar = Calendar.getInstance();
            targetCalendar.setFirstDayOfWeek(Calendar.SUNDAY);
            targetCalendar.setTime(startdate);
            int targetWeek = targetCalendar.get(Calendar.WEEK_OF_YEAR);
            int targetYear = targetCalendar.get(Calendar.YEAR);

            if (DateUtils.isToday(startdate.getTime())) {

                mChangedTime = getConvertedHHMM(selectedEvent);
//                SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
//                        "HH.mm");
////                mChangedDateSource.setTimeZone(TimeZone.getTimeZone(selectedEvent));
//                mChangedTime = mChangedDateSource.format(startdate);
//                Log.e("the today date is","today date>>>>>>>>>>"+mChangedTime);
                return mChangedTime;
            } else if (getTomorrowDate().equals(startdate)) {
                mChangedTime = getConvertedHHMM(selectedEvent);
//                SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
//                        "HH.mm");
////                mChangedDateSource.setTimeZone(TimeZone.getTimeZone(selectedEvent));
//                mChangedTime = mChangedDateSource.format(startdate);

            } else if (startdate.after(getTomorrowDate()) && startdate.before(getFiveDayAfterDate()) || startdate.equals(getFiveDayAfterDate())) {


                SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
                        "EEEE");
//                mChangedDateSource.setTimeZone(TimeZone.getTimeZone(selectedEvent));
                mChangedTime = mChangedDateSource.format(startdate);


            } else {
                mChangedTime = getDateMnthHourMin(selectedEvent);
//                SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
//                        "d MMMM HH.mm");
//               mChangedDateSource.setTimeZone(TimeZone.getTimeZone(selectedEvent));
//                mChangedTime = mChangedDateSource.format(startdate);
///                Log.e("the today date is","today date>>>>>>>>>>"+mChangedTime);

            }


        } catch (ParseException e) {
            e.printStackTrace();
            return mChangedTime;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return mChangedTime;
    }
*/
    /**
     * Convert the date Format
     *
     * @param mDate
     * @return
     */
    public String getDateMnthHourMin(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat(
                "d MMMM HH.mm");

        Date mTimeIs;
        String mChangedTime = "mm";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);


            mChangedTime = mChangedDateSource.format(mTimeIs);
//			Log.e("changed date is", "" + mChangedTime);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime;
    }

    // Section Event Listing
 /*   public int currentDay(String selectedEvent) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setTimeZone(TimeZone.getTimeZone(selectedEvent));
        String mChangedTime = "mm";
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.SUNDAY);
        String currentDateTime = dateFormat.format(cal.getTime());
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        int year = cal.get(Calendar.YEAR);


        int type = 0;
        String startDateTime = selectedEvent;
        try {
            Date startdate = dateFormat.parse(selectedEvent);
            Date currentDate = dateFormat.parse(currentDateTime);
            Calendar targetCalendar = Calendar.getInstance();
            targetCalendar.setFirstDayOfWeek(Calendar.SUNDAY);
            targetCalendar.setTime(startdate);
            int targetWeek = targetCalendar.get(Calendar.WEEK_OF_YEAR);
            int targetYear = targetCalendar.get(Calendar.YEAR);
            Log.e("the current date is", "currentDate" + startdate);


            if (DateUtils.isToday(startdate.getTime())) {
                type = 1;

            } else if (week == targetWeek && year == targetYear) {
                type = 2;

            } else {
                type = 3;


            }


        } catch (ParseException e) {
            e.printStackTrace();
            return type;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return type;
    }
*/

    // Section Event Listing
   /* public int eventSections(String selectedEvent) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setTimeZone(TimeZone.getTimeZone(selectedEvent));
        String mChangedTime = "mm";
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.SUNDAY);
        String currentDateTime = dateFormat.format(cal.getTime());
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        int year = cal.get(Calendar.YEAR);


        int type = 0;
        String startDateTime = selectedEvent;
        try {
            Date startdate = dateFormat.parse(startDateTime);
            Date currentDate = dateFormat.parse(currentDateTime);
            Calendar targetCalendar = Calendar.getInstance();
            targetCalendar.setFirstDayOfWeek(Calendar.SUNDAY);
            targetCalendar.setTime(startdate);
            int targetWeek = targetCalendar.get(Calendar.WEEK_OF_YEAR);
            int targetYear = targetCalendar.get(Calendar.YEAR);
//            Log.e("the current date is","currentDate"+currentDate);


//            Log.v("Sumeet it Worked", getTomorrowDate() + "<><>>>>>>>>>>>>>>>>>" + currentDate);
//            Log.v(week + "<WEek Cehck>" + getTomorrowDate(), startdate + "<<year>>" + currentDate);

            if (DateUtils.isToday(startdate.getTime())) {
                type = 1;


                return type;
            } else if (getTomorrowDate().equals(startdate)) {

//                Log.v("Sumeet it Worked","<><>>>>>>>>>>>>>>>>>"+startdate.compareTo(getTomorrowDate()));
//                Log.v(week+"<WEek Cehck>"+startdate,startdate+"<<year>>"+getTomorrowDate());
                type = 2;

            } else if (startdate.after(getTomorrowDate()) && startdate.before(getFiveDayAfterDate()) || startdate.equals(getFiveDayAfterDate())) {


                type = 3;


            } else {
                type = 4;


            }


        } catch (ParseException e) {
            e.printStackTrace();
            return type;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return type;
    }
*/

    // get Tomorrow Date
    public Date getTomorrowDate() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date tomorrow = null;
        try {


            tomorrow = dateFormat.parse(getCurrentTime());
            Calendar tomorrowCal = Calendar.getInstance();
            tomorrowCal.setTime(tomorrow);
            tomorrowCal.add(Calendar.DAY_OF_YEAR, 1); // <--
            tomorrow = tomorrowCal.getTime();
        } catch (Exception ex) {


        }
        return tomorrow;
    }


    // get Tomorrow Date
 /*   public Date getFiveDayAfterDate() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date tomorrow = null;
        try {


            tomorrow = getTomorrowDate();
            Calendar tomorrowCal = Calendar.getInstance();
            tomorrowCal.setTime(tomorrow);
            tomorrowCal.add(Calendar.DAY_OF_YEAR, 5); // <--
            tomorrow = tomorrowCal.getTime();
        } catch (Exception ex) {


        }
        return tomorrow;
    }
*/

 /*   public boolean currentMonth(String selectedEvent) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone(selectedEvent));
        String mChangedTime = "mm";
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.SUNDAY);
        String currentDateTime = dateFormat.format(cal.getTime());
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);

        boolean type = false;
        String startDateTime = selectedEvent;
        try {
            Date startdate = dateFormat.parse(startDateTime);
            Date currentDate = dateFormat.parse(currentDateTime);
            Calendar targetCalendar = Calendar.getInstance();
            targetCalendar.setFirstDayOfWeek(Calendar.SUNDAY);
            targetCalendar.setTime(startdate);
            int targetWeek = targetCalendar.get(Calendar.WEEK_OF_YEAR);
            int targetYear = targetCalendar.get(Calendar.YEAR);
            int targetMonth = targetCalendar.get(Calendar.MONTH);
//            Log.e("the current date is", "currentDate" + currentDate);

            Log.e(startdate.compareTo(currentDate) + "the startdate date is", "startdate" + startdate);
//            Log.v(year + "<WEek Cehck>" + targetYear, month + "targetMonth" + targetMonth);

            if (month == targetMonth && year == targetYear) {
                type = true;
                Log.e("the after date is", "after date>>>>>>>>>>");


                return type;
            }


        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
*/

 /*   public boolean searchSectionbyMonth(String selectedEvent) {

        String monthName = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone(selectedEvent));
        String mChangedTime = "mm";
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.SUNDAY);
        String currentDateTime = dateFormat.format(cal.getTime());
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);

        boolean type = false;
        String startDateTime = selectedEvent;
        try {
            Date startdate = dateFormat.parse(startDateTime);
            Date currentDate = dateFormat.parse(currentDateTime);
            Calendar targetCalendar = Calendar.getInstance();
            targetCalendar.setFirstDayOfWeek(Calendar.SUNDAY);
            targetCalendar.setTime(startdate);
            int targetWeek = targetCalendar.get(Calendar.WEEK_OF_YEAR);
            int targetYear = targetCalendar.get(Calendar.YEAR);
            int targetMonth = targetCalendar.get(Calendar.MONTH);
//            Log.e("the current date is", "currentDate" + currentDate);
//
//            Log.e(startdate.compareTo(currentDate) + "the startdate date is", "startdate" + startdate);
//            Log.v(year + "<WEek Cehck>" + targetYear, month + "targetMonth" + targetMonth);

            if (month == targetMonth && year == targetYear) {
                type = true;
//                Log.e("the after date is", "after date>>>>>>>>>>");


                return type;
            } else {


                switch (month) {
                    case 0:
                        monthName = "JAN";
                        break;

                    case 1:
                        monthName = "FEB";
                        break;
                    case 2:
                        monthName = "MAR";
                        break;
                    case 3:
                        monthName = "APR";
                        break;
                    case 4:
                        monthName = "MAY";
                        break;
                    case 5:
                        monthName = "JUN";
                        break;
                    case 6:
                        monthName = "JUL";
                        break;
                    case 7:
                        monthName = "AUG";
                        break;
                    case 8:
                        monthName = "SEP";
                        break;
                    case 9:
                        monthName = "OCT";
                        break;
                    case 10:
                        monthName = "NOV";
                        break;
                    case 11:
                        monthName = "DEC";
                        break;


                }
            }


        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
*/

  /*  public int ticketCheck(String selectedEvent) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone(selectedEvent));
        String mChangedTime = "mm";
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.SUNDAY);
        String currentDateTime = dateFormat.format(cal.getTime());
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        int year = cal.get(Calendar.YEAR);


        int type = 0;
        String startDateTime = selectedEvent;
        try {
            Date startdate = dateFormat.parse(startDateTime);
            Date currentDate = dateFormat.parse(currentDateTime);
            Calendar targetCalendar = Calendar.getInstance();
            targetCalendar.setFirstDayOfWeek(Calendar.SUNDAY);
            targetCalendar.setTime(startdate);
            int targetWeek = targetCalendar.get(Calendar.WEEK_OF_YEAR);
            int targetYear = targetCalendar.get(Calendar.YEAR);
//            Log.e("the current date is","currentDate"+currentDate);

//            Log.e(startdate.compareTo(currentDate)+"the startdate date is","startdate"+startdate);
//            Log.v(week+"<WEek Cehck>"+targetWeek,year+"<<year>>"+targetYear);

            if (DateUtils.isToday(startdate.getTime())) {
                type = 1;


                return type;
            } else if (targetWeek >= week || targetYear >= targetYear) {
                type = 2;
//                Log.e("the after date is","after date>>>>>>>>>>");


                return type;
            } else {
                type = 3;

//                Log.e("the today date is","today date>>>>>>>>>>");
                return type;
            }


        } catch (ParseException e) {
            e.printStackTrace();
            return type;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return type;
    }
*/

    // Convert bitmap into base64 string to save image on web-server
 /*   public String base64(String path) {

//        Log.i("the file path is", "" + path);

        StringBuilder mBuilder = new StringBuilder();
        String[] filePath = path.split(",");
        String file = "";
        for (int i = 0; i < filePath.length; i++) {

            file = filePath[i];

            if (!file.equalsIgnoreCase("0")) {

//                Log.e("file is not null", "" + file);

                int orientation = ImageUtil.getExifOrientation(file);

                Bitmap mIconbm = BitmapFactory.decodeFile(file);

                if (orientation == 90) {

                    mIconbm = ImageUtil.rotate(mIconbm, 90);
                } else if (orientation == 180) {

                    mIconbm = ImageUtil.rotate(mIconbm, 180);

                } else if (orientation == 270) {

                    mIconbm = ImageUtil.rotate(mIconbm, 270);

                }

//				mIconbm = ImageUtil.getResizedBitmap(mIconbm, 400, 400);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                Bitmap scaledBitmap = Bitmap.createScaledBitmap(mIconbm, 400, 400, false);
                scaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);


                byte[] b = baos.toByteArray();

                String encodedImage = Base64.encodeToString(b, Base64.NO_WRAP);
                mBuilder.append(encodedImage + " ");

                file = mBuilder.toString().trim();

                return file;
            } else {

                return "0";
            }
        }
        return file;
    }
*/
    /**
     * Return selected timezone in the device
     *
     * @param timezoneKey
     * @return
     */
  /*  public TimeZone getSelectedTimezone(String timezoneKey) {
        if (null == timezoneKey)
            return TimeZone.getDefault(); // system/network-provided
        return TimeZone.getTimeZone(timezoneKey); // Gets specified tz, or "GMT"
        // if tzKey is invalid
    }
*/

    // Getting Bitmap from path passed
   /* public Bitmap decodePhoto12(String path, int max_width, int max_height) {
        File infile = new File(path);
        Bitmap bm = null;
        try {
            BitmapFactory.Options o = new BitmapFactory.Options();
            o.inJustDecodeBounds = true;
            o.inSampleSize = 4;
            try {
                BitmapFactory
                        .decodeStream(new FileInputStream(infile), null, o);
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            final int height = o.outHeight;
            final int width = o.outWidth;
            int scale = 4;
            double vertical_scale = 0;
            double horizontal_scale = 0;
            if (max_height > 0 && o.outHeight > max_height) {
                vertical_scale = o.outHeight / (double) max_height;
            }
            if (max_width > 0 && o.outWidth > max_width) {
                horizontal_scale = o.outWidth / (double) max_width;
            }

            if (horizontal_scale > 0 || vertical_scale > 0) {
                scale = (int) Math.floor(Math.max(horizontal_scale,
                        vertical_scale));
            }
            final float totalPixels = width * height;

            // Anything more than 2x the requested pixels we'll sample down
            // further.
            final float totalReqPixelsCap = max_width * max_height * 2;

            while (totalPixels / (scale * scale) > totalReqPixelsCap) {
                scale++;
            }
            // Decode with inSampleSize
            BitmapFactory.Options o2 = new BitmapFactory.Options();
            o2.inSampleSize = scale;

            try {
                bm = BitmapFactory.decodeStream(new FileInputStream(infile),
                        null, o2);
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            return bm;

        } catch (OutOfMemoryError ex) {
            ex.printStackTrace();
            return null;
        }

    }
*/
    /**
     * getfileext -- get us the extention of the file
     *
     * @param fileName -- file name stored in sdcard
     * @return -- return the type of file
     */
 /*   public String getfileext(String fileName) {
        String extension = "";

        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            extension = fileName.substring(i + 1);
        }
        return extension;
    }
*/
    /**
     * getnamefromfile -- get the name of the file in sd card
     *
     * @param fileName -- file name stored in database
     * @return
     */
   /* public String getnamefromfile(String fileName) {
        // TODO Auto-generated method stub
        int idx = fileName.replaceAll("\\\\", "/").lastIndexOf("/");
        return idx >= 0 ? fileName.substring(idx + 1) : fileName;

    }*/

    /**
     * Remove the last letter in a String
     *
     * @param str
     * @return
     */
    public String removeLastLetter(String str) {

        if (str.length() > 0 && str.charAt(str.length() - 1) == ',') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }


    /**
     * Remove the last letter in a String
     *
     * @param str
     * @return
     */
  /*  public String removeFirstLetter(String str) {

        if (str.length() > 0) {
            str = str.substring(1);
        }
        return str;
    }*/


    /**
     * Make First Letter to Capital Letter
     *
     * @param
     * @return
     */
 /*   public String capitalizeFirstLetter(String original) {
        if (original.length() == 0)
            return original;
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }
*/
    public String getCurrentUTC() {


        Calendar calendar = new GregorianCalendar();

        calendar.setTimeZone(TimeZone.getTimeZone("UTC/GMT"));


        TimeZone tz1 = TimeZone.getTimeZone("Central European Time");

        calendar.setTimeZone(tz1);


        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        int dom = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int second = calendar.get(Calendar.SECOND);

        month = month + 1;
        /*	DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            formatter.setTimeZone(obj);*/

        String mtimestamp = year + "-" + month + "-" + dom + " " + hour + ":"
                + min + ":" + second;

        Log.e("time in aus", ">>>>>>>>>>>" + mtimestamp);
        return mtimestamp;
    }

    public long convertUTCtoMilliseconds(String mtimestamp) {

        Calendar currentCal = Calendar.getInstance();
        SimpleDateFormat currentDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = null;
        try {

            try {
                currentDate = currentDF.parse(mtimestamp);
                currentCal.setTime(currentDate);
            } catch (java.text.ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        long currrentTime = currentCal.getTimeInMillis();


        return currrentTime;

    }


 /*   public String[] convertSecondsToHMmSs(long time) {
        long seconds = 0;


        if (time > 0) {
            seconds = time;
        } else {
            seconds = (time) * (-1);
        }


        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        int day = (int) TimeUnit.SECONDS.toDays(seconds);
        long hours = TimeUnit.SECONDS.toHours(seconds) -
                TimeUnit.DAYS.toHours(day);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) -
                TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(seconds));
        long second = TimeUnit.SECONDS.toSeconds(seconds) -
                TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(seconds));
        String exactTime = "";

        String[] exactDay = {"" + day, "" + hours, "" + minute, "" + second};
//        Log.e("the value of the date and time is","day"+day+" Hour "+hours+ " Minutes "+minute+" Second"+second);

        if (time > 0) {
            exactTime = String.format("%02d:%02d", day, hours);
        } else {
            exactTime = "-" + String.format("%02d:%02d:%02d", h, m, s);
        }

        return exactDay;
    }
*/

  /*  public String convertDateToHMmSs(String eventTime) {
        long seconds = 0;
        long currrentTime = convertUTCtoMilliseconds(
                getCurrentUTC());


        long orderTIme =
                convertUTCtoMilliseconds(eventTime);


        long time = orderTIme - currrentTime;


        long timeSeconds = TimeUnit.MILLISECONDS
                .toSeconds(time);


        if (timeSeconds > 0) {
            seconds = timeSeconds;
        } else {
            seconds = (timeSeconds) * (-1);
        }


        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        int day = (int) TimeUnit.SECONDS.toDays(seconds);
        long hours = TimeUnit.SECONDS.toHours(seconds) -
                TimeUnit.DAYS.toHours(day);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) -
                TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(seconds));
        long second = TimeUnit.SECONDS.toSeconds(seconds) -
                TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(seconds));
        String exactTime = "";

        String[] exactDay = {"" + day, "" + hours, "" + minute, "" + second};
//        Log.e("the value of the date and time is","day"+day+" Hour "+hours+ " Minutes "+minute+" Second"+second);

        if (timeSeconds > 0) {

            if (day > 0) {
                String first = String.format("%2d", day);
                String two = String.format("%2d", hours);
                exactTime = first + " days and " + two + " hour";
            }
            if (day == 0) {

                String first = String.format("%2d", hours);
                String two = String.format("%2d", minute);
                exactTime = first + " hour and " + two + " minutes";
            }
            if (day == 0 && hours == 0) {

                String first = String.format("%2d", hours);
                String two = String.format("%2d", minute);
                exactTime = two + " minutes";
            }

            if (day == 0 && hours == 0 && minute == 0) {

                String first = String.format("%2d", second);

                exactTime = first + " seconds ";
            }


        } else {
            exactTime = "";
        }

        return exactTime;
    }
*/

  /*  public int getDay(long time) {
        long seconds = 0;


        if (time > 0) {
            seconds = time;
        } else {
            seconds = (time) * (-1);
        }


        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        int day = (int) TimeUnit.SECONDS.toDays(seconds);
        long hours = TimeUnit.SECONDS.toHours(seconds) -
                TimeUnit.DAYS.toHours(day);
        long minute = TimeUnit.SECONDS.toMinutes(seconds) -
                TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(seconds));
        long second = TimeUnit.SECONDS.toSeconds(seconds) -
                TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(seconds));
        String exactTime = "";

        String[] exactDay = {"" + day, "" + hours, "" + minute, "" + second};
//        Log.e("the value of the date and time is","day"+day+" Hour "+hours+ " Minutes "+minute+" Second"+second);

        if (time > 0) {
            exactTime = String.format("%02d:%02d:%02d", h, m, s);
        } else {
            exactTime = "-" + String.format("%02d:%02d:%02d", h, m, s);
        }

        return day;
    }
*/

   /* public long getHour(long time) {
        long seconds = 0;

        seconds = time;

//        if(time >0){
//            seconds=time;
//        }else{
//            seconds=(time)*(-1);
//        }


//        long s = seconds % 60;
//        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        int day = (int) TimeUnit.SECONDS.toDays(seconds);
        long hours = TimeUnit.SECONDS.toHours(seconds) -
                TimeUnit.DAYS.toHours(day);
//        long minute = TimeUnit.SECONDS.toMinutes(seconds) -
//                TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(seconds));
//        long second = TimeUnit.SECONDS.toSeconds(seconds) -
//                TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(seconds));
//        String exactTime = "";
//
//        String[] exactDay = {""+day,""+hours,""+minute,""+second};
////        Log.e("the value of the date and time is","day"+day+" Hour "+hours+ " Minutes "+minute+" Second"+second);
//
//        if(time >0){
//            exactTime=String.format("%02d:%02d:%02d", h, m, s);
//        }else{
//            exactTime="-"+String.format("%02d:%02d:%02d", h, m, s);
//        }

        return hours;
    }
*/
   /* public void updateDeviceID(Context context) {
//        if (!CommonFunctions.getUserID(context).equalsIgnoreCase("") && !Const.DEVICE_ID.equalsIgnoreCase("")) {
////    		new UpdatedDeviceTokenAsync(context, CommonFunctions.getUserID(context)).execute();
//
//        }
    }*/


    // Check Internet Connection!!!

  /*  public boolean isNetworkAvailable() {
        ConnectivityManager connectivity = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
*/
    // GPS switch on dialog
 /*   public void showGPSSettingDialog(final Context context) {

        AlertDialog.Builder alt_bld = new AlertDialog.Builder(context);
        alt_bld.setMessage("Enable Gps service")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent myIntent = new Intent(
                                Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        context.startActivity(myIntent);


                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for ‘NO’ Button

                    }
                });
        AlertDialog alert = alt_bld.create();
        // Title for AlertDialog
        alert.setTitle("Locationservices");

        alert.show();


    }
*/








    /*public String checkEventReminder(Context context, String id, String type) {
        boolean b = false;
        EVEDatabase mImsDatabase;
        mImsDatabase = new EVEDatabase(context);
        mImsDatabase.open();
        Cursor FavCursor;
        String eventType = "";


//        TablesAndColumns.statusColumn + "='" + status + "' and "
//                + TablesAndColumns.alaramtypeColumn + "='" + "Default"
//                + "' and "+ TablesAndColumns.useridColumn + "='" + saved_userid +  "'"

        String wherecondition = TablesAndColumns.ReminderIDColumn
                + "='" + id + "' and " + TablesAndColumns.ReminderTypeColumn + "='" + type + "'";
        FavCursor = mImsDatabase
                .getSelectedData(
                        TablesAndColumns.ReminderTable, TablesAndColumns.allReminderTable,
                        wherecondition, null);


        FavCursor.moveToFirst();
        if (FavCursor.getCount() > 0) {


            eventType = FavCursor.getString(FavCursor
                    .getColumnIndex(TablesAndColumns.ReminderTimeColumn));
            b = true;

        } else {
            b = false;
            eventType = "";
        }
        FavCursor.close();
        mImsDatabase.close();
        return eventType;
    }*/


    /*public boolean deletReminder(Context context, String id, String type) {

        EVEDatabase mImsDatabase;
        mImsDatabase = new EVEDatabase(context);
        mImsDatabase.open();


        String wherecondition = TablesAndColumns.ReminderIDColumn
                + "='" + id + "' and " + TablesAndColumns.ReminderTypeColumn + "='" + type + "'";
        boolean b = mImsDatabase
                .deleteItem(
                        TablesAndColumns.ReminderTable,
                        wherecondition);
        mImsDatabase.close();


        return b;
    }*/


 /*   public Bitmap getResizedBitmap(Bitmap bm, int newHeight, int newWidth) {

        int width = bm.getWidth();

        int height = bm.getHeight();

        float scaleWidth = ((float) newWidth) / width;

        float scaleHeight = ((float) newHeight) / height;

// create a matrix for the manipulation

        Matrix matrix = new Matrix();

// resize the bit map

        matrix.postScale(scaleWidth, scaleHeight);

// recreate the new Bitmap

        Bitmap resizedBitmap = Bitmap.createBitmap(bm, 0, 0, width, height, matrix, false);

        return resizedBitmap;

    }
*/

  /*  public boolean pastEvent(String selectedEvent) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        dateFormat.setTimeZone(TimeZone.getDefault());

        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone(selectedEvent));
        String currentDateTime = dateFormat.format(cal.getTime());
        String startDateTime = selectedEvent;
        try {
            Date startdate = dateFormat.parse(startDateTime);
            Date currentDate = dateFormat.parse(currentDateTime);
            if (currentDate.getTime() - startdate.getTime() > 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
*/

 /*   public boolean pastTwoDays(String selectedEvent, String fromEvent) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setTimeZone(TimeZone.getDefault());

        SimpleDateFormat fromFormat = new SimpleDateFormat("dd-MM-yyyy");
        fromFormat.setTimeZone(TimeZone.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone(fromEvent));

        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone(selectedEvent));

        String currentDateTime = dateFormat.format(cal.getTime());

        String startDateTime = fromFormat.format(calendar.getTime());
        try {
            Date startdate = fromFormat.parse(startDateTime);
            Date currentDate = dateFormat.parse(currentDateTime);
            if (currentDate.getTime() - startdate.getTime() > 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
*/

  /*  public List<Address> getAddress(Context context, double latitude, double longitude) {
        try {
            Geocoder geocoder;
            List<Address> addresses;
            geocoder = new Geocoder(context);
            if (latitude != 0 || longitude != 0) {
                addresses = geocoder.getFromLocation(latitude,
                        longitude, 1);
                String address = addresses.get(0).getAddressLine(0);
                String city = addresses.get(0).getAddressLine(1);
                String country = addresses.get(0).getAddressLine(2);
                Log.d(addresses + "TAG", "address = " + address + ", city =" + city + ", country = " + country);
                return addresses;
            } else {
                Toast.makeText(context, "latitude and longitude are null",
                        Toast.LENGTH_LONG).show();
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
*/

    /**
     * getDeviceID -- get the Unique Device Id
     *
     * @param
     * @return
     */
  /*  public String getDeviceID(Context mcontext) {

        String deviceId = Settings.Secure.getString(mcontext.getContentResolver(),
                Settings.Secure.ANDROID_ID);


        return deviceId;

    }
*/

 /*   public int getActionBarHeight(Context context) {

        int actionBarHeight = 0;

        TypedValue tv = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true)) {
            actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data, context.getResources().getDisplayMetrics());

            Log.e("the acitonbar height is", "ActionBar height is" + actionBarHeight);

        }

        return actionBarHeight;
    }
*/

    public String screenResolution(Context context) {

        String type = "";
       float f= context.getResources().getDisplayMetrics().density;
//        switch (context.getResources().getDisplayMetrics().density) {
//
//
//            case DisplayMetrics.DENSITY_LOW:// ldpi
//                type = "@0.75x";
//                break;
//            case DisplayMetrics.DENSITY_MEDIUM://mdpi
//                type = "@1x";
//                break;
//            case DisplayMetrics.DENSITY_HIGH://hdpi
//                type = "@1.5x";
//                break;
//            case DisplayMetrics.DENSITY_XHIGH://xhdpi
//                type = "@2x";
//            case DisplayMetrics.DENSITY_XXHIGH://xxhdpi
//                type = "@3x";
//                break;

//        0.75 - ldpi
//
//        1.0 - mdpi
//
//        1.5 - hdpi
//
//        2.0 - xhdpi
//
//        3.0 - xxhdpi
//
//        4.0 - xxxhdpi

        type = "@2x";

        if(f==0.75){
            type = "@1x";

        }
        if(f==1.0){
            type = "@1x";

        }
        if(f==1.5){
            type = "@1x";

        }

        if(f==2.0&&f<=2.9){

            type = "@2x";
        }

        if(f>=3.0 &&f<=3.9 ){
            type = "@3x";

        }

        if(f>=4.0){

            type = "@4x";
        }



//        }


        return type;
    }


    // set  Network broadcast receiver
    public void networkCheck(NetworkReceiver receiver, InternetCallBack<Integer> callback, Context context) {
        stopNetworkCheck(receiver, context);
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        receiver = new NetworkReceiver(callback);
        LocalBroadcastManager manager = LocalBroadcastManager.getInstance(context);
        manager.registerReceiver(receiver, filter);
    }

    // Stop Network Check
    public void stopNetworkCheck(NetworkReceiver receiver, Context context) {
        try {
            if (receiver != null) {
                context.unregisterReceiver(receiver);
            }
        } catch (Exception ex) {


        }

    }

    public static void setMargins (View v, int l, int t, int r, int b) {
        if (v.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
            p.setMargins(l, t, r, b);
            v.requestLayout();
        }
    }


    public boolean checkName(String name) {
        boolean nameValidOrNot = FIRST_LAST_NAME.matcher(name).matches();
        return nameValidOrNot;
    }
    /*public String convertToJson(Object data) {
        String json = "";
        String json = "";
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

        try {
            json = ow.writeValueAsString(data);
            Log.v("the created json is", ">>>>" + json);
        } catch (Exception ex) {

        }

        return json;
    }*/

}
