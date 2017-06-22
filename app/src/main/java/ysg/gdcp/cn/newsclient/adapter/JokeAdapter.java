package ysg.gdcp.cn.newsclient.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ysg.gdcp.cn.newsclient.R;
import ysg.gdcp.cn.newsclient.domain.JokeData;

/**
 * Created by Administrator on 2017/6/22 16:19.
 *
 * @author ysg
 */
public class JokeAdapter extends RecyclerView.Adapter<JokeViewHolder> {
    private List<JokeData.ResultBean.DataBean> jokelist;
    public JokeAdapter(List<JokeData.ResultBean.DataBean> jokelist){
        this.jokelist = jokelist;
    }

    @Override
    public JokeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_joke,parent,false);
        JokeViewHolder vh = new JokeViewHolder(itemview);
        return vh;
    }

    @Override
    public void onBindViewHolder(JokeViewHolder holder, int position) {
        JokeData.ResultBean.DataBean joke = jokelist.get(position);
        holder.jokeview.setText(joke.getContent());
    }

    @Override
    public int getItemCount() {
        return jokelist.size();
    }
    public void changeData(List<JokeData.ResultBean.DataBean> jokelist){
        this.jokelist = jokelist;
        notifyDataSetChanged();
    }
}