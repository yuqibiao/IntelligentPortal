/*
 * Copyright 2000 - 2021. YGSoft.Inc All Rights Reserved.
 */

package com.yyyu.db.std.portal.app.ui.activity.base;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yyyu.baselibrary.utils.DimensChange;
import com.yyyu.db.std.portal.app.R;

/**
 * 功能：带toolbar的基类Activity
 *
 * @author yu
 * @date 2021/06/21
 */
public abstract class ToolbarBaseActivity extends PortalBaseActivity {

    private TextView tbTitle;

    @Override
    public void beforeInit() {
        super.beforeInit();
        inflateToolBar();
        initTbListener();
    }

    private void inflateToolBar() {
        ViewGroup contentView = this.findViewById(android.R.id.content);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                DimensChange.dp2px(this, 62));
        View toolBar = LayoutInflater.from(this).inflate(R.layout.pt_main_tool_bar, null);
        contentView.addView(toolBar, lp);
        int childCount = contentView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = contentView.getChildAt(i);
            if (childAt.getId() != R.id.ll_toolbar) {
                childAt.setPadding(0, DimensChange.dp2px(this, 62), 0, 0);
            }
        }
        initTbView(toolBar);
    }

    private void initTbView(View toolBar) {
        tbTitle = toolBar.findViewById(R.id.tv_tb_title);
    }

    /**
     * 设置toolbar标题
     *
     * @param title
     */
    protected void setTbTitle(String title){
        tbTitle.setText(title);
    }

    private void initTbListener() {

    }


}
