package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class MakerData implements Serializable {
    String title = "";
    String id = "";
    String snippet = "";
    String img = "";

    public MakerData(String title, String id, String snippet, String img) {
        this.title = title;
        this.id = id;
        this.snippet = snippet;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getSnippet() {
        return snippet;
    }

    public String getImg() {
        return img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
