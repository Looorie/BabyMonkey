package me.looorielovbb.babymonkey.network;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ApiModule {
    @Singleton
    @Provides
    public Api provideApi(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }
}
