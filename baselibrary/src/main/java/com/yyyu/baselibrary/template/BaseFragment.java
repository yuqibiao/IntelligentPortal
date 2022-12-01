package com.yyyu.baselibrary.template;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.kaopiz.kprogresshud.KProgressHUD;
import com.trello.navi2.component.support.NaviFragment;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.navi.NaviLifecycle;
import com.yyyu.baselibrary.utils.ResourceUtils;


/**
 * 功能：fragment的基类
 *
 * @author yyyu
 * @version 1.0
 * @date 2017/03/15
 */
public abstract class BaseFragment extends NaviFragment {

    protected final LifecycleProvider<ActivityEvent> provider
            = NaviLifecycle.createActivityLifecycleProvider(this);

    protected Gson mGson;
    protected View rootView;
    private KProgressHUD loadingDialog;
    protected ResourceUtils resourceUtils;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.from(getActivity()).inflate(getLayoutId(), container, false);
        mGson = new Gson();
        resourceUtils = ResourceUtils.getInstance(getContext());
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init() {
        beforeInit();
        initView();
        initListener();
        initData();
        afterInit();
    }

    /**
     * 得到fragment布局文件id的钩子方法
     */
    public abstract int getLayoutId();

    /**
     * 初始化之前：进行一些变量的初始化
     */
    protected void beforeInit() {
    }

    /**
     * 初始化View
     */
    protected abstract void initView();

    /**
     * 初始化监听
     */
    protected abstract void initListener();

    /**
     * 初始化数据
     */
    protected void initData() {
    }

    protected void afterInit() {
    }

    /**
     * 得到资源文件中得String
     *
     * @param resId
     * @return
     */
    protected String getStr(int resId){
        return getResources().getString(resId);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    /**
     * 显示加载框
     *
     * @param tip
     */
    protected  void showLoadDialog(String tip){
        loadingDialog = KProgressHUD.create(getContext())
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel(tip)
                /*.setDetailsLabel("Downloading data")*/
                .setCancellable(true)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)
                .show();
    }

    protected  void dismissLoadingDialog(){
        loadingDialog.dismiss();
    }

}