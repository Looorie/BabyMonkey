package me.looorielovbb.babymonkey.network;

import io.reactivex.Observable;
import me.looorielovbb.babymonkey.data.bean.BaseResponse;
import me.looorielovbb.babymonkey.data.bean.Resource;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api
{
    String BASE_URL= "https://www.gank.io/";

    @GET("api/data/{type}/{count}/{page}")
    Observable<BaseResponse<Resource>> getGirlsPic(@Path("type") String type,
                                                   @Path("count") int count,
                                                   @Path("page") int page);

}
