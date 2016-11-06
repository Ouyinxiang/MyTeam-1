package tck.cn.myteam;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/6.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {

    public TextView mTitle;
    public TextView mBody;
    public TextView mCommentCount;
    public TextView mPubDate;


    public NewsViewHolder(View itemView) {
        super(itemView);

        mTitle = (TextView) itemView.findViewById(R.id.title);
        mBody = (TextView) itemView.findViewById(R.id.body);
        mCommentCount = (TextView) itemView.findViewById(R.id.commentCount);
        mPubDate = (TextView) itemView.findViewById(R.id.pubDate);

    }
}
