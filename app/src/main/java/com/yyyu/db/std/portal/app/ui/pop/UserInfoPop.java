package com.yyyu.db.std.portal.app.ui.pop;

import android.content.Context;
import android.support.annotation.NonNull;

import com.lxj.xpopup.core.AttachPopupView;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.ui.activity.base.PortalBaseActivity;

/**
 * 功能：个人信息pop
 *
 * @author yyyu
 * @version 1.0
 * @date 2021-06-02
 */
public class UserInfoPop extends AttachPopupView {

    private Context mContext;
    private PortalBaseActivity activity;

    public UserInfoPop(@NonNull Context context) {
        super(context);
        this.mContext = context;
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.pop_user_info;
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        activity = ((PortalBaseActivity) mContext);
        initView();
        initListener();
        initData();
    }


    private void initView() {

    }


    private void initListener() {

    }


    private void initData() {

    }


    //完全可见执行
    @Override
    protected void onShow() {
        super.onShow();
    }

    //完全消失执行
    @Override
    protected void onDismiss() {

    }

    @Override
    protected int getMaxHeight() {
        return getMeasuredHeight();
    }


}
