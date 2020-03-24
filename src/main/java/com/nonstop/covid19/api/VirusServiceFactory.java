package com.nonstop.covid19.api;

import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VirusServiceFactory {
    private static final String BASE_URL = "http://covid-19api.com/api/";

    public static VirusService create() {
        return create(BASE_URL);
    }

    public static VirusService create(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build()
                .create(VirusService.class);
    }
}
