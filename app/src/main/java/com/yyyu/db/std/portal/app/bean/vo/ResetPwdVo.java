package com.yyyu.db.std.portal.app.bean.vo;

/**
 * 功能：
 *
 * @author yu
 * @date 2019/7/3
 */
public class ResetPwdVo {

    /**
     * mobile : 18771983684
     * code : 123456
     * password : 123456
     */
    private String mobile;
    private String code;
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
