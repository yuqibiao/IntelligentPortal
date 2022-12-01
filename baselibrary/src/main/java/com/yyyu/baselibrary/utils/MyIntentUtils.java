package com.yyyu.baselibrary.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * 功能：系统Intent跳转
 *
 * @author yu
 * @version 1.0
 * @date 2018/6/11
 */
public class MyIntentUtils {


    public static void toCall(Context context , String tel ){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+tel));
        context.startActivity(intent);
    }

}
