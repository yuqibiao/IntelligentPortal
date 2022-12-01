package com.yyyu.db.std.portal.app.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.bean.PrjAuditTopBean;

import java.util.List;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2021-06-02
 */
public class PrjAuditTopAdapter extends BaseQuickAdapter<PrjAuditTopBean , BaseViewHolder> {
    public PrjAuditTopAdapter(int layoutResId, @Nullable List<PrjAuditTopBean> data) {
        super(layoutResId, data);
    }

    public PrjAuditTopAdapter(@Nullable List<PrjAuditTopBean> data) {
        this(R.layout.item_rv_prj_audit_top, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PrjAuditTopBean item) {

    }
}
