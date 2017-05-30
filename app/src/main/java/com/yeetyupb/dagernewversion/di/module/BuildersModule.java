package com.yeetyupb.dagernewversion.di.module;

import android.app.Activity;

import com.yeetyupb.dagernewversion.di.component.sub.MainActivitySubComponent;
import com.yeetyupb.dagernewversion.ui.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Katarzyna  on 2017-05-30.
 */
@Module
public abstract class BuildersModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainActivitySubComponent.Builder builder);
// Add more bindings here for other sub components
}
