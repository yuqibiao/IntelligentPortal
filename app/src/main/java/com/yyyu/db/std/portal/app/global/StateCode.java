package com.yyyu.db.std.portal.app.global;

/**
 * 功能：状态码
 *
 * @author yu
 * @date 2019/7/12
 */
public interface StateCode {

    /**
     * 网络请求状态码
     */
    interface Net {
        //请求成功
        String OK = "200";
        //业务执行异常（自定义)
        String EXE_BUS_EXP = "400";
        //服务内部错误
        String SRV_INNER_ERROR = "500";
        //TOKEN失效（登录过期）
        String TOKEN_EXPIRE = "A0230";
    }


}
