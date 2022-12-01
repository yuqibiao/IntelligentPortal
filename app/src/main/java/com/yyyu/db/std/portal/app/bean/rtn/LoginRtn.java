package com.yyyu.db.std.portal.app.bean.rtn;

/**
 * 功能：登录返回信息
 *
 * @author yu
 * @date 2019/7/3
 */
public class LoginRtn {

    private String code;
    private UserBean data;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserBean getData() {
        return data;
    }

    public void setData(UserBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
