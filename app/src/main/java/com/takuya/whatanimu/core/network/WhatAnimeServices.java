package com.takuya.whatanimu.core.network;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface WhatAnimeServices {
    @FormUrlEncoded
    @POST("search")
    Call<JsonObject> search(@Query("token") String token, @Field("image") String encodedImage);
}
