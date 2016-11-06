package tck.cn.myteam.model;

import android.support.v4.app.Fragment;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/6.
 */

public class NewsFragmentModel {

    public String titles;

    public Fragment mFragment;

    public NewsFragmentModel(String titles, Fragment fragment) {
        this.titles = titles;
        mFragment = fragment;
    }
}
