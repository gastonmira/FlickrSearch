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

public class GetRecentPhotosController {

    private ArrayList<PhotoEntity> mPhotosList;
    private String mErrorMessage;

    public Call<PhotoResponse> startConnection(int perPage, int page) {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        FlickrApi flickrApi = mRetrofit.create(FlickrApi.class);
        //Call<PhotoResponse> call = flickrApi.getRecentPhotos(AppConstants.METHOD_GETRECENT, AppConstants.API_KEY, "json", 1,50,2);
        //call.enqueue(this);

        return flickrApi.getRecentPhotos(AppConstants.METHOD_GETRECENT, AppConstants.API_KEY, "json", 1, perPage, page);
    }
}
