package me.looorielovbb.babymonkey.network;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

import javax.inject.Singleton;
import java.util.concurrent.TimeUnit;

@Module
public class OkhttpClientModule {
    @Provides
    @Singleton
    public static OkHttpClient provide() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(9, TimeUnit.SECONDS)
                .build();
    }
}
