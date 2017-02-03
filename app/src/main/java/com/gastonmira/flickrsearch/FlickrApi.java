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
            @Field("method") String method,
            @Field("api_key") String apiKey,
            @Field("format") String format,
            @Field("nojsoncallback") String noJsonCallback,
            @Field("page") String page);

    @GET
    Call<Photo> getPhotoBySearch(
            @Field("method") String method,
            @Field("api_key") String apiKey,
            @Field("format") String format,
            @Field("nojsoncallback") String noJsonCallback,
            @Field("text") String query,
            @Field("page") String page);
}
