package com.example.project_instargram.common;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface RetrofitInterface {

    @GET("{mapping}")
    Call<String> clientGetMethod(@Path("mapping") String mapping, @QueryMap HashMap<String, Object> paramMap);


    @FormUrlEncoded
    @POST
    Call<String> clientPostMethod(@Url String url, @FieldMap HashMap<String, Object> paramMap);
}
