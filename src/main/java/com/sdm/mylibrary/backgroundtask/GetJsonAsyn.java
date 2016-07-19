package com.sdm.mylibrary.backgroundtask;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.sdm.mylibrary.callbacks.PostJsonAsynListener;

import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jagdeeps on 5/26/2015.
 */
public class GetJsonAsyn extends AsyncTask<String, Void, String> {

    String url_str;
    PostJsonAsynListener<String> mListener;
    boolean isDialogDisplay, isSuccess = false;
    Context context;
    int receivedId;
    int errorCode;
    ProgressDialog authDialog;
    String loaderString;

    public GetJsonAsyn(Context context, String url_str, int receivedId,
                        PostJsonAsynListener<String> mListener,
                        String loaderString, boolean isDialogDisplay) {
        this.context = context;
        this.url_str = url_str;
        this.receivedId = receivedId;
        this.mListener = mListener;
        this.isDialogDisplay = isDialogDisplay;
        this.loaderString = loaderString;

    }

    @Override
    protected void onPreExecute() {
        // TODO Auto-generated method stub
        super.onPreExecute();
        if (isDialogDisplay) {
            viewProgressVisible("Please wait..");
        }

    }

    @Override
    protected String doInBackground(String... params) {

        HttpURLConnection connection=null;
        InputStream inputStream=null;
        String result = null;


        try {
            URL url = new URL(url_str);


            connection= (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");

            connection.setConnectTimeout(10000);
            connection.connect();



            Log.i("", "Response:" + connection.getResponseCode());

            if(connection.getResponseCode()==HttpURLConnection.HTTP_OK) {
                inputStream = new BufferedInputStream(connection.getInputStream());


                result = convertStreamToString(inputStream);
                Log.e("","Result:"+result);

                if(result!=null && !result.equalsIgnoreCase("")){

                    isSuccess = true;
                }else{
                    errorCode=5;
                }


            }else{
                errorCode=4;
            }


            inputStream.close();

        }

        catch (MalformedURLException e) {
            errorCode=2;
            e.printStackTrace();
        } catch (IOException e) {
            errorCode=3;
            e.printStackTrace();
        }



        finally {

            connection.disconnect();
        }




//        HttpURLConnection connection=null;
//        String result = null;
//
//        try {
//            URL url = new URL("http://www.android.com/");
//             connection = (HttpURLConnection) url.openConnection();
//            InputStream in = new BufferedInputStream(connection.getInputStream());
//            result = convertStreamToString(in);
//
//            Log.e("","Result:"+result);
//
//        }
//
//        catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//        finally {
//
//            connection.disconnect();
//        }
        return result;
    }

    @Override
    protected void onPostExecute(final String _result) {
        // TODO Auto-generated method stub
        super.onPostExecute(_result);

        Log.e("PostJsonAsyn", "Background operation is completed");

        try {
            viewProgressGone();
        } catch (Exception exception) {
            Log.e("", "progress stopped error");
        }

        finally {

            if (isSuccess) {
                // String entry_type=
                Log.e("PostJsonAsyn", "Successfuly entered:" + _result);


                mListener.onPostSuccess(receivedId, _result);



            } else {
                Log.e("PostJsonAsyn", "erroerrr" + errorCode);

                if(errorCode==2){
                    Toast.makeText(context, "Wrong url", Toast.LENGTH_SHORT).show();

                }

                if(errorCode==3){
                    Toast.makeText(context,"Internet connection is running slow",Toast.LENGTH_SHORT).show();

                }else if(errorCode==4){
                    Toast.makeText(context,"Server error",Toast.LENGTH_SHORT).show();
                }
                else if(errorCode==5){
                    Toast.makeText(context,"Empty response",Toast.LENGTH_SHORT).show();
                }

                mListener.onPostError(receivedId, errorCode);
            }

        }

    }



    private String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    /** Functions to display progress dialog box **/

    public void viewProgressGone() {
        Log.e("PostJsonAsyn", "Inside viewProgressGone()");
        if (authDialog != null)

            authDialog.dismiss();

    }

    public void viewProgressVisible(String paramString) {
        authDialog = ProgressDialog.show(context, "", paramString, true, false);
    }
}
