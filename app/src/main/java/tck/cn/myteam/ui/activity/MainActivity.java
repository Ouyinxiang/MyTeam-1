package tck.cn.myteam.ui.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import tck.cn.myteam.R;
import tck.cn.myteam.ui.fragment.AddFragment;
import tck.cn.myteam.ui.fragment.DiscoverFragment;
import tck.cn.myteam.ui.fragment.MineFragment;
import tck.cn.myteam.ui.fragment.NewsFragment;
import tck.cn.myteam.ui.fragment.TweetFragment;

public class MainActivity extends AppCompatActivity {

    private List<TabItem>  mTableItemList = new ArrayList<>();
    private ActionBar mSupportActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intActionBar();
        initTabHost();
    }

    private void intActionBar() {
        mSupportActionBar = getSupportActionBar();
        mSupportActionBar.setDisplayShowTitleEnabled(true);


    }

    private void initTabHost() {

        if (mTableItemList.size() == 0) {
            mTableItemList.add(new TabItem(R.mipmap.ic_nav_news_normal, R.mipmap.ic_nav_news_actived,
                    R.string.main_tab_name_news, NewsFragment.class));
            mTableItemList.add(new TabItem(R.mipmap.ic_nav_tweet_normal, R.mipmap.ic_nav_tweet_actived,
                    R.string.main_tab_name_tweet, TweetFragment.class));
            mTableItemList.add(new TabItem(R.mipmap.ic_nav_add_normal, R.mipmap.ic_nav_add_actived,
                    0, AddFragment.class));
            mTableItemList.add(new TabItem(R.mipmap.ic_nav_discover_normal, R.mipmap.ic_nav_discover_actived,
                    R.string.main_tab_name_explore, DiscoverFragment.class));
            mTableItemList.add(new TabItem(R.mipmap.ic_nav_my_normal, R.mipmap.ic_nav_my_pressed,
                    R.string.main_tab_name_my, MineFragment.class));
        }


        FragmentTabHost fragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        //去掉分割线
        fragmentTabHost.getTabWidget().setDividerDrawable(null);


        for (int i = 0; i < mTableItemList.size(); i++) {
            TabItem tabItem = mTableItemList.get(i);
            //实例化一个TabSpec,设置tab的名称和视图
            TabHost.TabSpec tabSpec = fragmentTabHost.newTabSpec(tabItem.getTitleString()).setIndicator(tabItem.getView());
            fragmentTabHost.addTab(tabSpec, tabItem.getFragmentClass(), null);

            //给Tab按钮设置背景
            fragmentTabHost.getTabWidget().getChildAt(i).setBackgroundColor(getResources().getColor(R.color.main_bottom_bg));


            //默认选中第一个tab
            if (i == 0) {
                mSupportActionBar.setTitle(R.string.main_tab_name_news);
                tabItem.setChecked(true);
            }
        }

        fragmentTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if (tabId == null) {
                    mSupportActionBar.setTitle("添加");
                }
                mSupportActionBar.setTitle(tabId);
                for (int i = 0; i < mTableItemList.size(); i++) {
                    TabItem tabitem = mTableItemList.get(i);
                    if (tabId.equals(tabitem.getTitleString())) {
                        tabitem.setChecked(true);
                    } else {
                        tabitem.setChecked(false);
                    }
                }

            }
        });
    }

    class TabItem {
        //正常情况下显示的图片
        private int imageNormal;
        //选中情况下显示的图片
        private int imagePress;
        //tab的名字
        private int title;
        private String titleString;

        //tab对应的fragment
        public Class<? extends Fragment> fragmentClass;

        public View view;
        public ImageView imageView;
        public TextView textView;

        public TabItem(int imageNormal, int imagePress, int title, Class<? extends Fragment> fragmentClass) {
            this.imageNormal = imageNormal;
            this.imagePress = imagePress;
            this.title = title;
            this.fragmentClass = fragmentClass;
        }

        public Class<? extends Fragment> getFragmentClass() {
            return fragmentClass;
        }

        public int getImageNormal() {
            return imageNormal;
        }

        public int getImagePress() {
            return imagePress;
        }

        public int getTitle() {
            return title;
        }

        public String getTitleString() {
            if (title == 0) {
                return "";
            }
            if (TextUtils.isEmpty(titleString)) {
                titleString = getString(title);
            }
            return titleString;
        }

        public View getView() {
            if (this.view == null) {
                this.view = getLayoutInflater().inflate(R.layout.view_tab_indicator, null);
                this.imageView = (ImageView) this.view.findViewById(R.id.tab_iv_image);
                this.textView = (TextView) this.view.findViewById(R.id.tab_tv_text);
                if (this.title == 0) {
                    this.textView.setVisibility(View.GONE);
                } else {
                    this.textView.setVisibility(View.VISIBLE);
                    this.textView.setText(getTitleString());
                }
                this.imageView.setImageResource(imageNormal);
            }
            return this.view;
        }

        //切换tab的方法
        public void setChecked(boolean isChecked) {
            if (imageView != null) {
                if (isChecked) {
                    imageView.setImageResource(imagePress);
                } else {
                    imageView.setImageResource(imageNormal);
                }
            }
            if (textView != null && title != 0) {
                if (isChecked) {
                    textView.setTextColor(getResources().getColor(R.color.main_green));
                } else {
                    textView.setTextColor(getResources().getColor(R.color.main_gray));
                }
            }
        }
    }
}
