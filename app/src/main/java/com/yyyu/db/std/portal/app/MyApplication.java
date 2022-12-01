package com.yyyu.db.std.portal.app;

import android.support.multidex.MultiDexApplication;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.hjq.toast.ToastUtils;
import com.yyyu.db.std.portal.app.bean.rtn.UserBean;
import com.yyyu.db.std.portal.app.global.Constants;
import com.yyyu.db.std.portal.app.global.state.LoginContext;
import com.yyyu.db.std.portal.app.ui.activity.LoginActivity;
import com.yyyu.db.std.portal.app.ui.activity.MainActivity;
import com.yyyu.baselibrary.utils.ActivityHolder;
import com.yyyu.baselibrary.utils.MySPUtils;

/**
 * 功能：上下文
 *
 * @author yu
 * @version 1.0
 * @date 2021/05/31
 */
public class MyApplication extends MultiDexApplication {

    private String token;
    private UserBean currentUserInfo;
    private Gson mGson;

    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtils.init(this);
        mGson = new Gson();
    }

    /**
     * 是否已经登录(已经登录就设置当前用户信息)
     *
     * @return
     */
    public boolean hasLogin(){
        String userInfo = (String) MySPUtils.get(getApplicationContext(), Constants.USER_INFO, "");
        if (!TextUtils.isEmpty(userInfo)){
            UserBean userBean = mGson.fromJson(userInfo, UserBean.class);
            setUserInfo(userBean);
            Constants.token = (String) MySPUtils.get(getApplicationContext() , "token" ,"");
            LoginContext.getInstance().login();
            return true;
        }else{
            LoginContext.getInstance().logout();
            return false;
        }
    }

    /**
     * 设置当前用户信息
     *
     * @param userInfo
     */
    public void setUserInfo(UserBean userInfo){
        currentUserInfo = userInfo;
        MySPUtils.put(getApplicationContext() , Constants.USER_INFO  , mGson.toJson(userInfo));
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        MySPUtils.put(this , "token" , token);
        this.token = token;
    }

    /**
     * 获取当前用户信息
     * @return
     */
    public UserBean getUserInfo() {
        if (currentUserInfo == null){
            String info = (String) MySPUtils.get(getApplicationContext(), Constants.USER_INFO, "");
            if (!TextUtils.isEmpty(info)){
                currentUserInfo = mGson.fromJson(info, UserBean.class);
            }
        }
        return currentUserInfo;
    }

    /**
     * 更新用户信息
     *
     * @param userBean
     * @return
     */
    public void updateUserInfo(UserBean userBean){
        setUserInfo(userBean);
        MySPUtils.put(this , Constants.USER_INFO , mGson.toJson(userBean));
    }

    /**
     * 登录
     *
     * @param userInfo
     */
    public void login(UserBean userInfo){
        LoginContext.getInstance().login();
        this.setUserInfo(userInfo);
        String accessToken = userInfo.getAccess_token();
        this.setToken(accessToken);
    }

    /**
     * 退出登录
     */
    public void logout(){
        MySPUtils.remove(getApplicationContext() , Constants.USER_INFO);
        LoginContext.getInstance().logout();
        ActivityHolder.finishedAll();
        LoginActivity.startAction(getApplicationContext());
    }

}
