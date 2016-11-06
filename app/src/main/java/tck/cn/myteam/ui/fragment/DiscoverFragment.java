package tck.cn.myteam.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tck.cn.myteam.base.BaseFragment;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/5.
 */

public class DiscoverFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText("发现");
        return textView;
    }
}
