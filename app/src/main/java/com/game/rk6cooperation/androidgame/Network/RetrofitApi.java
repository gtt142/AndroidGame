package com.game.rk6cooperation.androidgame.Network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Retrofit-описание API сервиса для получения данных об очках игроков
 */
interface RetrofitApi {
    @GET("scoreboard/")
    Call<ResponseBody> getUsersList(@Query("page") Integer page, @Query("on_page") Integer on_page);

    @POST("scoreboard/")
    Call<ResponseBody> sendResult(@Body SendScore sendScore);

    @GET("/login/")
    Call<ResponseBody> checkAuth();

    @POST("/logout/")
    Call<ResponseBody> logout();

    @GET("scoreboard/{id}")
    Call<ResponseBody> getUser(@Path("id") Integer id);

    @POST("/login/")
    Call<ResponseBody> login(@Body AuthUserRequest authUserRequest);

    @POST("/register/")
    Call<ResponseBody> register(@Body RegUserRequest regUserRequest);


}
