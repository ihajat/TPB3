package com.example.owner.tpb3.di;

import android.app.Application;

//import com.example.owner.tpb3.di.AppModule;

import com.example.owner.tpb3.presenter.PresenterImpl;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;



@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityBindingsModule.class })
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    @Override
    void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }

}
