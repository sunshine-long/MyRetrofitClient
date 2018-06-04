package net.uwonders.myretrofitclientdemo.retrofit;


import net.uwonders.myretrofitclientdemo.Resond;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * 为Retrofit框架提供接口请求注解
 * @author 康龙
 * @date 2017/5/9
 */

public interface BaseApiService {
    public static final String BASE_URL = " http://news-at.zhihu.com/";

    /**
     *(示例无参数请求)
     *获取版本号
     * @param
     * @return
     */
    @GET("/api/4/version/android/2.3.0")
    Observable<Resond> getVerificatCode();

}



