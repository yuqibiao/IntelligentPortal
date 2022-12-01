package com.yyyu.db.std.portal.app.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.yyyu.baselibrary.utils.MyLog;
import com.yyyu.db.std.portal.app.net.api.PortalNetApi;
import com.yyyu.db.std.portal.app.net.gson.DoubleDefault0Adapter;
import com.yyyu.db.std.portal.app.net.gson.IntegerDefault0Adapter;
import com.yyyu.db.std.portal.app.net.gson.LongDefault0Adapter;
import com.yyyu.db.std.portal.app.net.interceptor.TokenInterceptor;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 功能：retrofit 网络请求创建
 *
 * @author yu
 * @version 1.0
 * @date 2022-11-30
 */

public class APIFactory {

    public static final String BASE_URL = "http://106.14.75.32:60000/";

    private static final int DEFAULT_TIMEOUT = 1;

    private Retrofit.Builder builder;


    private APIFactory() {
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        //新建log拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                if (message.length()<1*1024*1024){
                    MyLog.i("APIFactory: OkHttpClient", "OkHttpMessage:" + message);
                }
            }
        });
        loggingInterceptor.setLevel(level);
        OkHttpClient.Builder httpClientBuild = new OkHttpClient.Builder();
        httpClientBuild.addInterceptor(loggingInterceptor);
        httpClientBuild.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.MINUTES);
        httpClientBuild.readTimeout(DEFAULT_TIMEOUT, TimeUnit.MINUTES);
        httpClientBuild.writeTimeout(DEFAULT_TIMEOUT, TimeUnit.MINUTES);
        //token拦截
        httpClientBuild.addInterceptor(new TokenInterceptor());
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder
                .registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
                    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                        return new Date(json.getAsJsonPrimitive().getAsLong());
                    }
                })
                .registerTypeAdapter(Integer.class, new IntegerDefault0Adapter())
                .registerTypeAdapter(int.class, new IntegerDefault0Adapter())
                .registerTypeAdapter(Double.class, new DoubleDefault0Adapter())
                .registerTypeAdapter(double.class, new DoubleDefault0Adapter())
                .registerTypeAdapter(Long.class, new LongDefault0Adapter())
                .registerTypeAdapter(long.class, new LongDefault0Adapter());
        Gson gson = gsonBuilder.create();
        builder = new Retrofit.Builder()
                .client(httpClientBuild.build())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
    }

    private static class SingletonHolder {
        private static final APIFactory INSTANCE = new APIFactory();
    }

    public static APIFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public PortalNetApi createApi() {
        Retrofit retrofit = builder.baseUrl(BASE_URL).build();
        PortalNetApi netApi = retrofit.create(PortalNetApi.class);
        return netApi;
    }


}
