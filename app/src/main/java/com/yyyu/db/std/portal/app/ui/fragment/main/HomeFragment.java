package com.yyyu.db.std.portal.app.ui.fragment.main;

import com.yyyu.baselibrary.utils.MyLog;
import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.bean.rtn.GetDeviceTypeDictTreeBtn;
import com.yyyu.db.std.portal.app.bean.vo.GetDeviceTypeDictTreeVo;
import com.yyyu.db.std.portal.app.net.APIMethodManager;
import com.yyyu.db.std.portal.app.net.IRequestCallback;
import com.yyyu.db.std.portal.app.ui.fragment.base.PortalBaseFragment;

/**
 * 功能：首页
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-11-30
 */
public class HomeFragment extends PortalBaseFragment {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        super.initData();
        //获取设备类型字典树
        GetDeviceTypeDictTreeVo getDeviceTypeDictTreeVo = new GetDeviceTypeDictTreeVo();
        getDeviceTypeDictTreeVo.setParentCode("13XXXX");
        showLoadingDialog();
        APIMethodManager.getInstance().getDeviceTypeDictTree(provider, getDeviceTypeDictTreeVo,
                new IRequestCallback<GetDeviceTypeDictTreeBtn>() {
                    @Override
                    public void onSuccess(GetDeviceTypeDictTreeBtn result) {
                        MyLog.e("result："+result.getCode());
                        dismissLoadingDialog();
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        showToast("网络请求异常："+throwable.getMessage());
                        dismissLoadingDialog();
                    }
                });
    }
}
