package com.yyyu.db.std.portal.app.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.bean.LeftMenuBean;

import java.util.List;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2021-06-01
 */
public class LeftMenuAdapter extends BaseQuickAdapter<LeftMenuBean, BaseViewHolder> {

    public LeftMenuAdapter(int layoutResId, @Nullable List<LeftMenuBean> data) {
        super(layoutResId, data);
    }

    public LeftMenuAdapter(@Nullable List<LeftMenuBean> data) {
        this(R.layout.item_ll_left_menu, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, LeftMenuBean item) {
        helper.setText(R.id.tv_menu_title, "" + item.getTitle());
        if (item.isSelected()) {//选中
            helper.setBackgroundColor(R.id.v_left_line, mContext.getResources().getColor(R.color.colorAccent));
            helper.setBackgroundColor(R.id.ll_bg, mContext.getResources().getColor(R.color.leftMenuSelected));
        } else {//未选中
            helper.setBackgroundColor(R.id.v_left_line, mContext.getResources().getColor(R.color.trans));
            helper.setBackgroundColor(R.id.ll_bg, mContext.getResources().getColor(R.color.leftMenuUnSelected));
        }
    }
}
