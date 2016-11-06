package tck.cn.myteam.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import tck.cn.myteam.model.NewsFragmentModel;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/6.
 */

public class NewsContainerFragmentAdapter extends FragmentStatePagerAdapter {
    List<NewsFragmentModel> mNewsFragmentModels;

    public NewsContainerFragmentAdapter(FragmentManager fm, List<NewsFragmentModel> newsFragmentModels) {
        super(fm);
        mNewsFragmentModels = newsFragmentModels;
    }

    @Override
    public Fragment getItem(int position) {
        return mNewsFragmentModels.get(position).mFragment;
    }

    @Override
    public int getCount() {
        return mNewsFragmentModels.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mNewsFragmentModels.get(position).titles;
    }
}
