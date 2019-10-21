package com.example.android.automation.data.model.remote;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://things.ubidots.com";
    public static final int ON = 1;
    public static final int OFF = 0;

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}