package com.davik.baseapp.contract;


/**
 * Description：Base --- Contract
 * Author: Hansion
 */
public interface BaseContract {
    interface  IBasePresenter {

    }

    interface  IBase {

        //显示带ProgressBar的Dialog
        void showProgressDialog(String title, String message);

        //隐藏弹出的Dialog
        void hideProgressDialog();
    }
}
