package com.gastonmira.flickrsearch;

/**
 * Created by gaston on 2/3/17.
 */

public class ErrorEvent {
    private String stat;
    private String message;

    public ErrorEvent(String stat, String message){
        this.stat = stat;
        this.message = message;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
