package com.nonstop.covid19;

import com.nonstop.covid19.api.Day;
import com.nonstop.covid19.api.VirusService;
import com.nonstop.covid19.api.VirusServiceFactory;
import org.junit.Test;
import retrofit2.Response;

public class TestVirusService {
    @Test
    public void testToday() {
        VirusService service = VirusServiceFactory.create();
        try {
            Response<Day> res = service.today().execute();
            System.out.println(res.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAllDays() {
        VirusService service = VirusServiceFactory.create();
        try {
            service.allDays().execute().body()
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAllCountries() {
        VirusService service = VirusServiceFactory.create();
        try {
            service.allCountries().execute().body()
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCountry() {
        VirusService service = VirusServiceFactory.create();
        try {
            service.country("China").execute().body()
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
