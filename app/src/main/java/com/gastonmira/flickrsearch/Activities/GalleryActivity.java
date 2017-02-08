package com.gastonmira.flickrsearch.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.gastonmira.flickrsearch.GalleryPresenter;
import com.gastonmira.flickrsearch.GalleryView;
import com.gastonmira.flickrsearch.GetRecentPhotosController;
import com.gastonmira.flickrsearch.Model.PhotoEntity;
import com.gastonmira.flickrsearch.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity implements GalleryView {

    private ProgressBar mProgressBar;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        initView();

        GalleryPresenter galleryPresenter = new GalleryPresenter(this);
        galleryPresenter.getRecentPhotosList();
    }


    private void initView() {
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
    }

    @Override
    public void removeWait() {
        //mProgressBar.setVisibility(View.GONE);
        //mImageView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onFailure(String errorMessage) {

    }

    @Override
    public void getRecentPhotosSuccess(ArrayList<PhotoEntity> photoResponse) {
        PhotoEntity photoEntity = new PhotoEntity();
        photoEntity.setFarm(photoResponse.get(0).getFarm());
        photoEntity.setId(photoResponse.get(0).getId());
        photoEntity.setSecret(photoResponse.get(0).getSecret());
        photoEntity.setServer(photoResponse.get(0).getServer());
        photoEntity.setTitle(photoResponse.get(0).getTitle());
        showImageInView(photoEntity.getUrl());
    }

    private void showImageInView(String url) {
        Picasso.with(this).load(url).into(mImageView);
    }
}
