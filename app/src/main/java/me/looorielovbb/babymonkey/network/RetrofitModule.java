package me.looorielovbb.babymonkey.network;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.looorielovbb.babymonkey.BuildConfig;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RetrofitModule
{

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient client)
    {
        return new Retrofit.Builder()
                .client(client)
                .baseUrl(BuildConfig.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
