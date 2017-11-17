package com.sarapul.wise71.cosmetics;

import com.sarapul.wise71.cosmetics.models.Group;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ProductAPI {

    @GET
    Call<Group> getProducts(@Url String url);

}
