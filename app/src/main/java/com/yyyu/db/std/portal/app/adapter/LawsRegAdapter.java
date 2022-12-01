package com.yyyu.db.std.portal.app.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.bean.LawsRegBean;

import java.util.List;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2021-06-03
 */
public class LawsRegAdapter extends BaseQuickAdapter<LawsRegBean , BaseViewHolder> {

    public LawsRegAdapter(int layoutResId, @Nullable List<LawsRegBean> data) {
        super(layoutResId, data);
    }

    public LawsRegAdapter(@Nullable List<LawsRegBean> data) {
        this(R.layout.item_rv_laws_reg, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, LawsRegBean item) {

    }
}
