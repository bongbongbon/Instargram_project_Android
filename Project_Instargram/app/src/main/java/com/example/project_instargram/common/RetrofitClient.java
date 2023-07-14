package com.example.project_instargram.common;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    public Retrofit getRetrofit() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.43:8080/instargram/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        return retrofit;
    }
}
