package com.gastonmira.flickrsearch;

import com.gastonmira.flickrsearch.Model.PhotoEntity;
import com.gastonmira.flickrsearch.Model.PhotoResponse;
import com.gastonmira.flickrsearch.Utils.AppConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gaston on 2/8/17.
 */

public class GetPhotosBySearchController {

    public Call<PhotoResponse> startConnection(int perPage, int page, String query) {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        FlickrApi flickrApi = mRetrofit.create(FlickrApi.class);

        return flickrApi.getPhotoBySearch(AppConstants.METHOD_SEARCH, AppConstants.API_KEY, "json", 1, query, perPage, page);
    }


}
