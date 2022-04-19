package com.com.de_google_squad.todo.Utility;

import android.content.Context;
import android.content.res.TypedArray;

import com.com.de_google_squad.todo.R;


public class Utils {


    public static int getToolbarHeight(Context context) {
        final TypedArray styledAttributes = context.getTheme().obtainStyledAttributes(
                new int[]{R.attr.actionBarSize});
        int toolbarHeight = (int) styledAttributes.getDimension(0, 0);
        styledAttributes.recycle();

        return toolbarHeight;
    }
}
