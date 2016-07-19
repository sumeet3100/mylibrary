package com.sdm.mylibrary.Utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Pattern;

public class Validate {

    public static final int VALID_TEXT_COLOR = Color.BLACK;
    public static final int INVALID_TEXT_COLOR = Color.RED;
    public final static Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9+._%-+]{1,256}" +
                    "@" +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" +
                    "(" +
                    "." +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" +
                    ")+"
    );

    public static boolean hasText(EditText editText) {
        String text = editText.getText().toString().trim();
        if (text.length() == 0) {
            editText.setText(text);
            editText.setTextColor(INVALID_TEXT_COLOR);
            return false;
        } else {
            return true;
        }
    }

    @SuppressWarnings("deprecation")
    public static void showAlertBox(Context ctx, String message, String title) {
        AlertDialog alertDialog = new AlertDialog.Builder(ctx).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        // here you can add functions
                    }
                });
        alertDialog.show();
    }

    public static void showToast(Context ctx, String str) {
        Toast.makeText(ctx, str, Toast.LENGTH_LONG).show();
    }


    public static Bitmap loadBitmap(String url) {
        Bitmap bitmap = null;
        URL newurl = null;
        try {
            newurl = new URL(url);
        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            bitmap = BitmapFactory.decodeStream(newurl.openConnection().getInputStream());
        } catch (IOException e) {

            e.printStackTrace();
        }
        return bitmap;
    }


    /**
     * ********************************************************
     * This method will return the image from a URL. We will input
     * the item image URL.
     * *********************************************************
     */
    public static Drawable getRemoteImage(final URL aURL) {
        try {
            final URLConnection conn = aURL.openConnection();
            conn.connect();
            final BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
            final Drawable d = Drawable.createFromStream(bis, "src");
            bis.close();
            return d;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static boolean checkEmail(String email) {
        return EMAIL_ADDRESS_PATTERN.matcher(email).matches();
    }

}
