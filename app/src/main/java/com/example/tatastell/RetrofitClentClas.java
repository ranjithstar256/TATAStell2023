package com.example.tatastell;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClentClas {

    private static RetrofitClentClas instance = null;
    private final APIClass myApi;

    private RetrofitClentClas() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(APIClass.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(APIClass.class);
    }

    public static synchronized RetrofitClentClas getInstance() {
        if (instance == null) {
            instance = new RetrofitClentClas();
        }
        return instance;
    }

    public APIClass getMyApi() {
        return myApi;
    }
}
