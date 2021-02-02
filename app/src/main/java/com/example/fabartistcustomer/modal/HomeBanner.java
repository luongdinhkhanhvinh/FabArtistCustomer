package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class HomeBanner implements Serializable {
    String bannerId = "";
    String language = "";
    String title = "";
    String description = "";
    String url = "";
    String image = "";
    String status = "";
    String createdAt = "";
    String updatedAt = "";

    public String getBannerId() {
        return bannerId;
    }

    public String getLanguage() {
        return language;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImage() {
        return image;
    }

    public String getStatus() {
        return status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
