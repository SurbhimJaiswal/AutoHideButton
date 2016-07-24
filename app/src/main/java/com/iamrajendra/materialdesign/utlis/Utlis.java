package com.iamrajendra.materialdesign.utlis;

import android.content.Context;
import android.content.res.TypedArray;

import com.iamrajendra.materialdesign.R;

/**
 * Created by rajendraverma on 24-07-2016.
 */
public class Utlis {
    public static int getToolbarHeight(Context context) {
        final TypedArray styledAttributes = context.getTheme().obtainStyledAttributes(
                new int[]{R.attr.actionBarSize});
        int toolbarHeight = (int) styledAttributes.getDimension(0, 0);
        styledAttributes.recycle();

        return toolbarHeight;
    }

}
