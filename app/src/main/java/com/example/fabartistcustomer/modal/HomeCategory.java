package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class HomeCategory implements Serializable {
    String id;
    String catName;
    String price = "";
    String language = "";
    String image = "";
    String status = "";
    String createdAt = "";
    String updatedAt = "";

    public String getId() {
        return id;
    }

    public String getCatName() {
        return catName;
    }

    public String getPrice() {
        return price;
    }

    public String getLanguage() {
        return language;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setLanguage(String language) {
        this.language = language;
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
