package com.gastonmira.flickrsearch.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gastonmira.flickrsearch.GetRecentPhotosController;
import com.gastonmira.flickrsearch.R;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        /*GetRecentPhotosController getRecentPhotosController = new GetRecentPhotosController();
        getRecentPhotosController.startConnection();*/
    }
}
