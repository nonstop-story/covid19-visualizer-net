package com.nonstop.covid19.api;

import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface VirusService {
    @GET("all-today")
    Call<Day> today();

    @GET("all")
    Call<List<Day>> allDays();

    @GET("countries")
    Call<List<Day>> allCountries();

    @GET("countries")
    Call<List<Day>> country(@Query("filter[country]") String countryName);

    String BASE_URL = "http://covid-19api.com/api/";

    static VirusService create() {
        return create(BASE_URL);
    }

    static VirusService create(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build()
                .create(VirusService.class);
    }
}
