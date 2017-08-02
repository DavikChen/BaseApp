package com.davik.baseapp.ui;

import com.davik.baseapp.R;
import com.davik.baseapp.contract.MainContract;
import com.davik.baseapp.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainActivity, MainPresenter> implements MainContract.IMain {

    @Override
    protected int initContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        //初始化TCP客户端
        mPresenter.initTcpClient();

        //连接服务器
        mPresenter.connTcpServer();
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }
}
