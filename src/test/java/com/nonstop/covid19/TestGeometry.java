package com.nonstop.covid19;

import com.nonstop.covid19.api.VirusService;
import com.nonstop.covid19.api.VirusServices;
import com.nonstop.covid19.geometry.Countries;
import org.junit.Test;

public class TestGeometry {
    @Test
    public void testGeoData() {
        VirusService service = VirusServices.create();
        try {
            Countries.from(service.allCountries().execute().body())
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
