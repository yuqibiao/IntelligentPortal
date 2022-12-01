package com.yyyu.db.std.portal.app.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.yyyu.baselibrary.utils.DimensChange;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.ui.dialog.base.PortalBaseDialog;


/**
 * 功能：加载框
 *
 * @author yu
 * @version 1.0
 * @date 2021/05/31
 */
public class LoadingDialog extends PortalBaseDialog {


    public LoadingDialog(Context context) {
        super(context);
        this.setCanceledOnTouchOutside(false);//默认点击外面可消失
    }

    @Override
    protected WindowManager.LayoutParams getLayoutParams() {
        lp.width = DimensChange.dp2px(getContext(), 100);
        lp.height = DimensChange.dp2px(getContext(), 100);
        return lp;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.dialog_loading;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    public void show(String tipStr) {
        setTip(tipStr);
        show();
    }

    private void setTip(String tipStr) {
        TextView tv_tip = getView(R.id.tv_tip);
        tv_tip.setText(tipStr);
        tv_tip.setVisibility(View.VISIBLE);
    }

}
