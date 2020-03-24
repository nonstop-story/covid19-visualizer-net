package com.nonstop.covid19.api;

public class VirusServices {
    public static VirusService create() {
        return VirusService.create();
    }

    public static VirusService create(String baseUrl) {
        return VirusService.create(baseUrl);
    }
}
