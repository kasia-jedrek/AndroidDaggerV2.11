package com.yeetyupb.dagernewversion.di.component;

import com.yeetyupb.dagernewversion.App;
import com.yeetyupb.dagernewversion.di.module.AppModule;
import com.yeetyupb.dagernewversion.di.module.BuildersModule;
import com.yeetyupb.dagernewversion.di.module.SharedPrefsModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Katarzyna  on 2017-05-30.
 */
@Singleton
@Component(modules = { AppModule.class, SharedPrefsModule.class,  AndroidSupportInjectionModule.class, BuildersModule.class})
public interface  AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App application);
        AppComponent build();
    }
//    void inject(MainActivity mainActivity);
    void inject(App  app);
}
