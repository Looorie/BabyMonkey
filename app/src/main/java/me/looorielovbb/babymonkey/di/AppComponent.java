package me.looorielovbb.babymonkey.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import me.looorielovbb.babymonkey.BabyApp;
import me.looorielovbb.babymonkey.network.ApiModule;
import me.looorielovbb.babymonkey.network.OkhttpClientModule;
import me.looorielovbb.babymonkey.network.RetrofitModule;

@Singleton
@Component(modules = {
        OkhttpClientModule.class,
        RetrofitModule.class,
        ApiModule.class,
        ApplicationModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<BabyApp> {


    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
