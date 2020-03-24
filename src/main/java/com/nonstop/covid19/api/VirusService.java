package com.nonstop.covid19.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface VirusService {
    @GET("all-today")
    Call<Day> today();

    @GET("all")
    Call<List<Day>> allDays();

    @GET("countries")
    Call<List<CountryDay>> allCountries();

    @GET("countries")
    Call<List<CountryDay>> country(@Query("filter[country]") String countryName);
}
