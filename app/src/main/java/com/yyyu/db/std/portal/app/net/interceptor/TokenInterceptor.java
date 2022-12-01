package com.yyyu.db.std.portal.app.net.interceptor;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.yyyu.baselibrary.utils.MyLog;
import com.yyyu.db.std.portal.app.bean.msg.TokenExprMsg;
import com.yyyu.db.std.portal.app.bean.rtn.OprExeRtn;
import com.yyyu.db.std.portal.app.global.Constants;
import com.yyyu.db.std.portal.app.global.StateCode;

import java.io.IOException;
import java.nio.charset.Charset;

import de.greenrobot.event.EventBus;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;

/**
 * 功能：token拦截器
 *
 * @author yu
 * @date 2019/7/3
 */
public class TokenInterceptor implements Interceptor {

    private Gson mGson = new Gson();

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        String token = Constants.token;
        MyLog.d("OkHttpClient: OkHttpMessage","token："+token);
        if(!TextUtils.isEmpty(token)){
            builder.addHeader("Authorization" , "Bearer "+token);
        }
        Request request = builder.build();
        Response response = chain.proceed(request);
        //String result = new String(response.body().bytes());
        ResponseBody responseBody = response.body();
        BufferedSource source = responseBody.source();
        source.request(Long.MAX_VALUE); // request the entire body.
        Buffer buffer = source.buffer();
        String result = buffer.clone().readString(Charset.forName("UTF-8"));
        OprExeRtn oprExeRtn = mGson.fromJson(result, OprExeRtn.class);
        String status = oprExeRtn.getCode();
        //token无效或过期
        if (StateCode.Net.TOKEN_EXPIRE.equals(status)){
            EventBus.getDefault().post(new TokenExprMsg("token无效或过期"));
        }
        return response;
    }
}
