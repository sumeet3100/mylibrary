package com.sdm.mylibrary.backgroundtask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.sdm.mylibrary.R;
import com.sdm.mylibrary.Utils.Const;
import com.sdm.mylibrary.callbacks.PostJsonAsynListener;
import com.sdm.mylibrary.preferences.PreferenceConnector;

import dmax.dialog.SpotsDialog;

public class PostJsonAsyn extends AsyncTask<String, Void, String> {
    // ProgressDialog authDialog;

    JSONObject json;
    String url;
    PostJsonAsynListener<String> mListener;
    boolean isDialogDisplay, isSuccess = false;
    Context context;
    int receivedId;
    int errorCode;
    SpotsDialog authDialog;
    String loaderString;

    public PostJsonAsyn(Context context, String url, int receivedId,
                        PostJsonAsynListener<String> mListener, JSONObject json,
                        String loaderString, boolean isDialogDisplay) {
        this.context = context;
        this.json = json;
        this.url = url;
        this.receivedId = receivedId;
        this.mListener = mListener;
        this.isDialogDisplay = isDialogDisplay;
        this.loaderString = loaderString;


    }

    @Override
    protected void onPreExecute() {

        super.onPreExecute();
        if (isDialogDisplay) {
            viewProgressVisible("Please wait..");
        }

    }

