package com.yeetyupb.dagernewversion.di.module.sub;

import com.yeetyupb.dagernewversion.mvp.view.MainView;
import com.yeetyupb.dagernewversion.ui.MainActivity;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Katarzyna  on 2017-05-30.
 */
@Module
public abstract class MainModule {
    private MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }
    @Binds
    abstract MainView provideMainView(MainActivity activity);
}
