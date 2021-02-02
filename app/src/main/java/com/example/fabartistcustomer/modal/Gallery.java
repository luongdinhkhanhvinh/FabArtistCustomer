package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class Gallery implements Serializable {
    String id = "";
    String userId = "";
    String image = "";
    String createdAt = "";
    String updatedAt = "";

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getImage() {
        return image;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
