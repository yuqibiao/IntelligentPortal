package com.yyyu.db.std.portal.app.bean.rtn;

/**
 * 功能：通用操作类返回结果
 *
 * @author yu
 * @date 2019/7/3
 */
public class OprExeRtn {

    private String code;
    private Object data;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
