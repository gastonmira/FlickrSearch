package com.gastonmira.flickrsearch.Model;

import java.io.Serializable;

/**
 * Created by gastonmira on 31/1/17.
 */

public class Photo implements Serializable {
    private String id;
    private String secret;
    private String server;
    private String farm;

    public Photo(String id, String secret, String server, String farm) {
        this.id = id;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return "http://farm" + farm + ".static.flickr.com/" + server + "/" + id + "_" + secret + ".jpg";
    }
}
