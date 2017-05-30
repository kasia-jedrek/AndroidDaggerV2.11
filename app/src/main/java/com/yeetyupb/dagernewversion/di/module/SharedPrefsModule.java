package com.yeetyupb.dagernewversion.di.module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.yeetyupb.dagernewversion.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Katarzyna  on 2017-05-30.
 */
@Module
public class SharedPrefsModule {

    public SharedPrefsModule() {
    }

    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(App application){
            return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
