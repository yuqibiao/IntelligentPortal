package com.yyyu.db.std.portal.app.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.yyyu.db.std.portal.app.MyApplication;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.bean.rtn.LoginRtn;
import com.yyyu.db.std.portal.app.global.StateCode;
import com.yyyu.db.std.portal.app.net.APIMethodManager;
import com.yyyu.db.std.portal.app.net.IRequestCallback;
import com.yyyu.db.std.portal.app.ui.activity.base.PortalBaseActivity;
import com.yyyu.baselibrary.utils.StringUtils;

import butterknife.BindView;

/**
 * 功能：登录页面
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-11-30
 */
public class LoginActivity extends PortalBaseActivity {

    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_no_acc)
    TextView tvNoAcc;
    @BindView(R.id.tv_forget_pwd)
    TextView tvForgetPwd;

    private MyApplication application;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void beforeSetContentView() {
        //全屏显示
        setActFullScreen();
        super.beforeSetContentView();
    }

    @Override
    public void beforeInit() {
        super.beforeInit();
        application = (MyApplication) getApplication();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {
        //登录
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                if (StringUtils.isEmpty(userName)) {
                    showToast("请输入用户名");
                    return;
                }
                if (StringUtils.isEmpty(password)) {
                    showToast("请输入密码");
                    return;
                }
                //登录
                doLogin(userName, password);
            }
        });
        //没有账号
        tvNoAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("联系系统管理员获取账号");
            }
        });
        //忘记密码
        tvForgetPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("联系系统管理员重置密码");
            }
        });
    }

    /**
     * 登录
     *
     * @param userName
     * @param password
     */
    private void doLogin(String userName, String password) {
        APIMethodManager.getInstance().login(provider, userName, password, new IRequestCallback<LoginRtn>() {
            @Override
            public void onSuccess(LoginRtn result) {
                if (StateCode.Net.OK.equals(result.getCode())) {
                    //设置登录信息
                    application.login(result.getData());
                    MainActivity.startAction(LoginActivity.this);
                    finish();
                } else {
                    showToast("" + result.getMsg());
                }
            }

            @Override
            public void onFailure(Throwable throwable) {
                showToast("登录失败：" + throwable.getMessage());
            }
        });
    }

    public static void startAction(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
