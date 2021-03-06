package cn.sgr.zmr.com.sgr.Common.Login;

import android.app.FragmentManager;

import com.bean.entity.User;

import cn.sgr.zmr.com.sgr.Base.BasePresenter;
import cn.sgr.zmr.com.sgr.Base.BaseView;

/**
 * Created by 沈国荣 on 2016/8/19 0019.
 */


public interface LoginContract {

    interface View extends BaseView<Presenter> {

        void showFailureLogin();//登录失败

        void showProgressDialog(FragmentManager manager);//显示进度条

        void cancelProgressDialog();//隐藏进度条

        void showSuccessLogin();//登录成功

        boolean isActive();//目的是为了解决内存泄漏
    }

    interface Presenter extends BasePresenter {

        void saveUser(User user);//保存或者更新用户


        void doLogin();//登录操作

    }
}
