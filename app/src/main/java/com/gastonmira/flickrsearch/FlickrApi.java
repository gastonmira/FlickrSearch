package com.gastonmira.flickrsearch;

import com.gastonmira.flickrsearch.Model.Photo;
import com.gastonmira.flickrsearch.Utils.AppConstants;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

/**
 * Created by gastonmira on 1/2/17.
 */

public interface FlickrApi {
    @GET
    Call<Photo> getRecentPhotos(
            @Field(AppConstants.METHOD_FIELD) String method,
            @Field(AppConstants.APIKEY_FIELD) String apiKey,
            @Field(AppConstants.FORMAT_FIELD) String format,
            @Field(AppConstants.NSJSONCALLBACK_FIELD) String noJsonCallback,
            @Field(AppConstants.PAGE_FIELD) String page);

    @GET
    Call<Photo> getPhotoBySearch(
            @Field(AppConstants.METHOD_FIELD) String method,
            @Field(AppConstants.APIKEY_FIELD) String apiKey,
            @Field(AppConstants.FORMAT_FIELD) String format,
            @Field(AppConstants.NSJSONCALLBACK_FIELD) String noJsonCallback,
            @Field(AppConstants.QUERY_FIELD) String query,
            @Field(AppConstants.PAGE_FIELD) String page);
}
