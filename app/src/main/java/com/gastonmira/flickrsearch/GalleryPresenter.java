package com.gastonmira.flickrsearch;

import com.gastonmira.flickrsearch.Model.PhotoResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by gaston on 2/8/17.
 */

public class GalleryPresenter implements Callback<PhotoResponse> {

    private GalleryView mGalleryView;

    public GalleryPresenter(GalleryView view) {
        mGalleryView = view;
    }

    public void getRecentPhotosList() {
        GetRecentPhotosController getRecentPhotosController= new GetRecentPhotosController();
        Call<PhotoResponse> call = getRecentPhotosController.startConnection(50,1);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<PhotoResponse> call, Response<PhotoResponse> response) {
        if (response.isSuccessful()) {
            mGalleryView.getRecentPhotosSuccess(response.body().getPhotos().getPhotosList());
        }
    }

    @Override
    public void onFailure(Call<PhotoResponse> call, Throwable t) {
        mGalleryView.onFailure(t.getMessage());
    }
}
