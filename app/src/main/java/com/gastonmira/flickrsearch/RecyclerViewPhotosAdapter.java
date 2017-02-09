package com.gastonmira.flickrsearch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gastonmira.flickrsearch.Model.PhotoEntity;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by gaston on 2/9/17.
 */

public class RecyclerViewPhotosAdapter extends RecyclerView.Adapter<RecyclerViewPhotoHolder> {

    private ArrayList<PhotoEntity> mPhotosList;
    private Context mContext;

    public RecyclerViewPhotosAdapter(ArrayList<PhotoEntity> photoEntities, Context context) {
        mPhotosList = photoEntities;
        mContext = context;
    }

    @Override
    public RecyclerViewPhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_photo_item, null);
        RecyclerViewPhotoHolder recyclerViewPhotoHolder = new RecyclerViewPhotoHolder(layoutView, parent.getContext());

        return recyclerViewPhotoHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewPhotoHolder holder, int position) {
        Picasso.with(mContext).load(mPhotosList.get(position).getUrl()).placeholder(R.mipmap.ic_cached_black).fit().into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mPhotosList.size();
    }
}
