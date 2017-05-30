package com.yeetyupb.dagernewversion.mvp.presenter;

import android.util.Log;

import com.yeetyupb.dagernewversion.mvp.view.MainView;

import javax.inject.Inject;

/**
 * Created by Katarzyna  on 2017-05-30.
 */
public class MainPresenter {

    private static final String TAG = "MainPresenter";
    private MainView mainView;

    @Inject
    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void doNothing(){
        Log.d(TAG, "do nothing");
        mainView.showProgress();
    }
}
