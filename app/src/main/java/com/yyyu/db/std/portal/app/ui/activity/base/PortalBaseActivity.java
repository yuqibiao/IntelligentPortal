/*
 * Copyright 2000 - 2021. YGSoft.Inc All Rights Reserved.
 */

package com.yyyu.db.std.portal.app.ui.activity.base;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;

import com.hjq.toast.ToastUtils;
import com.hjq.toast.style.ToastWhiteStyle;
import com.yyyu.baselibrary.utils.DimensChange;
import com.yyyu.db.std.portal.base.template.BaseActivity;
import com.yyyu.baselibrary.utils.StatusBarCompat;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.ui.dialog.LoadingDialog;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 功能：智隧通基类Activity
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-11-30
 */
public abstract class PortalBaseActivity extends BaseActivity {

    protected Unbinder mUnbind;
    private LoadingDialog loadingDialog;

    @Override
    public void beforeInit() {
        super.beforeInit();
        setActPortrait();//竖屏显示
        mUnbind = ButterKnife.bind(this);
        if (setDefaultStatusBarCompat()) {
            StatusBarCompat.compat(this, getResources().getColor(R.color.colorPrimaryDark));
        }
    }

    @Override
    protected void afterInit() {
        super.afterInit();
    }

    @Override
    public void beforeSetContentView() {
        super.beforeSetContentView();
    }

    protected boolean setDefaultStatusBarCompat() {
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbind != null) {
            mUnbind.unbind();
        }
    }

    /**
     * 显示加载框
     *
     */
    public void showLoadingDialog() {
        if (loadingDialog == null) {
            loadingDialog = new LoadingDialog(this);
        }
        loadingDialog.show();
    }

    /**
     * 显示加载框
     *
     * @param tipStr 加载提示
     */
    public void showLoadingDialog(String tipStr) {
        if (loadingDialog == null) {
            loadingDialog = new LoadingDialog(this);
        }
        loadingDialog.show(tipStr);
    }

    public void dismissLoadingDialog() {
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
    }

    /**
     * 显示toast
     *
     * @param resId
     */
    public void showToast(int resId) {
        ToastUtils.initStyle(new ToastWhiteStyle());
        ToastUtils.setGravity(Gravity.BOTTOM, 0, DimensChange.dp2px(this, 56));
        ToastUtils.show(resId);
    }

    /**
     * 显示toast
     *
     * @param str
     */
    public void showToast(String str) {
        ToastUtils.initStyle(new ToastWhiteStyle());
        ToastUtils.setGravity(Gravity.BOTTOM, 0, DimensChange.dp2px(this, 70));
        ToastUtils.show(str);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        List<Fragment> fragments = supportFragmentManager.getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                fragment.onActivityResult(requestCode, resultCode, data);
            }
        }
    }

}
