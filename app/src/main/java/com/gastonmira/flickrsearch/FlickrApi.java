package com.gastonmira.flickrsearch;

import com.gastonmira.flickrsearch.Model.FlickrPhotos;
import com.gastonmira.flickrsearch.Model.PhotoResponse;
import com.gastonmira.flickrsearch.Utils.AppConstants;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by gastonmira on 1/2/17.
 */

public interface FlickrApi {
    @GET("rest/")
    Call<FlickrPhotos> getRecentPhotos(
            @Query(AppConstants.METHOD_FIELD) String method,
            @Query(AppConstants.APIKEY_FIELD) String apiKey,
            @Query(AppConstants.FORMAT_FIELD) String format,
            @Query(AppConstants.NSJSONCALLBACK_FIELD) String noJsonCallback,
            @Query(AppConstants.PER_PAGE_FIELD) String perPage,
            @Query(AppConstants.PAGE_FIELD) String page);

    @GET("rest/")
    Call<FlickrPhotos> getPhotoBySearch(
            @Query(AppConstants.METHOD_FIELD) String method,
            @Query(AppConstants.APIKEY_FIELD) String apiKey,
            @Query(AppConstants.FORMAT_FIELD) String format,
            @Query(AppConstants.NSJSONCALLBACK_FIELD) String noJsonCallback,
            @Query(AppConstants.QUERY_FIELD) String query,
            @Query(AppConstants.PER_PAGE_FIELD) String perPage,
            @Query(AppConstants.PAGE_FIELD) String page);
}
