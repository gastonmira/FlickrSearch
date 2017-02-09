package com.gastonmira.flickrsearch.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.gastonmira.flickrsearch.GalleryPresenter;
import com.gastonmira.flickrsearch.GalleryView;
import com.gastonmira.flickrsearch.GetRecentPhotosController;
import com.gastonmira.flickrsearch.Model.PhotoEntity;
import com.gastonmira.flickrsearch.R;
import com.gastonmira.flickrsearch.RecyclerViewPhotosAdapter;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity implements GalleryView {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        initView();

        GalleryPresenter galleryPresenter = new GalleryPresenter(this);
        galleryPresenter.getRecentPhotosList();
    }


    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_photos);
    }

    @Override
    public void onFailure(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void getRecentPhotosSuccess(ArrayList<PhotoEntity> photoResponse) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        RecyclerViewPhotosAdapter recyclerViewPhotosAdapter = new RecyclerViewPhotosAdapter(photoResponse,this);
        mRecyclerView.setAdapter(recyclerViewPhotosAdapter);
    }
}
