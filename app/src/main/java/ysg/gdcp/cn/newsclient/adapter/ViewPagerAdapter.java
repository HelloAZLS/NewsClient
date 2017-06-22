package ysg.gdcp.cn.newsclient.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2017/6/22 15:46.
 *
 * @author ysg
 */
public class ViewPagerAdapter extends PagerAdapter {
    private List<View> mViews;
    private Context mContext;

    public ViewPagerAdapter(List<View> mViews,Context mContext){
        this.mViews = mViews;
        this.mContext = mContext;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViews.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mViews.get(position));
        return mViews.get(position);
    }

    @Override
    public int getCount() {
        return mViews.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object) ;
    }
}
