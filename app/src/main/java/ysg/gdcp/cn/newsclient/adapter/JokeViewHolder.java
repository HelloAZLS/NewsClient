package ysg.gdcp.cn.newsclient.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ysg.gdcp.cn.newsclient.R;

/**
 * Created by Administrator on 2017/6/22 16:20.
 *
 * @author ysg
 */
public class JokeViewHolder extends RecyclerView.ViewHolder{
    TextView jokeview;
    public JokeViewHolder(View itemView) {
        super(itemView);
        jokeview = (TextView) itemView.findViewById(R.id.joke_tv);
    }
}
