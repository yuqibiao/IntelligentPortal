/*
 * Copyright 2000 - 2021. YGSoft.Inc All Rights Reserved.
 */

package com.yyyu.db.std.portal.base.template;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.google.gson.Gson;
import com.kaopiz.kprogresshud.KProgressHUD;
import com.trello.navi2.component.support.NaviAppCompatActivity;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.navi.NaviLifecycle;
import com.yyyu.baselibrary.utils.ActivityHolder;
import com.yyyu.baselibrary.utils.ResourceUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * 功能：Activity的基类
 *
 * @author yyyu
 * @version 1.0
 * @date 2017/3/13
 */
public abstract class BaseActivity extends NaviAppCompatActivity {

    private static final String TAG = "BaseActivity";

    protected final LifecycleProvider<ActivityEvent> provider
            = NaviLifecycle.createActivityLifecycleProvider(this);

    protected Gson mGson;
    private KProgressHUD loadingDialog;
    protected ResourceUtils resourceUtils;
    protected Class _this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: 当前显示的Activity是========" + this.getClass().getName());
        ActivityHolder.addActivity(this);
        beforeSetContentView();
        setContentView(getLayoutId());
        mGson = new Gson();
        resourceUtils = ResourceUtils.getInstance(getApplicationContext());
        init();
    }

    public void beforeSetContentView() {

    }

    private void init() {
        beforeInit();
        initView();
        initListener();
        initData();
        afterInit();
    }

    /**
     * 钩子方法：得到layout的资源Id
     *
     * @return
     */
    public abstract int getLayoutId();

    public void beforeInit() {

    }

    /**
     * 初始化View
     */
    protected abstract void initView();

    /**
     * 注册监听
     */
    protected abstract void initListener();

    /**
     * 初始化数据
     */
    protected void initData() {
    }

    /**
     * 初始化之后
     */
    protected void afterInit() {

    }

    /**
     * 得到资源文件中得String
     *
     * @param resId
     * @return
     */
    protected String getStr(int resId) {

        return getResources().getString(resId);
    }

    /**
     * 得到颜色
     *
     * @param colorId
     * @return
     */
    protected int getMyColor(int colorId) {
        return getResources().getColor(colorId);
    }

    /**
     * 显示加载框
     *
     * @param tip
     */
    protected void showLoadDialog(String tip) {
        loadingDialog = KProgressHUD.create(this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel(tip)
                /*.setDetailsLabel("Downloading data")*/
                .setCancellable(true)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)
                .show();
    }

    protected void dismissLoadDialog() {
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityHolder.removeActivity(this);
    }

    private Set<Fragment> addedFragment = new HashSet<>();

    /**
     * 切换fragment（默认复用旧fragment）
     *
     * @param resId
     * @param fragment
     */
    protected void switchFragment(int resId, Fragment fragment) {
        switchFragment(resId, fragment, false);
    }

    /**
     * 切换fragment
     *
     * @param resId
     * @param fragment
     * @param isNew    是否复用旧fragment
     */
    protected void switchFragment(int resId, Fragment fragment, boolean isNew) {
        if (isNew) {
            replaceFrg(resId, fragment);
        } else {
            addFragment(resId, fragment);
        }
    }

    /**
     * 切换fragment（复用旧得fragment）
     *
     * @param resId
     * @param fragment
     */
    protected void addFragment(int resId, Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (!addedFragment.contains(fragment)) {
            transaction.add(resId, fragment);
            addedFragment.add(fragment);
        }
        hideAllFragment(transaction, addedFragment);
        transaction.show(fragment);
        transaction.commit();
    }

    private void hideAllFragment(FragmentTransaction transaction, Set<Fragment> fragments) {
        for (Fragment fragment : fragments) {
            transaction.hide(fragment);
        }
    }


    /**
     * 切换fragment（每次new新得fragment）
     *
     * @param resId
     * @param fragment
     */
    protected void replaceFrg(int resId, Fragment fragment) {
        replaceFrg(resId, fragment, false);
    }

    private void replaceFrg(int resId, Fragment fragment, boolean addToBackStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(resId, fragment);
        if (addToBackStack) {
            ft.addToBackStack(null);
        }
        ft.commit();
    }

    /**
     * 设置动画
     */
    protected void setTransition() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setEnterTransition(new Fade());
            getWindow().setReturnTransition(new Fade());
            getWindow().setSharedElementReturnTransition(new ChangeBounds());
            getWindow().setSharedElementEnterTransition(new ChangeBounds());
        }
    }

    /**
     * 设置竖屏显示
     */
    protected void setActPortrait() {
        if (getResources().getConfiguration().orientation != Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

    /**
     * 设置横屏
     */
    protected void setActLandscape() {
        if (getResources().getConfiguration().orientation != Configuration.ORIENTATION_LANDSCAPE) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }

    protected void  setActFullScreen(){
        // 设置为无标题(去掉Android自带的标题栏)，(全屏功能与此无关)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        // 设置为全屏模式
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


}