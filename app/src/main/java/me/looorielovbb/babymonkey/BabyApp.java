package me.looorielovbb.babymonkey;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import me.looorielovbb.babymonkey.di.DaggerAppComponent;

public class BabyApp extends DaggerApplication
{
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector()
    {
        return DaggerAppComponent.builder().application(this).build();
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
    }
}
