package com.marlon.retrofitclentdemo;


import android.widget.TextView;

import com.marlon.retrofitclentdemo.base.BaseActivity;
import com.marlon.retrofitclentdemo.contract.MainContract;
import com.marlon.retrofitclentdemo.presenter.MainPresenter;



public class MvpMainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    private TextView textView;

    @Override
    protected int getLayout() {
        return R.layout.activity_mvp;
    }

    @Override
    protected void initEventAndData() {
        textView = findViewById(R.id.text);
        mPresenter.getVersion();
    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    public void gotoLogin() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void showData(String value) {
        textView.setText(value);
    }

}
