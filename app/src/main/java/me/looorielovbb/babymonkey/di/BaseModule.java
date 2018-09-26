package me.looorielovbb.babymonkey.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.looorielovbb.babymonkey.BaseFragment;


@Module
public abstract class BaseModule
{
    @FragmentScoped
    @ContributesAndroidInjector
    abstract BaseFragment tasksFragment();


}
