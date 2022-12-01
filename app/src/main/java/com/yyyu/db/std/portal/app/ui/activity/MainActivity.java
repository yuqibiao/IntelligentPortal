package com.yyyu.db.std.portal.app.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.yinglan.alphatabs.AlphaTabsIndicator;
import com.yinglan.alphatabs.OnTabChangedListner;
import com.yyyu.db.std.portal.app.MyApplication;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.bean.msg.TokenExprMsg;
import com.yyyu.db.std.portal.app.ui.activity.base.ToolbarBaseActivity;
import com.yyyu.db.std.portal.app.ui.fragment.main.HomeFragment;
import com.yyyu.db.std.portal.app.ui.fragment.main.MyFragment;
import com.yyyu.db.std.portal.app.ui.fragment.main.TaskFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import de.greenrobot.event.Subscribe;
import de.greenrobot.event.ThreadMode;

/**
 * 功能：主页面
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-11-30
 */
public class MainActivity extends ToolbarBaseActivity {

    @BindView(R.id.vp_home)
    ViewPager vpHome;
    @BindView(R.id.ati_menu)
    AlphaTabsIndicator atiMenu;


    private MyApplication application;

    private final List<Fragment> mTabs = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void beforeInit() {
        super.beforeInit();
        application = (MyApplication) getApplication();
        //初始化tab数据
        mTabs.add(new HomeFragment());
        mTabs.add(new TaskFragment());
        mTabs.add(new MyFragment());
    }

    @Override
    protected void initView() {
        setTbTitle("首页");
        //初始化tab
        vpHome.setOffscreenPageLimit(3);
        vpHome.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mTabs.get(position);
            }

            @Override
            public int getCount() {
                return mTabs.size();
            }
        });
        atiMenu.setViewPager(vpHome);
        atiMenu.setTabCurrenItem(0);
        vpHome.setCurrentItem(0);
    }

    @Override
    protected void initListener() {

        //tab切换事件
        atiMenu.setOnTabChangedListner(new OnTabChangedListner() {
            @Override
            public void onTabSelected(final int tabNum) {
                switch (tabNum) {
                    case 0:
                        setTbTitle("首页");
                        break;
                    case 1:
                        setTbTitle("巡检任务");
                        break;
                    case 2:
                        setTbTitle("我的账号");
                        break;
                }
            }
        });
    }

    @Override
    protected void initData() {
        super.initData();

    }

    public static void startAction(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    /**
     * token过期消息处理
     *
     * @param msg
     */
    @Subscribe(threadMode = ThreadMode.MainThread)
    public void handleTokenExpMsg(TokenExprMsg msg) {
        if (application.hasLogin()) {
            application.logout();
        }
    }

}
