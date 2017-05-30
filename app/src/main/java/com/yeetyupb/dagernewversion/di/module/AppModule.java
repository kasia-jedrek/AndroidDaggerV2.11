package com.yeetyupb.dagernewversion.di.module;

import android.app.Application;
import android.content.Context;

import com.yeetyupb.dagernewversion.App;
import com.yeetyupb.dagernewversion.di.component.sub.MainActivitySubComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Katarzyna  on 2017-05-30.
 */
@Module(subcomponents = { MainActivitySubComponent.class })
public class AppModule {

    @Provides
    Context provideContext(App application){
        return application.getApplicationContext();
    }


    @Provides
    @Singleton
    Application providesApplication(App application) {
        return application;
    }
}
