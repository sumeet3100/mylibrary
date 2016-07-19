package com.sdm.mylibrary.CustomView;

/**
 * Created by jatindersi on 7/8/2015.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * ScrollViewの中のGridViewでも高さを可変にする<br>
 * http://stackoverflow.com/questions/8481844/gridview-height-gets-cut
 */
public class ExpandableHeightGridView extends GridView {

    boolean expanded = false;

    public ExpandableHeightGridView(Context context)
    {
        super(context);
    }

    public ExpandableHeightGridView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public ExpandableHeightGridView(Context context, AttributeSet attrs,
                                    int defStyle)
    {
        super(context, attrs, defStyle);
    }


    public boolean isExpanded()
    {
        return expanded;
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        // HACK! TAKE THAT ANDROID!
//        if (isExpanded())
//        {
//            // Calculate entire height by providing a very large height hint.
//            // View.MEASURED_SIZE_MASK represents the largest height possible.
//            int expandSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK,
//                    MeasureSpec.AT_MOST);
//
//            super.onMeasure(widthMeasureSpec, expandSpec);
//
//            ViewGroup.LayoutParams params = getLayoutParams();
//            params.height = getMeasuredHeight()+1000;
//        }
//        else
//        {
//            heightMeasureSpec=heightMeasureSpec+100;
//            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        }
        int heightSpec;

        if (getLayoutParams().height == LayoutParams.WRAP_CONTENT) {
            // The great Android "hackatlon", the love, the magic.
            // The two leftmost bits in the height measure spec have
            // a special meaning, hence we can't use them to describe height.
            heightSpec = MeasureSpec.makeMeasureSpec(
                    Integer.MAX_VALUE  >>  2, MeasureSpec.AT_MOST);
        }
        else {
            // Any other height should be respected as is.
            heightSpec = heightMeasureSpec;
        }
        heightSpec=heightSpec+10000;
        super.onMeasure(widthMeasureSpec, heightSpec);
    }

    public void setExpanded(boolean expanded)
    {
        this.expanded = expanded;
    } }
