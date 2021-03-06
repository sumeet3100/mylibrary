package com.sdm.mylibrary.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.sdm.mylibrary.Utils.Const;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sumeetb on 11/18/2014.
 */
public class BoldTextView extends TextView {
        private float spacing = Spacing.NORMAL;
    private CharSequence originalText = "";
    public BoldTextView(Context context) {
        super(context);
        init();
    }

    public BoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        Typeface tFace = Typeface.createFromAsset(getResources().getAssets(), "helvetica_bold.ttf");
        this.setTypeface(tFace);
        this.setIncludeFontPadding(false);
        if(android.os.Build.VERSION.SDK_INT >=21){

            Log.v("the build version","build version is 21");
            this.setLetterSpacing(Const.SPACING);
        }else{
            Log.v("the build version","build version is 20");

        }


    }


//
//
//    public float getSpacing() {
//        return this.spacing;
//    }
//
//    public void setSpacing(float spacing) {
//        this.spacing = spacing;
//        try {
//            applySpacing();
//        }catch (Exception e){
//
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void setText(CharSequence text, BufferType type) {
//        originalText = text;
//        try {
//            applySpacing();
//        }catch (Exception e){
//
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public CharSequence getText() {
//        return originalText;
//    }

    private void applySpacing() {
        try {

        if (this == null || this.originalText == null) return;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < originalText.length(); i++) {
            builder.append(originalText.charAt(i));
            if(i+1 < originalText.length()) {
                builder.append("\u00A0");
            }
        }
        SpannableString finalText = new SpannableString(builder.toString());
        if(builder.toString().length() > 1) {
            for(int i = 1; i < builder.toString().length(); i+=2) {
                finalText.setSpan(new ScaleXSpan((spacing)/10), i, i+1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
        super.setText(finalText, BufferType.SPANNABLE);

        }catch (Exception e){

            e.printStackTrace();
        }
    }

    public class Spacing {
        public final static float NORMAL = -1.01f;

    }


}
