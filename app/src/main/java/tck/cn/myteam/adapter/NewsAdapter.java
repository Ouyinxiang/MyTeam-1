package tck.cn.myteam.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import tck.cn.myteam.NewsViewHolder;
import tck.cn.myteam.R;
import tck.cn.myteam.model.bean.NewsBean;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/6.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private List<NewsBean.ResultBean.ItemsBean> mNewsBeen;

    public NewsAdapter(List<NewsBean.ResultBean.ItemsBean> newsBeen) {
        mNewsBeen = newsBeen;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        NewsBean.ResultBean.ItemsBean itemsBean = mNewsBeen.get(position);
        holder.mTitle.setText(itemsBean.getTitle());
        holder.mBody.setText(itemsBean.getBody());
        holder.mCommentCount.setText(itemsBean.getCommentCount());
    }

    @Override
    public int getItemCount() {
        return mNewsBeen.size();
    }
}
