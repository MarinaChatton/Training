package com.chatton.marina.holdall.list2;

import java.io.Serializable;

/**
 * Created by Marina on 22/11/2016.
 */

public class Photo implements Serializable{
    private String title;
    private String url;

    public Photo(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
