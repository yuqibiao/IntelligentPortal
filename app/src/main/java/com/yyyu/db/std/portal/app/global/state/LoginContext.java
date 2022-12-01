package com.yyyu.db.std.portal.app.global.state;

import android.content.Context;

/**
 * 功能：登录状态控制器
 *
 * @author yu
 * @date 2022-11-30
 */
public class LoginContext implements IUserSate {

    //登录状态（默认未登录）
    private IUserSate mUserState = new UserLogoutSate();

    private LoginContext() {

    }

    public static LoginContext getInstance() {

        return SingleInstanceHolder.INSTANCE;
    }

    public static class SingleInstanceHolder {
        static final LoginContext INSTANCE = new LoginContext();
    }

    public void setUserState(IUserSate userState) {
        this.mUserState = userState;
    }

    @Override
    public void userInfo(Context context) {
        mUserState.userInfo(context);
    }


    /**
     * 登录
     */
    public void login() {
        setUserState(new UserLoginState());
    }

    /**
     * 退出登录
     */
    public void logout() {
        setUserState(new UserLogoutSate());
    }

}
