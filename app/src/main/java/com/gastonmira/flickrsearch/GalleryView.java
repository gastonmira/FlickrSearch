package com.gastonmira.flickrsearch;

import com.gastonmira.flickrsearch.Model.PhotoEntity;
import com.gastonmira.flickrsearch.Model.PhotoResponse;

import java.util.ArrayList;

/**
 * Created by gaston on 2/8/17.
 */

public interface GalleryView {

    void showWait();
    void removeWait();
    void onFailure(String errorMessage);
    void getRecentPhotosSuccess(ArrayList<PhotoEntity> photoResponse);

}
