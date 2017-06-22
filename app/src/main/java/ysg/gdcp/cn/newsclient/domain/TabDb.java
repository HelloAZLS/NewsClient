package ysg.gdcp.cn.newsclient.domain;


import ysg.gdcp.cn.newsclient.fragment.JokeFragment;
import ysg.gdcp.cn.newsclient.fragment.NewFragment;

/**
 * Created by Administrator on 2017/6/22 16:22.
 *
 * @author ysg
 */
public class TabDb {
    /***
     * 获得底部所有项
     */
    public static String[] getTabsTxt() {
        String[] tabs = {"首页","笑话大全"};
        return tabs;
    }
    /***
     * 获得所有碎片
     */
    public static Class[] getFramgent(){
        Class[] cls = {NewFragment.class,JokeFragment.class};
        return cls ;
    }
}