package com.yyyu.db.std.portal.app.adapter;

import android.support.annotation.Nullable;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.bean.PrjAuditCenterBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2021-06-02
 */
public class PrjAuditCenterAdapter extends BaseQuickAdapter<PrjAuditCenterBean, BaseViewHolder> {

    List<PrjAuditCenterBean> mData;

    public PrjAuditCenterAdapter(int layoutResId, @Nullable List<PrjAuditCenterBean> data) {
        super(layoutResId, data);
        mData = data;
    }

    public PrjAuditCenterAdapter(@Nullable List<PrjAuditCenterBean> data) {
        this(R.layout.item_rv_prj_audit_center, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final PrjAuditCenterBean item) {
        helper.setChecked(R.id.cb_item_audit, item.isSelected());
        final CheckBox cbAudit = helper.getView(R.id.cb_item_audit);
        cbAudit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                item.setSelected(b);
            }
        });
        helper.addOnClickListener(R.id.cb_item_audit);
    }

    /**
     * 获取选中
     *
     * @return
     */
    public List<PrjAuditCenterBean> getSelected(){
        List<PrjAuditCenterBean> selectedList = new ArrayList<>();
        for (PrjAuditCenterBean bean : mData) {
           if(bean.isSelected()){
               selectedList.add(bean);
           }
        }
        return selectedList;
    }

    /**
     * 是否全选了
     * @return
     */
    public boolean isSelectedAll(){
        boolean isSelectedAll = true;
        for (PrjAuditCenterBean bean : mData) {
           if(!bean.isSelected()){
               isSelectedAll = false;
           }
        }
        return isSelectedAll;
    }

    /**
     * 全不选
     */
    public void unSelectedAll(){
        for (PrjAuditCenterBean bean : mData) {
            bean.setSelected(false);
        }
        notifyDataSetChanged();
    }

    /**
     * 全选
     */
    public void selectedAll(){
        for (PrjAuditCenterBean bean : mData) {
            bean.setSelected(true);
        }
        notifyDataSetChanged();
    }

}
