package me.looorielovbb.babymonkey.home;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.looorielovbb.babymonkey.di.ActivityScoped;
import me.looorielovbb.babymonkey.di.FragmentScoped;

@Module
public abstract class HomeModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract SampleFragment sampleFragment();

    @ActivityScoped
    @Binds
    abstract HomeContract.Presenter taskPresenter(HomePresenter presenter);
}
