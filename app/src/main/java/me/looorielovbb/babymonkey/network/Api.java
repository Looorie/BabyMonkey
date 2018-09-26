package me.looorielovbb.babymonkey.network;

import io.reactivex.Observable;
import me.looorielovbb.babymonkey.data.bean.BaseResponse;
import me.looorielovbb.babymonkey.data.bean.Resource;

public interface Api {
    String BASE_URL = "https://gank.io/";

    //获取随机数据
    @GET("api/random/data/{type}/{count}")
    Observable<BaseResponse<Resource>> getRandom(@Path("type") String type,
                                                 @Path("count") int count);

    //获取今天数据
    @GET("api/today")
    Observable<BaseResponse<Resource>> getToday();

    //获取每日数据
    @GET("api/day/{y}/{M}/{d}")
    Observable<BaseResponse<Resource>> getDay(@Path("y") String year,
                                              @Path("M") String mouth,
                                              @Path("d") String day);

    //获取分类数据（数据类型： 福利 | Android | iOS | 休息视频 | 拓展资源 | 前端 | all）
    @GET("api/data/{type}/{count}/{page}")
    Observable<BaseResponse<Resource>> getDataByType(@Path("type") String type,
                                                     @Path("count") int count,
                                                     @Path("page") int page);

    //提交干货到审核区:
    @POST("api/add2gank")
    @FormUrlEncoded
    Observable<BaseResponse<Resource>> addToGank(@Field("url") String url,       //url	    想要提交的网页地址
                                                 @Field("desc") String desc,     //desc	    对干货内容的描述
                                                 @Field("who") String who,       //who	    提交者 ID
                                                 @Field("type") String type,     //type	    干货类型
                                                 @Field("debug") boolean debug); //debug	当前提交为测试数据

    //获取发过干货日期
    @GET("api/day/history")
    Observable<BaseResponse<Resource>> getHistory();

    //获取特定日期网站数据
    @GET("api/history/content/day/{y}/{M}/{d}")
    Observable<BaseResponse<Resource>> getDayContent(@Path("y") String year,
                                                     @Path("M") String mouth,
                                                     @Path("d") String day);

    //获取最近几日干货网站数据
    @GET("api/history/content/{count}/{pagefrom}")
    Observable<BaseResponse<Resource>> getRecentDays(@Path("count") String count,
                                                     @Path("pagefrom") String pagefrom);

    //搜索
    @GET("api/search/query/{keyword}/category/{type}/count/{count}/page/{page}")
    Observable<BaseResponse<Resource>> search(@Path("keyword") String keyword,
                                              @Path("type") String type,
                                              @Path("count") int count,
                                              @Path("page") int page);

//    ==================================   闲读  ============================================

    //获取闲读的主分类
    @GET("api/xiandu/categories")
    Observable<BaseResponse<Resource>> getMCategory();

    //获取闲读的子分类 (category 后面可接受参数为主分类返回的en_name 如apps， wow， android，iOS)
    @GET("api/xiandu/category/{type}")
    Observable<BaseResponse<Resource>> getSCategory(@Path("type") String type);

    //获取闲读数据
    @GET("api/xiandu/data/id/{id}/count/{count}/page/{page}")
    Observable<BaseResponse<Resource>> getXianduData(@Path("id") String id,
                                                     @Path("count") int count,
                                                     @Path("page") int page);
}
