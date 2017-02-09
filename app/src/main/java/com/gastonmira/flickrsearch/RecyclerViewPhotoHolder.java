package com.gastonmira.flickrsearch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * Created by gaston on 2/9/17.
 */

public class RecyclerViewPhotoHolder extends RecyclerView.ViewHolder {

    private Context mContext;
    public ImageView mImageView;

    public RecyclerViewPhotoHolder(View itemView, Context context) {
        super(itemView);

        mContext = context;
        mImageView = (ImageView) itemView.findViewById(R.id.image_view_item);

        setListeners();
    }

    private void setListeners() {
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO call the intent of photo item activity
            }
        });
    }
}
