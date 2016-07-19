package com.sdm.mylibrary.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.sdm.mylibrary.Utils.Const;

/**
 * Created by sumeetb on 11/18/2014.
 */
public class EditTextNormal extends EditText {
//    private float spacing = Spacing.NORMAL;
    private CharSequence originalText = "";
    public EditTextNormal(Context context) {
        super(context);
        init();
    }

    public EditTextNormal(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditTextNormal(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        Typeface tFace = Typeface.createFromAsset(getResources().getAssets(), "helreg.ttf");
        this.setTypeface(tFace);
        this.setIncludeFontPadding(false);
        if(android.os.Build.VERSION.SDK_INT >=21){

            Log.v("the build version", "build version is 21");
            this.setLetterSpacing(Const.SPACING);
        }else{




            Log.v("the build version","build version is 20");

        }

    }




//    public float getSpacing() {
//        return this.spacing;
//    }
//
//    public void setSpacing(float spacing) {
//        this.spacing = spacing;
////        applySpacing();
//    }

//    @Override
//    public void setText(CharSequence text, BufferType type) {
//        originalText = text;
////        applySpacing();
//    }

//    @Override
//    public Editable getText() {
//        return Editable.Factory.getInstance().newEditable(originalText);
//    }
//
//    private void applySpacing() {
//        if (this == null || this.originalText == null) return;
//        StringBuilder builder = new StringBuilder();
//        for(int i = 0; i < originalText.length(); i++) {
//            builder.append(originalText.charAt(i));
//            if(i+1 < originalText.length()) {
//                builder.append("\u00A0");
//            }
//        }
//        SpannableString finalText = new SpannableString(builder.toString());
//        if(builder.toString().length() > 1) {
//            for(int i = 1; i < builder.toString().length(); i+=2) {
//                finalText.setSpan(new ScaleXSpan((spacing+1)/10), i, i+1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            }
//        }
//        super.setText(finalText, BufferType.SPANNABLE);
//    }
//
//    public class Spacing {
//        public final static float NORMAL = -2.5f;
//
//    }


}