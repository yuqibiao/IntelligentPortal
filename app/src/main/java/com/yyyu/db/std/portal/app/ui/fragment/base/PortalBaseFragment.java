package com.yyyu.db.std.portal.app.ui.fragment.base;

import com.hjq.toast.ToastUtils;
import com.hjq.toast.style.ToastWhiteStyle;
import com.yyyu.baselibrary.template.BaseFragment;
import com.yyyu.db.std.portal.app.ui.dialog.LoadingDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 功能：智遂通-Fragment基类
 *
 * @author yu
 * @version 1.0
 * @date 2022-11-30
 */
public abstract class PortalBaseFragment extends BaseFragment {

    private Unbinder mUnbind;
    private LoadingDialog loadingDialog;

    @Override
    protected void beforeInit() {
        super.beforeInit();
        mUnbind = ButterKnife.bind(this, rootView);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbind.unbind();
    }

    protected void showLoadingDialog() {
        loadingDialog = new LoadingDialog(getContext());
        loadingDialog.show();
    }

    protected void showLoadingDialog(String tipStr) {
        loadingDialog = new LoadingDialog(getContext());
        loadingDialog.show(tipStr);
    }

    protected void dismissLoadingDialog() {
        if (loadingDialog!=null){
            loadingDialog.dismiss();
        }
    }

    protected void showToast(int resId){
        ToastUtils.initStyle(new ToastWhiteStyle());
        ToastUtils.show(resId);
    }

    protected void showToast(String str){
        ToastUtils.initStyle(new ToastWhiteStyle());
        ToastUtils.show(str);
    }


}
