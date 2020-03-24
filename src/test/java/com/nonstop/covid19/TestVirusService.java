package com.nonstop.covid19;

import com.nonstop.covid19.api.Day;
import com.nonstop.covid19.api.VirusService;
import com.nonstop.covid19.api.VirusServices;
import org.junit.Test;
import retrofit2.Response;

import java.util.stream.Collectors;

public class TestVirusService {
    @Test
    public void testToday() {
        VirusService service = VirusServices.create();
        try {
            Response<Day> res = service.today().execute();
            System.out.println(res.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAllDays() {
        VirusService service = VirusServices.create();
        try {
            service.allDays().execute().body()
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAllCountries() {
        VirusService service = VirusServices.create();
        try {
            service.allCountries().execute().body()
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCountry() {
        VirusService service = VirusServices.create();
        try {
            service.country("China").execute().body()
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAllCountryNames() {
        VirusService service = VirusServices.create();
        try {
            service.allCountries().execute().body()
                    .stream()
                    .map(Day::getCountry)
                    .collect(Collectors.toSet())
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
