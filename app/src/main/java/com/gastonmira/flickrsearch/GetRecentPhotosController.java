package com.gastonmira.flickrsearch;

import com.gastonmira.flickrsearch.Model.PhotoResponse;
import com.gastonmira.flickrsearch.Utils.AppConstants;

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

    private Retrofit mRetrofit;

    public void startConnection() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FlickrApi flickrApi = mRetrofit.create(FlickrApi.class);
        

    }


    @Override
    public void onResponse(Call<PhotoResponse> call, Response<PhotoResponse> response) {

    }

    @Override
    public void onFailure(Call<PhotoResponse> call, Throwable t) {

    }
}
