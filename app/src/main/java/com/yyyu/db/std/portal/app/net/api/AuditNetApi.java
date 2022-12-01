package com.yyyu.db.std.portal.app.net.api;

import com.yyyu.db.std.portal.app.bean.rtn.GetProductListRtn;
import com.yyyu.db.std.portal.app.bean.rtn.LoginRtn;
import com.yyyu.db.std.portal.app.bean.rtn.OprExeRtn;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 功能：网络请求接口
 *
 * @author yu
 * @version 1.0
 * @date 2021-05-31
 */

public interface AuditNetApi {

    @GET("api_client/product/list")
    Observable<GetProductListRtn> getProductList(@Query("tag") String tag
            , @Query("isRecommend") String isRecommend
            , @Query("props") String props
            , @Query("idList") String idList
            , @Query("categoryId") String categoryId
            , @Query("brandId") String brandId
            , @Query("title") String title
    );

    /**
     * 登录
     *
     * @param map
     * @return
     */
    @FormUrlEncoded
    @POST("auth/token")
    Observable<LoginRtn> login( @FieldMap Map<String, Object> map);

    /**
     * 登出
     *
     * @return
     */
    @DELETE("auth/logout")
    Observable<OprExeRtn> logout();

}
