package com.nonstop.covid19.geometry;

import com.nonstop.covid19.api.Day;

import java.util.List;
import java.util.Locale;

public class Country {
    private String countryName;
    private List<Day> days;
    private Location location;

    public Country(String countryName, List<Day> days) {
        this.countryName = countryName.trim();
        this.days = days;
        this.location = CountryGeo.forCountry(this.countryName);
    }

    public String getCountryName() {
        return countryName;
    }

    public Location getLocation() {
        return location;
    }

    public List<Day> getDays() {
        return days;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "%s(%s) %s",
                getCountryName(),
                getLocation(),
                days.isEmpty() ? "" : days.get(days.size() - 1)
        );
    }
}
