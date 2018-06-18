package com.example.owner.tpb3.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class AppModule {

    // same as provides but this returns injected parameter
    @Binds
    abstract Context bindContext(Application application);

}
