package com.yyyu.db.std.portal.app.net;

import com.google.gson.Gson;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.yyyu.db.std.portal.app.bean.rtn.GetProductListRtn;
import com.yyyu.db.std.portal.app.bean.rtn.LoginRtn;
import com.yyyu.db.std.portal.app.bean.rtn.OprExeRtn;
import com.yyyu.db.std.portal.app.bean.vo.GetProductListVo;
import com.yyyu.db.std.portal.app.bean.vo.LoginVo;
import com.yyyu.db.std.portal.app.net.api.AuditNetApi;
import com.yyyu.db.std.portal.app.utils.BeanUtils;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * 功能：网络请求API的统一管理类，和其它组件进行交互
 *
 * @author yu
 * @version 1.0
 * @date 2019/6/3
 */

public class APIMethodManager {


    private final AuditNetApi netApi;
    private final Gson mGson;

    private APIMethodManager() {
        APIFactory apiFactory = APIFactory.getInstance();
        netApi = apiFactory.createApi();
        mGson = new Gson();
    }

    private static class SingletonHolder {
        private static final APIMethodManager INSTANCE = new APIMethodManager();
    }

    public static APIMethodManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 获取商品列表
     *
     * @param provider
     * @param productListVo
     * @param callback
     * @return
     */
    public Disposable getProductList(LifecycleProvider<ActivityEvent> provider
            , GetProductListVo productListVo
            , final IRequestCallback<GetProductListRtn> callback) {

        Disposable subscribe = netApi.getProductList(productListVo.getTag()
                , "" + productListVo.isRecommend()
                , productListVo.getProps()
                , productListVo.getIdList()
                , "" + productListVo.getCategoryId()
                , "" + productListVo.getBrandId()
                , productListVo.getTitle())
                .compose(provider.<GetProductListRtn>bindToLifecycle())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GetProductListRtn>() {
                    @Override
                    public void accept(GetProductListRtn getProductListRtn) throws Exception {
                        callback.onSuccess(getProductListRtn);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        callback.onFailure(throwable);
                    }
                });

        return subscribe;
    }

    /**
     * 登录
     *
     * @param provider
     * @param username
     * @param password
     * @param callback
     * @return
     */
    public Disposable login(LifecycleProvider<ActivityEvent> provider, String username, String password,
                            final IRequestCallback<LoginRtn> callback) {
        LoginVo loginVo = new LoginVo();
        loginVo.setClient_id("portal");
        loginVo.setClient_secret("123456");
        loginVo.setGrant_type("password");
        loginVo.setUsername(username);
        loginVo.setPassword(password);
        Map params = BeanUtils.beanToMap(loginVo, true);
        Disposable subscribe = netApi.login(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(provider.<LoginRtn>bindToLifecycle())
                .subscribe(new Consumer<LoginRtn>() {
                    @Override
                    public void accept(LoginRtn loginRtn) throws Exception {
                        callback.onSuccess(loginRtn);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        callback.onFailure(throwable);
                    }
                });

        return subscribe;
    }

    /**
     * 登出
     *
     * @param provider
     * @param callback
     * @return
     */
    public Disposable logout(LifecycleProvider<ActivityEvent> provider,
                            final IRequestCallback<OprExeRtn> callback) {
        Disposable subscribe = netApi.logout()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(provider.<OprExeRtn>bindToLifecycle())
                .subscribe(new Consumer<OprExeRtn>() {
                    @Override
                    public void accept(OprExeRtn loginRtn) throws Exception {
                        callback.onSuccess(loginRtn);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        callback.onFailure(throwable);
                    }
                });

        return subscribe;
    }

}
