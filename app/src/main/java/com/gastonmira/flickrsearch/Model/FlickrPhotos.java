package com.gastonmira.flickrsearch.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gaston on 2/7/17.
 */

public class FlickrPhotos implements Serializable {
    @SerializedName("photos")
    private List<PhotoResponse> photosList;

    public List<PhotoResponse> getPhotosList() {
        return photosList;
    }

    public void setPhotosList(List<PhotoResponse> photosList) {
        this.photosList = photosList;
    }
}
