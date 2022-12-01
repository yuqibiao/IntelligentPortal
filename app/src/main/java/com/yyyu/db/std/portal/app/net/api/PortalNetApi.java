package com.yyyu.db.std.portal.app.net.api;

import com.yyyu.db.std.portal.app.bean.rtn.GetDeviceDetailBtn;
import com.yyyu.db.std.portal.app.bean.rtn.GetDeviceListBtn;
import com.yyyu.db.std.portal.app.bean.rtn.GetDeviceTypeDictTreeBtn;
import com.yyyu.db.std.portal.app.bean.rtn.GetSysTypeDictTreeRtn;
import com.yyyu.db.std.portal.app.bean.rtn.LoginRtn;
import com.yyyu.db.std.portal.app.bean.rtn.OprExeRtn;
import com.yyyu.db.std.portal.app.bean.vo.GetDeviceDetailVo;
import com.yyyu.db.std.portal.app.bean.vo.GetDeviceListVo;
import com.yyyu.db.std.portal.app.bean.vo.GetDeviceTypeDictTreeVo;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 功能：网络请求接口
 *
 * @author yu
 * @version 1.0
 * @date 2022-11-30
 */

public interface PortalNetApi {

    /**
     * 登录
     *
     * @param map
     * @return
     */
    @FormUrlEncoded
    @POST("bdmp/public/auth/token")
    Observable<LoginRtn> login(@FieldMap Map<String, Object> map);

    /**
     * 登出
     *
     * @return
     */
    @DELETE("bdmp/public/auth/logout")
    Observable<OprExeRtn> logout();

    /**
     * 获取系统类型字典树
     *
     * @return
     */
    @POST("tunnel/system/dict/system/tree")
    Observable<GetSysTypeDictTreeRtn> getSysTypeDictTree();

    /**
     * 获取设备类型字典树
     *
     * @param getDeviceTypeDictTreeVo
     * @return
     */
    @POST("tunnel/system/dict/assets/tree")
    Observable<GetDeviceTypeDictTreeBtn> getDeviceTypeDictTree(@Body GetDeviceTypeDictTreeVo getDeviceTypeDictTreeVo);

    /**
     * 获取设备列表
     *
     * @param getDeviceListVo
     * @return
     */
    @POST("tunnel/system/device/list")
    Observable<GetDeviceListBtn> getDeviceList(@Body GetDeviceListVo getDeviceListVo);

    /**
     * 获取设备详情
     *
     * @param getDeviceDetailVo
     * @return
     */
    @POST("tunnel/system/device/detail")
    Observable<GetDeviceDetailBtn> getDeviceDetail(@Body GetDeviceDetailVo getDeviceDetailVo);

}
