package com.example.ucsatgass.network;

import com.example.ucsatgass.model.response.EventResponse;
import com.example.ucsatgass.model.response.TokenResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiEndpoints {

    @POST("api-login")
    @FormUrlEncoded
    Call<TokenResponse> login(@Field("email") String email, @Field("password") String password);

    @GET("events")
    Call<EventResponse> getEvents();

    @POST("api-logout")
    Call<JsonObject> logout();
}
