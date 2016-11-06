package tck.cn.myteam.api;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import tck.cn.myteam.model.bean.NewsBean;


/**
 * Description :
 * <p>
 * Created by tck on 2016/11/6.
 */

public interface NewsApi {

    @GET("action/apiv2/news")
    Observable<NewsBean> getInfomation(@Query("pageToken") String pageToken);
}
