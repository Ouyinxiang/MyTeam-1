package tck.cn.myteam.util;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import tck.cn.myteam.api.NewsApi;
import tck.cn.myteam.global.Constant;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/6.
 */

public class NetWork {


    private static final int TIME_OUT_LIMIT = 30;
    private OkHttpClient mOkHttpClient;
    private RxJavaCallAdapterFactory mAdapterFactory;
    private GsonConverterFactory mGsonConverterFactory;

    public static NewsApi newsApi;

    public static NewsApi getNewsApi() {
        if (newsApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            newsApi = retrofit.create(NewsApi.class);
        }
        return newsApi;
    }


}
