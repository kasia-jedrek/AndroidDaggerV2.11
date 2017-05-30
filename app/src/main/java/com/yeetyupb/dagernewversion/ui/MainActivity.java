package com.yeetyupb.dagernewversion.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.yeetyupb.dagernewversion.R;
import com.yeetyupb.dagernewversion.mvp.presenter.MainPresenter;
import com.yeetyupb.dagernewversion.mvp.view.MainView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity  implements MainView {
    @Inject
    SharedPreferences sharedPreferences;

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.doNothing();

//        ((App) getApplication())
//                .getAppComponent()
//                .inject(this);


        sharedPreferences.edit().putString("key", "value").apply();
        String read = sharedPreferences.getString("key", "null");
        Toast.makeText(this, "" + read, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }
}
