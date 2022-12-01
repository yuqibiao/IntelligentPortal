package com.yyyu.baselibrary.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * 功能：Glid工具类
 *
 * @author yu
 * @version 1.0
 * @date 2022-11-30
 */
public class GlidUtils {
    private static final String TAG = "GlidUtils";

    public static void loadFromNet(Context context , ImageView iv , String imgURL){
        if (!TextUtils.isEmpty(imgURL)){
            Glide.with(context ).load(imgURL.trim()).into(iv);
        }
    }

    public static void load(Context context , ImageView iv , String imgURL){
        if (!TextUtils.isEmpty(imgURL)){
            Glide.with(context ).load(imgURL.trim()).into(iv);
        }
    }

}
