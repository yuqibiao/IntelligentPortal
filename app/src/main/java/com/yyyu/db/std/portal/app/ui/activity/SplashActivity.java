package com.yyyu.db.std.portal.app.ui.activity;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.yyyu.baselibrary.ui.widget.RoundImageView;
import com.yyyu.baselibrary.utils.StatusBarCompat;
import com.yyyu.db.std.portal.app.MyApplication;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.ui.activity.base.PortalBaseActivity;

import butterknife.BindView;

/**
 * 功能：闪屏页
 *
 * @author yyyu
 * @version 1.0
 * @date 2019/6/7
 */
public class SplashActivity extends PortalBaseActivity {

    @BindView(R.id.iv_splash)
    RoundImageView ivSplash;
    private MyApplication application;

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
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
        StatusBarCompat.compat(this, getResources().getColor(R.color.my_white));
        application = (MyApplication) getApplication();
    }

    @Override
    protected void initView() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_anime);
        ivSplash.setAnimation(animation);
        animation.start();
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
               if ( application.hasLogin()){
                   MainActivity.startAction(SplashActivity.this);
               }else{
                   LoginActivity.startAction(SplashActivity.this);
               }

                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    @Override
    protected void initListener() {

    }
}
