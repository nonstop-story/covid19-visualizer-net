package com.nonstop.covid19.geometry;

import com.nonstop.covid19.api.Day;

import java.util.List;
import java.util.stream.Collectors;

public class Countries {
    public static List<Country> from(List<Day> countries) {
        return countries.stream()
                .collect(Collectors.groupingBy(Day::getCountry))
                .entrySet()
                .stream()
                .filter(e -> CountryGeo.contains(e.getKey()))
                .map(e -> new Country(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }
}
