package com.sdm.mylibrary.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.sdm.mylibrary.Utils.Const;
import com.sdm.mylibrary.callbacks.InternetCallBack;


/**
 * This BroadcastReceiver intercepts the android.net.ConnectivityManager.CONNECTIVITY_ACTION,
 * which indicates a connection change. It checks whether the type is TYPE_WIFI.
 * If it is, it checks whether Wi-Fi is connected and sets the wifiConnected flag in the
 * main activity accordingly.
 */
public class NetworkReceiver extends BroadcastReceiver {

    // The user's current network preference setting.
    public static String sPref = null;

    private InternetCallBack<Integer> callback;

    public NetworkReceiver(InternetCallBack<Integer> callback) {

        this.callback = callback;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connMgr =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        // Checks the user prefs and the network connection. Based on the result, decides
        // whether
        // to refresh the display or keep the current display.
        // If the userpref is Wi-Fi only, checks to see if the device has a Wi-Fi connection.
        if (networkInfo != null
                && networkInfo.getType() == ConnectivityManager.TYPE_WIFI) {
            // If device has its Wi-Fi connection, sets refreshDisplay
            // to true. This causes the display to be refreshed when the user
            // returns to the app.
            Const.REFRESH_DISPLAY = true;
            callback.netReturn(1);
//            Toast.makeText(context, R.string.wifi_connected, Toast.LENGTH_SHORT).show();

            // If the setting is ANY network and there is a network connection
            // (which by process of elimination would be mobile), sets refreshDisplay to true.
        } else if (networkInfo != null && networkInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
            Const.REFRESH_DISPLAY = true;
            callback.netReturn(1);
//            Toast.makeText(context, "Mobile connected", Toast.LENGTH_SHORT).show();

            // Otherwise, the app can't download content--either because there is no network
            // connection (mobile or Wi-Fi), or because the pref setting is WIFI, and there
            // is no Wi-Fi connection.
            // Sets refreshDisplay to false.
        } else {
            callback.netReturn(0);
            Const.REFRESH_DISPLAY = false;
//            Toast.makeText(context, R.string.lost_connection, Toast.LENGTH_SHORT).show();
        }
    }
}