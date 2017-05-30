package com.yeetyupb.dagernewversion.di.component.sub;

import com.yeetyupb.dagernewversion.di.module.sub.MainModule;
import com.yeetyupb.dagernewversion.ui.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by Katarzyna  on 2017-05-30.
 */

@Subcomponent(modules = { MainModule.class})
public interface MainActivitySubComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
