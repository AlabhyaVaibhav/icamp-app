package com.madrun.icampapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestApi client = ServiceGenerator.createService(RestApi.class);
        Call<UserProfileResponse> call = client.getUserProfile(key);
        call.enqueue(new Callback<UserProfileResponse>() {

            @Override
            public void onResponse(Call<UserProfileResponse> call, Response<UserProfileResponse> response) {
                if (response.code() == 200) {

                    Log.i("checkingconnection", "connected");
                }

            }

            @Override
            public void onFailure(Call<UserProfileResponse> call, Throwable t) {

            }
        });
}
}
