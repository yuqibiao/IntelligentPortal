package com.yyyu.db.std.portal.app.ui.fragment.main;

import android.view.View;
import android.widget.Button;

import com.yyyu.db.std.portal.app.MyApplication;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.bean.rtn.OprExeRtn;
import com.yyyu.db.std.portal.app.global.Constants;
import com.yyyu.db.std.portal.app.global.StateCode;
import com.yyyu.db.std.portal.app.net.APIMethodManager;
import com.yyyu.db.std.portal.app.net.IRequestCallback;
import com.yyyu.db.std.portal.app.ui.fragment.base.PortalBaseFragment;

import butterknife.BindView;

/**
 * 功能：我的
 *
 * @author yyyu
 * @version 1.0
 * @date 2021-06-01
 */
public class MyFragment extends PortalBaseFragment {

    @BindView(R.id.btn_logout)
    Button btnLogout;

    private MyApplication application;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void beforeInit() {
        super.beforeInit();
        application = (MyApplication) getActivity().getApplication();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {
        //登出
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogout();
            }
        });
    }

    /**
     * 登出
     */
    private void doLogout() {
        APIMethodManager.getInstance().logout(provider, new IRequestCallback<OprExeRtn>() {
            @Override
            public void onSuccess(OprExeRtn result) {
                if (StateCode.Net.OK.equals(result.getCode())
                        || StateCode.Net.TOKEN_EXPIRE.equals(result.getCode())) {
                    //退出登录
                    application.logout();
                } else {
                    showToast("" + result.getMsg());
                }
            }

            @Override
            public void onFailure(Throwable throwable) {
                showToast("登出异常：" + throwable.getMessage());
            }
        });
    }
}
