package com.gastonmira.flickrsearch;

import android.util.Log;

import com.gastonmira.flickrsearch.Model.FlickrPhotos;
import com.gastonmira.flickrsearch.Model.PhotoResponse;
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

public class GetRecentPhotosController implements Callback<FlickrPhotos> {

    private Retrofit mRetrofit;


    public void startConnection() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        FlickrApi flickrApi = mRetrofit.create(FlickrApi.class);
        Call<FlickrPhotos> call = flickrApi.getRecentPhotos(AppConstants.METHOD_GETRECENT,AppConstants.API_KEY,AppConstants.FORMAT_FIELD, AppConstants.NSJSONCALLBACK_FIELD,
                AppConstants.PER_PAGE_FIELD,AppConstants.PAGE_FIELD);
        call.enqueue(this);

    }


    @Override
    public void onResponse(Call<FlickrPhotos> call, Response<FlickrPhotos> response) {
        List<PhotoResponse> list = new ArrayList<>();
        if(response.isSuccessful()) {
            list = response.body().getPhotosList();
        }
        list.get(0).getFarm();
    }

    @Override
    public void onFailure(Call<FlickrPhotos> call, Throwable t) {
        Log.e("ERROR API", t.getMessage());
    }
}
