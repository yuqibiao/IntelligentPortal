package com.yyyu.db.std.portal.app.ui.dialog.base;

import android.content.Context;

import com.yyyu.baselibrary.template.BaseDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 功能：智能审计 基类Dialog
 *
 * @author yyyu
 * @version 1.0
 * @date 2021/05/31
 */
public abstract class PortalBaseDialog extends BaseDialog {

    private Unbinder mUnbind;

    public PortalBaseDialog(Context context) {
        super(context);
    }

    @Override
    public void beforeInit() {
        super.beforeInit();
        mUnbind = ButterKnife.bind(this, rootView);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mUnbind.unbind();
    }
}
