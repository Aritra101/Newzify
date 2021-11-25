package com.aritra.newzify;

import retrofit2.Retrofit;

public class ApiClient {
    public static final String BASE_URL="https://newsapi.org/v2/";
    public static Retrofit retrofit;
    public static Retrofit getApiClient(){
        if (retrofit==null){
        retrofit= new Retrofit().Builder().baseurl(BASE_URL)
                .client();
        .build();
    }

}
