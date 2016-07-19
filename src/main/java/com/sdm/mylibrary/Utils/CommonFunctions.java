package com.sdm.mylibrary.Utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import com.sdm.mylibrary.R;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;


public class CommonFunctions {

    private static Calendar mCalendarNow;
    private static Dialog mLoadDialog;
    private static String mUtc_String = "", mdate_utc = "", mTime_Utc = "";
    private static SharedPreferences mSharedPreferences;
    private static ProgressDialog authDialog;

    /**
     * viewProgressGone -- Dismiss the progress
     */
    public static void viewProgressGone() {

        if (authDialog != null)

            authDialog.dismiss();
    }

    public static void endProgress() {

    }

    /**
     * viewProgressVisible -- Show the progress bar
     *
     * @param context -- application context
     */
    public static void viewProgressVisible(Context context) {

//        authDialog = new TransparentProgressDialog(context, R.drawable.blue);
//        authDialog.show();
        authDialog = ProgressDialog.show(context, "", "Loading..", true, false);

//        loadwaitingDialog(context);

    }



    /**
     * loadwaitingDialog -- Progress dialog in case of long event happening at
     * back end
     *
     * @param context -- application context
     */
    public static void loadwaitingDialog(Context context) {

        mLoadDialog = new Dialog(context);
        mLoadDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mLoadDialog.setContentView(R.layout.dialog_layout_progress);

        mLoadDialog.setCancelable(true);

        mLoadDialog.setCanceledOnTouchOutside(false);
        mLoadDialog.setOnKeyListener(new Dialog.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode,
                                 KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {

                    dialog.cancel();
                    return true;
                }
                return false;
            }

        });

        mLoadDialog.show();

    }

    public static void hideKeyboard(Context context) {

        // Hide Keyboard
        ((Activity) context).getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }

    public static void hideKeyboardinDailog(Dialog dialog){

        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    /**
     * readXMLinString -- Read file from assest folder
     *
     * @param fileName -- Name of the file in assests
     * @param mcontext -- Context of application
     * @return -- Data in the file
     */
//    public static String readXMLinString(String fileName, Context mcontext) {
//        try {
//            InputStream is = mcontext.getAssets().open(fileName);
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//            String text = new String(buffer);
//
//            return text;
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    /**
     * SdcardSize -- Return the size of the Sdcard of Tablet
     *
     * @return Available MBS in sdcard
     */
//    public static long SdcardSize() {
//
//        StatFs stat = new StatFs(Environment.getExternalStorageDirectory()
//                .getPath());
//        long bytesAvailable = (long) stat.getBlockSize()
//                * (long) stat.getBlockCount();
//        long megAvailable = bytesAvailable / 1048576;
//        System.out.println("Megs :" + megAvailable);
//        return megAvailable;
//
//    }
    public static void hide_keyboard_from(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    /**
     * This method use to get current UTC time format Return: UTC string
     */

  /*  public static String getTimeStamp() {
        Date today = null;
        mCalendarNow = Calendar.getInstance();
        int year = mCalendarNow.get(Calendar.YEAR);
        int dayofweek = mCalendarNow.get(Calendar.DAY_OF_MONTH);
        int dayofmonth = mCalendarNow.get(Calendar.MONTH);
        int mHour = mCalendarNow.get(Calendar.HOUR_OF_DAY);
        int mMinute = mCalendarNow.get(Calendar.MINUTE);
        int msecond = mCalendarNow.get(Calendar.SECOND);
        mdate_utc = pad(dayofweek) + "/" + pad(dayofmonth) + "/" + year;

        mTime_Utc = pad(mHour) + ":" + pad(mMinute) + ":" + pad(msecond);
        mUtc_String = mdate_utc + ":" + mTime_Utc;

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss",
                Locale.US);
        try {
            today = df.parse(mUtc_String);
            System.out.println("Today = " + df.format(today));

            // getting GMT timezone, you can get any timezone e.g. UTC
            df.setTimeZone(TimeZone.getTimeZone("UTC"));
            System.out.println("local time : " + today);
            ;
            System.out.println("time in GMT : " + df.format(today));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return df.format(today);
    }*/

    /**
     * convertUTCtoLocalTime - Convert Utc Date format to local date format
     *
     * @param p_UTCDateTime -- Utc date string
     * @return local date and time string
     * @throws Exception
     */
   /* public static String convertUTCtoLocalTime(String p_UTCDateTime)
            throws Exception {

        int mIndexResult = p_UTCDateTime.indexOf("/");
        Date lv_localDate = null;
        String localDateIs = null;
        SimpleDateFormat lv_formatter = null;
        SimpleDateFormat lv_parser;

        if (mIndexResult > 0) {
            lv_parser = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss", Locale.US);
            lv_parser.setTimeZone(TimeZone.getTimeZone("UTC"));
            lv_localDate = lv_parser.parse(p_UTCDateTime);
            lv_formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z'('Z')'",
                    Locale.US);
            localDateIs = lv_formatter.format(lv_localDate);
        } else {
            lv_parser = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss", Locale.US);
            lv_parser.setTimeZone(TimeZone.getTimeZone("UTC"));
            lv_localDate = lv_parser.parse(p_UTCDateTime);
            lv_formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z'('Z')'",
                    Locale.US);
            localDateIs = lv_formatter.format(lv_localDate);
            Log.v("Local time is==>", "==" + lv_formatter.format(lv_localDate));
        }

        Log.v("Local time is==>", "==" + lv_formatter.format(lv_localDate));
        return localDateIs;
    }*/

    /**
     * compareUpdate --- Compare the UTC dates for syncing of new data
     *
     * @param date1 -- OS current date
     * @param date2 -- Updating of Data Date provided in web-service
     * @return -- True or False
     */

  /*  public static boolean compareUpdate(String date1, String date2) {

        boolean result = false;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss",
                Locale.US);
        Date Pdate = null;
        Date Qdate = null;
        try {
            Pdate = df.parse(date1);
            Qdate = df.parse(date2);

            Log.v("pdate and qdate is", "" + Pdate + "   Date  " + Qdate);

            result = Pdate.after(Qdate);

            Log.v("the result is", "" + result);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }*/

    /**
     * pad -- used to change the date and month from single digit to double
     * digit value(9 to 09)
     *
     * @param c -- int value need to be pad
     * @return padded integer value
     */
   /* public static String pad(int c) {
        if (c >= 10)
            return String.valueOf(c);
        else
            return "0" + String.valueOf(c);
    }
*/
    /**
     * loadImageFromUrl -- Convert Url to Bitmap
     *
     * @param url -- Url to be converted
     * @return BItmap of URl
     */

  /*  public static Bitmap loadImageFromUrl(String url) {
        URL m;
        InputStream i = null;
        BufferedInputStream bis = null;
        ByteArrayOutputStream out = null;
        try {
            m = new URL(url);
            i = (InputStream) m.getContent();
            bis = new BufferedInputStream(i, 1024 * 8);
            out = new ByteArrayOutputStream();
            int len = 0;
            byte[] buffer = new byte[1024];
            while ((len = bis.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            out.close();
            bis.close();
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] data = out.toByteArray();
        Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);
        // Drawable d = Drawable.createFromStream(i, "src");
        return bitmap;
    }*/

    // Method to create alert dialog with a message
  /*  public static void errorDialog(Context context, String msg) {
        Builder builder = new Builder(context);
        builder.setTitle("Notification");
        builder.setMessage(msg);
        builder.setPositiveButton("Ok", null);
        builder.setCancelable(true);
        builder.create().show();
    }
*/
    /**
     * capitalizeString -- it capitalized the first letter of the contact name
     * while displaying it in the listview
     *
//     * @param string -- contact name
     * @return string with capital first letter of it
     */
   /* public static String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.'
                    || chars[i] == '\'') { // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);
    }*/




    public static String twoDigitFormatter(float total) {

        try {
            if(total ==0){

                return "0.00";
            }else{
                DecimalFormat df = new DecimalFormat();
                df.setMinimumFractionDigits(2);
                df.setMaximumFractionDigits(2);

                df.setMinimumIntegerDigits(1);

                return df.format(total);
//            return new DecimalFormat("##.00").format(total).;
            }
        }catch (Exception e){
            return "0.00";

        }



    }

  /*  public static BigDecimal round(BigDecimal d, int scale, boolean roundUp) {
        int mode = (roundUp) ? BigDecimal.ROUND_UP : BigDecimal.ROUND_DOWN;
        return d.setScale(scale, mode);
    }*/


   /* public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {


            return ((BitmapDrawable) drawable).getBitmap();

        }


        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), 900);
        drawable.draw(canvas);

        return bitmap;
    }
*/

   /* public static Bitmap getBitmapFromURL(String src) {
        try {
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;
        } catch (IOException e) {
            // Log exception
            return null;
        }
    }*/


   /* public static void addFavourite(Context context, String text) {

        Toast.makeText(context, "" + text, Toast.LENGTH_SHORT).show();


    }*/


  /*  public static int getDaysBetweenDates(String inputString1,
                                          String inputString2) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        int days = 0;
        try {
            Date date1 = dateFormat.parse(inputString1);
            Date date2 = dateFormat.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            System.out.println("Days: "
                    + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return days;
    }*/


  /*  public static void fadeAnimation(Context context, View view) {

//        Animation a = AnimationUtils.loadAnimation(context,
//                R.anim.fade_in);
        // Animation a = AnimationUtils.loadAnimation(getActivity(),
        // R.anim.wave_scale);
//        a.reset();
//        view.clearAnimation();
//        view.startAnimation(a);
    }*/

    // Convert a view to bitmap
  /*  public static Bitmap createDrawableFromView(Context context, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);
        return bitmap;
    }*/


   /* public static void showToast(Context context, String text) {

        Toast.makeText(context, "" + text, Toast.LENGTH_SHORT).show();
    }*/



    public static int getWidth(Context mContext){
        int width=0;
        WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        if(Build.VERSION.SDK_INT>12){
            Point size = new Point();
            display.getSize(size);
            width = size.x;
        }
        else{
            width = display.getWidth();  // Deprecated
        }
        return width;
    }

   /* public static  void tointegratePriceUpToDecimal(float priceREtail, TextView abc) {

        double as = Double.parseDouble(priceREtail + "");
        DecimalFormat df = new DecimalFormat("0.00");
        df.setMaximumFractionDigits(2);
        df.setRoundingMode(RoundingMode.HALF_UP);
        String mTxtValue = df.format(as);
        abc.setText("$" + mTxtValue);

    }
*/


    public static double RoundTo2Decimals(double val) {
        DecimalFormat df2 = new DecimalFormat("###.##");
        return Double.valueOf(df2.format(val));
    }

    public static String getConvertedTime(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("EEE, MMM dd, yyyy h:mm aa",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("MMM dd, yyyy");

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }



    public static String getParticipantTime(String mDate,String currentformat,String changeformat) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat(currentformat,Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat(changeformat,Locale.US);

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }








    public static String getDate(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("E, MMM dd, yyyy",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("yyyy-MM-dd",Locale.US);

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }



    public static String getCheckSTRTDate(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("E, MMM dd, yyyy h:mm aa",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.US);

        Date mTimeIs=null;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }

    public static String showalertTime(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("E, MMM dd, yyyy h:mm aa",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("h:mm aa",Locale.US);

        Date mTimeIs=null;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }

    public static String getConvertedDate(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("yyyy-MM-dd",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("EEE, MMM d, yyyy",Locale.US);

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }



    public static String getDay(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("E, MMM dd, yyyy",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("EEE",Locale.US);

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }


    public static String getHour(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("h:mm aa",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("hh",Locale.US);

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }

    public static String getTimeFormated(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("h:mm:ss",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("h:mm aa",Locale.US);

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }
    public static String getMinute(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("h:mm aa",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("mm",Locale.US);

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }


    public static String getMeridian(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("h:mm aa",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("aa",Locale.US);

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toLowerCase();
    }

    public static boolean isConnectingToInternet(Context mContext) {
        ConnectivityManager connectivity = (ConnectivityManager) mContext
                .getSystemService(mContext.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }

        }
        return false;
    }

    // give us current day
    public static String currentDay(){

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
// 3 letter name form of the day
        System.out.println(new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime()));

        return new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime());

    }


    public static boolean compareDates(String startdate, String comparedate, String endDate) {
        boolean b = false;
        try {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.US);

            Date date1 = formatter.parse(startdate);

            Date lastDate = formatter.parse(endDate);
            Date date2 = formatter.parse(comparedate);

            if (date2.after(date1) && date2.before(lastDate) ||date2.equals(date1)||date2.equals(lastDate)) {
                b = true;
                System.out.println("date2 is Greater than my date1");
            } else {

                b = false;
                System.out.println("date2 is Greater than my date1");
            }

        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        return b;
    }



    public static String cateringDate(String mDate) {

        SimpleDateFormat mOriginalDateSource = new SimpleDateFormat("yyyy-MM-dd",Locale.US);
        SimpleDateFormat mChangedDateSource = new SimpleDateFormat("E, MMM d, yyyy",Locale.US);

        Date mTimeIs;
        String mChangedTime = "00:00";

        try {
            mTimeIs = mOriginalDateSource.parse(mDate);
            mChangedTime = mChangedDateSource.format(mTimeIs);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return mChangedTime.toUpperCase();
    }


    // this function check and remove decimal part
    public static Float checkFloatValue(String value){
        try {
            float x = Float.valueOf(value);
            float result = x - (int)x;
            if (result != 0)
            {

                //If the value of `result` is not equal to zero, then, you have a decimal portion which is not equal to 0.
                return x;
            }else{
                float original = (int)x;
                return original;
            }
        }catch (Exception e){

            return Float.valueOf(value);

        }





    }
}
