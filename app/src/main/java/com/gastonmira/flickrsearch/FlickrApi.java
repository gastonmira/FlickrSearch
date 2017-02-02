package com.gastonmira.flickrsearch;

import com.gastonmira.flickrsearch.Model.Photo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

/**
 * Created by gastonmira on 1/2/17.
 */

public interface FlickrApi {
    @GET
    Call<Photo> getRecentPhotos(
            @Field("method") String method
    );

    @GET
    Call<Photo> getPhotoBySearch(
            @Field("method") String method,
            @Field("query") String query
            //add more fields
    );
}
