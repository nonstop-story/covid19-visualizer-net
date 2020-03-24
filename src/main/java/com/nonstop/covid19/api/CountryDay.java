package com.nonstop.covid19.api;

import java.util.Date;
import java.util.Locale;

public class CountryDay {
    private String country;
    private Date date;
    private int confirmed;
    private int deaths;
    private int recovered;

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),
                "%s: %s { confirmed: %d, deaths: %d, recovered: %d }",
                country, date.toString(), confirmed, deaths, recovered);
    }
}
