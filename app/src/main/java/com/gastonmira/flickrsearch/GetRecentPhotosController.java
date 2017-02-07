package com.gastonmira.flickrsearch;

import android.util.Log;

import com.gastonmira.flickrsearch.Model.PhotoResponse;
import com.gastonmira.flickrsearch.Model.PhotoEntity;
import com.gastonmira.flickrsearch.Utils.AppConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gaston on 2/6/17.
 */

public class GetRecentPhotosController implements Callback<PhotoResponse> {

    public void startConnection() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        FlickrApi flickrApi = mRetrofit.create(FlickrApi.class);
        Call<PhotoResponse> call = flickrApi.getRecentPhotos(AppConstants.METHOD_GETRECENT, AppConstants.API_KEY, "json", 1,50,2);
        call.enqueue(this);

    }


    @Override
    public void onResponse(Call<PhotoResponse> call, Response<PhotoResponse> response) {
        List<PhotoEntity> list = new ArrayList<>();
        if(response.isSuccessful()) {
            list = response.body().getPhotos().getPhotosList();
        }
        list.get(0).getFarm();
    }

    @Override
    public void onFailure(Call<PhotoResponse> call, Throwable t) {
        Log.e("ERROR API FLICKR", t.getMessage());
    }
}
