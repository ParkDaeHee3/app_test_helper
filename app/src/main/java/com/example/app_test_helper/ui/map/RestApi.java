package com.example.app_test_helper.ui.map;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("getmap")
    Call<List<map>> getMap();
}