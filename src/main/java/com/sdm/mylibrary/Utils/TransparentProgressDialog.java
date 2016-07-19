package com.sdm.mylibrary.Utils;


import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.ImageView;

import com.sdm.mylibrary.R;


public class TransparentProgressDialog extends Dialog {

    private ImageView iv;


    public TransparentProgressDialog(Context context, int resourceIdOfImage, int style, int layout) {
        super(context, style);
        WindowManager.LayoutParams wlmp = getWindow().getAttributes();
        wlmp.gravity = Gravity.CENTER_HORIZONTAL;
        getWindow().setAttributes(wlmp);
        setTitle(null);
        setCancelable(false);
        setOnCancelListener(null);
        setContentView(R.layout.dialog_layout_progress);
    }

    @Override
    public void show() {
        super.show();

    }

    @Override
    public void dismiss() {
        super.dismiss();

    }
}