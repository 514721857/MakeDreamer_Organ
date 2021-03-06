package cn.sgr.zmr.com.sgr.Modules.My.More.RetsetPwd;

import android.os.Bundle;

import cn.sgr.zmr.com.sgr.Base.BaseActivity;
import cn.sgr.zmr.com.sgr.R;
import cn.sgr.zmr.com.sgr.Utils.util.Utils;

public class RetsetPwdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_activity);
        initPV();

    }

    //初始化presenter和view
    private void initPV() {
        RetsetPwdFragment moreFragment =
                (RetsetPwdFragment) getFragmentManager().findFragmentById(R.id.contentFrame);
        if (moreFragment == null) {
            moreFragment = moreFragment.newInstance();
            Utils.addFragmentToActivity(getFragmentManager(),moreFragment, R.id.contentFrame);
        }
        // Create the presenter
        new RetsetPwdPresenter(this,moreFragment);

    }
}
