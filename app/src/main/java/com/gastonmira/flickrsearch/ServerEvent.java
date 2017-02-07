package com.gastonmira.flickrsearch;

import com.gastonmira.flickrsearch.Model.PhotoEntity;

/**
 * Created by gaston on 2/3/17.
 */

public class ServerEvent {
    private PhotoEntity photoEntity;

    public ServerEvent(PhotoEntity photoEntity) {
        this.photoEntity = photoEntity;
    }

    public PhotoEntity getPhotoEntity() {
        return photoEntity;
    }

    public void setPhotoEntity(PhotoEntity photoEntity) {
        this.photoEntity = photoEntity;
    }
}
