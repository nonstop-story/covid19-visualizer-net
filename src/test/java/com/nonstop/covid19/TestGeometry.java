package com.nonstop.covid19;

import com.nonstop.covid19.api.VirusService;
import com.nonstop.covid19.api.VirusServices;
import com.nonstop.covid19.geometry.Countries;
import org.junit.Test;

import java.util.Map;

public class TestGeometry {
    @Test
    public void testGeoData() {
        VirusService service = VirusServices.create();
        try {
            Countries.from(service.allCountries().execute().body())
                    .values()
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
