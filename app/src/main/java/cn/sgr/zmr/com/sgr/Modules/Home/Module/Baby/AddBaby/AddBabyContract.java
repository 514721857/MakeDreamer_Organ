package cn.sgr.zmr.com.sgr.Modules.Home.Module.Baby.AddBaby;

import android.app.FragmentManager;

import com.bean.entity.Baby;

import java.util.List;

import cn.sgr.zmr.com.sgr.Base.BasePresenter;
import cn.sgr.zmr.com.sgr.Base.BaseView;

/**
 * Created by 沈国荣 on 2016/8/23 0023.
 */
public interface AddBabyContract {


    interface View extends BaseView<Presenter> {
    boolean isActive();//目的是为了解决内存泄漏

    void showProgressDialog(FragmentManager manager);//显示进度条

    void cancelProgressDialog();//隐藏进度条


    void nextActivity(String address);//跳转宝宝详细信息
}

interface Presenter extends BasePresenter {
    void SaveBaby( Baby babys,boolean isOnline);//保存宝宝
    void nextActivity(int postiong);
}
}
