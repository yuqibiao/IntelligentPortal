package com.yyyu.db.std.portal.app.bean.rtn;

/**
 * 用户登录返回信息
 */
public class UserBean {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private Object operation_company_id;
    private String user_id;
    private Object app_id;
    private String client_id;
    private String org_id;
    private Object operation_group_id;
    private String jti;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Object getOperation_company_id() {
        return operation_company_id;
    }

    public void setOperation_company_id(Object operation_company_id) {
        this.operation_company_id = operation_company_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Object getApp_id() {
        return app_id;
    }

    public void setApp_id(Object app_id) {
        this.app_id = app_id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public Object getOperation_group_id() {
        return operation_group_id;
    }

    public void setOperation_group_id(Object operation_group_id) {
        this.operation_group_id = operation_group_id;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }
}