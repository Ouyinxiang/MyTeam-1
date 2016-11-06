package tck.cn.myteam;

import android.app.Application;
import android.content.Context;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/5.
 */

public class App extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
}
