package ysg.gdcp.cn.newsclient.adapter;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;
/**
 * Created by Administrator on 2017/6/22 16:21.
 *
 * @author ysg
 */
public class TopAdapter extends FragmentPagerAdapter{
    private List<Fragment> fragmentList;
    public TopAdapter(FragmentManager fm,List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
