package com.gastonmira.flickrsearch.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by gaston on 2/7/17.
 */

public class PhotosEntity {
    private int page;
    private int pages;
    private int perpage;
    private int total;
    @SerializedName("photo")
    private ArrayList<PhotoEntity> photosList;
    private String stat;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPerPage() {
        return perpage;
    }

    public void setPerPage(int perPage) {
        this.perpage = perPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList<PhotoEntity> getPhotosList() {
        return photosList;
    }

    public void setPhotosList(ArrayList<PhotoEntity> photosList) {
        this.photosList = photosList;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
