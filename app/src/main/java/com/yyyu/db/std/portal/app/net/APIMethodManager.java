package com.yyyu.db.std.portal.app.net;

import com.google.gson.Gson;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.yyyu.db.std.portal.app.bean.rtn.GetDeviceDetailBtn;
import com.yyyu.db.std.portal.app.bean.rtn.GetDeviceListBtn;
import com.yyyu.db.std.portal.app.bean.rtn.GetDeviceTypeDictTreeBtn;
import com.yyyu.db.std.portal.app.bean.rtn.GetSysTypeDictTreeRtn;
import com.yyyu.db.std.portal.app.bean.rtn.LoginRtn;
import com.yyyu.db.std.portal.app.bean.rtn.OprExeRtn;
import com.yyyu.db.std.portal.app.bean.vo.GetDeviceDetailVo;
import com.yyyu.db.std.portal.app.bean.vo.GetDeviceListVo;
import com.yyyu.db.std.portal.app.bean.vo.GetDeviceTypeDictTreeVo;
import com.yyyu.db.std.portal.app.bean.vo.LoginVo;
import com.yyyu.db.std.portal.app.net.api.PortalNetApi;
import com.yyyu.baselibrary.utils.BeanUtils;

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
 * @date 2022-11-30
 */

public class APIMethodManager {


    private final PortalNetApi netApi;
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

    /**
     * 获取系统类型字典树
     *
     * @param provider
     * @param callback
     * @return
     */
    public Disposable getSysTypeDictTree(LifecycleProvider<ActivityEvent> provider,
                                         final IRequestCallback<GetSysTypeDictTreeRtn> callback) {
        Disposable subscribe = netApi.getSysTypeDictTree()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(provider.<GetSysTypeDictTreeRtn>bindToLifecycle())
                .subscribe(new Consumer<GetSysTypeDictTreeRtn>() {
                    @Override
                    public void accept(GetSysTypeDictTreeRtn res) throws Exception {
                        callback.onSuccess(res);
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
     * 获取设备类型字典树
     *
     * @param provider
     * @param getDeviceTypeDictTreeVo
     * @param callback
     * @return
     */
    public Disposable getDeviceTypeDictTree(LifecycleProvider<ActivityEvent> provider,
                                            GetDeviceTypeDictTreeVo getDeviceTypeDictTreeVo,
                                            final IRequestCallback<GetDeviceTypeDictTreeBtn> callback) {
        Disposable subscribe = netApi.getDeviceTypeDictTree(getDeviceTypeDictTreeVo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(provider.<GetDeviceTypeDictTreeBtn>bindToLifecycle())
                .subscribe(new Consumer<GetDeviceTypeDictTreeBtn>() {
                    @Override
                    public void accept(GetDeviceTypeDictTreeBtn res) throws Exception {
                        callback.onSuccess(res);
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
     * 获取设备列表
     *
     * @param provider
     * @param getDeviceListVo
     * @param callback
     * @return
     */
    public Disposable getDeviceList(LifecycleProvider<ActivityEvent> provider,
                                    GetDeviceListVo getDeviceListVo,
                                    final IRequestCallback<GetDeviceListBtn> callback) {
        Disposable subscribe = netApi.getDeviceList(getDeviceListVo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(provider.<GetDeviceListBtn>bindToLifecycle())
                .subscribe(new Consumer<GetDeviceListBtn>() {
                    @Override
                    public void accept(GetDeviceListBtn res) throws Exception {
                        callback.onSuccess(res);
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
     * 获取设备详情
     *
     * @param provider
     * @param getDeviceDetailVo
     * @param callback
     * @return
     */
    public Disposable getDeviceDetail(LifecycleProvider<ActivityEvent> provider,
                                      GetDeviceDetailVo getDeviceDetailVo,
                                      final IRequestCallback<GetDeviceDetailBtn> callback) {
        Disposable subscribe = netApi.getDeviceDetail(getDeviceDetailVo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(provider.<GetDeviceDetailBtn>bindToLifecycle())
                .subscribe(new Consumer<GetDeviceDetailBtn>() {
                    @Override
                    public void accept(GetDeviceDetailBtn res) throws Exception {
                        callback.onSuccess(res);
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
