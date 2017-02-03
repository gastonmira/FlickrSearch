package com.gastonmira.flickrsearch;

import com.gastonmira.flickrsearch.Model.PhotoResponse;

/**
 * Created by gaston on 2/3/17.
 */

public class ServerEvent {
    private PhotoResponse photoResponse;

    public ServerEvent(PhotoResponse photoResponse) {
        this.photoResponse = photoResponse;
    }

    public PhotoResponse getPhotoResponse() {
        return photoResponse;
    }

    public void setPhotoResponse(PhotoResponse photoResponse) {
        this.photoResponse = photoResponse;
    }
}
