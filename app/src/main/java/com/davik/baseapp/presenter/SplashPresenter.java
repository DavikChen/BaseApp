package com.davik.baseapp.presenter;

import com.davik.baseapp.contract.SplashContract;
import com.davik.baseapp.ui.SplashActivity;
import com.davik.baseapp.utils.SharedPrefsUtil;

/**
 * Description：
 * Author: Hansion
 * Time: 2017/2/3 11:22
 */
public class SplashPresenter extends BasePresenter<SplashActivity> implements SplashContract.ISplashPresenter {

    @Override
    public void isAppFirstRun() {
        boolean isFirstRun = SharedPrefsUtil.getValue(getView(), "isFirstRun","isFirstRun", true);
        if (isFirstRun) {
            SharedPrefsUtil.putValue(getView(),"isFirstRun", "isFirstRun", false);
            getView().goHome();
        } else {
            getView().goGuide();
        }
    }
}
