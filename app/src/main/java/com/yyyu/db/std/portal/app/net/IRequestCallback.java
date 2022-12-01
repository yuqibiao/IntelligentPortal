package com.yyyu.db.std.portal.app.net;

/**
 * 功能：网络请求回调
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-11-30
 */

public interface IRequestCallback<T> {

    void onSuccess(T result);

    void onFailure(Throwable throwable);
}