    @Override
    protected String doInBackground(String... params) {

        if (haveNetworkConnection()) {
            HttpURLConnection conn = null;
//		HttpResponse httpResponse;
            String result = null;
//		HttpClient httpClient = new DefaultHttpClient();
//
//		HttpConnectionParams
//				.setConnectionTimeout(httpClient.getParams(), 10000);
//		Log.e("Asyn Input", "URL:" + url);
//		Log.e("Asyn Input", "INPUT JSON:" + json);
//
//		HttpPost httpPost = new HttpPost(url);
//		try {
//			StringEntity entity = new StringEntity(json.toString());
//			entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE,
//					"application/json"));
//
//			httpPost.setEntity(entity);
////			httpPost.addHeader("device_type","android");
//			httpResponse = httpClient.execute(httpPost);
//
//			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//				HttpEntity httpEntity = httpResponse.getEntity();
//				result = EntityUtils.toString(httpEntity);
//				Log.i("PostJsonAsyn", "Web service response = " + result + "\n"
//						+ entity);
//				if (isJSONValid(result)) {
//					isSuccess = true;
//				} else {
//					errorCode = 6;
//				}
//
//			} else {
//				Log.e("PostJsonAsyn", "Not a Valid Response");
//
//				errorCode = 4;
//			}
//
//		} catch (UnsupportedEncodingException e) {
//
//			errorCode = 1;
//			e.printStackTrace();
//
//		} catch (ClientProtocolException e) {
//			errorCode = 2;
//			e.printStackTrace();
//
//		} catch (IOException e) {
//			errorCode = 3;
//
//			e.printStackTrace();
//		} finally {
//			httpClient.getConnectionManager().shutdown();
//		}
//
//		return result;


            try {

                Log.e("Asyn Input", "URL:" + url);
                Log.e("Asyn Input", "INPUT JSON:" + json);
                Log.e("Asyn Input", "INPUT USERID:" + PreferenceConnector.readString(context, PreferenceConnector.USERID, ""));
                Log.e("Asyn Input", "INPUT TOKEN:" + PreferenceConnector.readString(context, PreferenceConnector.TOKEN, ""));
                Log.e("Asyn Input", "INPUT KEY:" + PreferenceConnector.readString(context, PreferenceConnector.KEY, ""));
                Log.e("Asyn", "INPUT CUSTOMERID:" + PreferenceConnector.readString(context, PreferenceConnector.CUSTOMERID, ""));

                URL url = new URL(this.url);
                conn = (HttpURLConnection) url.openConnection();
                conn.setReadTimeout(30000);
                conn.setConnectTimeout(20000);
                conn.setRequestMethod("POST");
                conn.setDoInput(true);

                conn.setUseCaches(false);
                conn.setRequestProperty("Referer", Const.WB_URL.BASEURL);
                conn.setRequestProperty("Accept", "application/json");
                conn.setRequestProperty("Content-Type", "application/json");

                conn.setRequestProperty("user_id", PreferenceConnector.readString(context, PreferenceConnector.USERID, ""));
                conn.setRequestProperty("token", PreferenceConnector.readString(context, PreferenceConnector.TOKEN, ""));
                conn.setRequestProperty("key", PreferenceConnector.readString(context, PreferenceConnector.KEY, ""));
                conn.setRequestProperty("customer_id", PreferenceConnector.readString(context, PreferenceConnector.CUSTOMERID, ""));
                conn.setRequestProperty("device_type", "android");
                OutputStream os = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
                writer.write(json.toString());
                writer.flush();
                writer.close();
                os.close();
                conn.connect();
                Log.e("HTTP request code", "code" + conn.getResponseCode());
                if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    InputStream input = conn.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                    StringBuilder data = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        data.append(line);
                    }

                    result = data.toString();
                    Log.e("the output", "loadInBackground : " + result);


                    if (isJSONValid(result)) {
                        isSuccess = true;
                    } else {
                        errorCode = 6;
                    }

                } else {

                    errorCode = 4;

                }
            } catch (UnsupportedEncodingException e) {

                errorCode = 1;
                e.printStackTrace();

            } catch (IOException e) {
                errorCode = 3;

                e.printStackTrace();
            } finally {
                if (conn != null)
                    conn.disconnect();
            }
            return result;
        } else {

            errorCode = 7;
        }
        return null;
    }

    @Override
    protected void onPostExecute(final String _result) {

        super.onPostExecute(_result);

        Log.e("PostJsonAsyn", "Background operation is completed");

        try {
            viewProgressGone();
        } catch (Exception exception) {
            Log.e("", "progress stopped error");
        } finally {

            if (isSuccess) {
                // String entry_type=
                Log.e("PostJsonAsyn", "boolean?>> " + isJSONValid(_result) + "Successfuly entered:" + _result);

                if (_result != null && !_result.equalsIgnoreCase("")) {

                    mListener.onPostSuccess(receivedId, _result);

                } else {
                    errorCode = 5;
                    Log.e("PostJsonAsyn", "Empty String");
                    mListener.onPostError(receivedId, errorCode);
                }

            } else {
                Log.e("PostJsonAsyn", "erroerrr" + errorCode);

                if (errorCode == 3) {

                    showBasicNoTitle(context, "Internet connection is running slow.", "OK");
                } else if (errorCode == 4) {

                    showBasicNoTitle(context, "Server error.", "OK");
                } else if (errorCode == 6) {

                    showBasicNoTitle(context, "Server error invalid response.", "OK");
                } else if (errorCode == 7) {
                    showBasicNoTitle(context, "Please check your internet connection.", "OK");

                }

                mListener.onPostError(receivedId, errorCode);
            }

        }

    }


    public void showBasicNoTitle(Context context, String title, String button1) {
        new MaterialDialog.Builder(context)
                .content(title)
                .positiveText(button1)
                .autoDismiss(false)
                .positiveText(R.string.ok)
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        // TODO
                        dialog.dismiss();
                    }
                }).build().show();
    }

    /**
     * Functions to display progress dialog box
     **/

    public void viewProgressGone() {
        Log.e("PostJsonAsyn", "Inside viewProgressGone()");
        if (authDialog != null)

            authDialog.dismiss();

    }

    public void viewProgressVisible(String paramString) {
        authDialog = new SpotsDialog(context, "Custom message & style");

    }

    // Cehck if response is valid
    public boolean isJSONValid(String test) {
        try {
            new JSONObject(test);
        } catch (JSONException ex) {
            // edited, to include @Arthur's comment
            // e.g. in case JSONArray is valid as well...
            try {
                new JSONArray(test);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }


    // Check internet Connection
    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) { // connected to the internet
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                // connected to wifi
                haveConnectedWifi = true;
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                // connected to the mobile provider's data plan
                haveConnectedMobile = true;
            }
        }

        return haveConnectedWifi || haveConnectedMobile;
    }
}
