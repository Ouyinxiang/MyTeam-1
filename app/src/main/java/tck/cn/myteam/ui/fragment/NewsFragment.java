package tck.cn.myteam.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.TabLayout;

import java.util.ArrayList;
import java.util.List;

import tck.cn.myteam.R;
import tck.cn.myteam.adapter.NewsContainerFragmentAdapter;
import tck.cn.myteam.base.BaseFragment;

import tck.cn.myteam.model.NewsFragmentModel;

import tck.cn.myteam.ui.fragment.newsContainer.ActivityFragment;
import tck.cn.myteam.ui.fragment.newsContainer.AnswerFragment;
import tck.cn.myteam.ui.fragment.newsContainer.BlogFragment;
import tck.cn.myteam.ui.fragment.newsContainer.InfomationFragment;


/**
 * Description :
 * <p>
 * Created by tck on 2016/11/5.
 */

public class NewsFragment extends BaseFragment {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    List<NewsFragmentModel> mNewsFragmentModels = new ArrayList<>();
    private NewsContainerFragmentAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_home_fragment, container, false);
        mTabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        initFragments();
        return view;
    }

    private void initFragments() {
        String[] titles = getResources().getStringArray(R.array.search);
        if (mNewsFragmentModels.size()==0) {
            mAdapter = new NewsContainerFragmentAdapter(getChildFragmentManager(), mNewsFragmentModels);
            mNewsFragmentModels.add(new NewsFragmentModel(titles[0], new InfomationFragment()));
            mNewsFragmentModels.add(new NewsFragmentModel(titles[1], new BlogFragment()));
            mNewsFragmentModels.add(new NewsFragmentModel(titles[2], new AnswerFragment()));
            mNewsFragmentModels.add(new NewsFragmentModel(titles[3], new ActivityFragment()));
        }
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }



















   /*
    private void initData() {
        NewsApi newsApi = NetWork.getNewsApi();
        Observable<NewsBean> infomation = newsApi.getInfomation(Constant.PAGER_TOKEN);
        infomation.subscribeOn(Schedulers.io())// 指定 subscribe() 发生在 IO 线程
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())// 指定 Subscriber 的回调发生在主线程
                .subscribe(new Subscriber<NewsBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(NewsBean newsBean) {
                        mNewsAdapter = new NewsAdapter(mItemsBeen);
                        mRecyclerView.setAdapter(mNewsAdapter);
                    }
                });
    }*/


}
