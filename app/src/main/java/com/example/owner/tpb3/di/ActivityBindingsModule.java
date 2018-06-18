package com.example.owner.tpb3.di;

import com.example.owner.tpb3.di.main.MainActivityModule;
import com.example.owner.tpb3.di.scopes.PerActivity;
import com.example.owner.tpb3.view.MainActivity;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;


@Module(includes = AndroidInjectionModule.class)
abstract class ActivityBindingsModule {
    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();

}

