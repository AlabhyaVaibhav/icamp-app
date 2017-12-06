package com.madrun.icampapp;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MadhuRima on 24-05-2017.
 */

public class ServiceGenerator {
    //private static final String BASE_URL = "http://dealer.member.chevina.in/";
    private static final String BASE_URL = "https://api.mlab.com";
    Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();



    private static HttpLoggingInterceptor logging =
            new HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder();
//    public static <S> S createService(
//            Class<S> serviceClass  ) {
//
//        return createService(serviceClass);
//    }

    public static <S> S createService(
            Class<S> serviceClass) {



//            httpClient.addInterceptor(logging);
            builder.client(httpClient.build());
            retrofit = builder.build();

        return retrofit.create(serviceClass);
    }

}

