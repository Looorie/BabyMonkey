package me.looorielovbb.babymonkey.di;



import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.looorielovbb.babymonkey.home.HomeModule;
import me.looorielovbb.babymonkey.home.MainActivity;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = HomeModule.class)
    abstract MainActivity mainActivity();

}
