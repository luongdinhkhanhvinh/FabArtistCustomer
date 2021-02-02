package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class Product implements Serializable {
    String id = "";
    String userId = "";
    String productName = "";
    String productImage = "";
    String price = "";
    String createdAt = "";
    String updatedAt = "";
    String currencyType = "";
    boolean isSelected;

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public String getPrice() {
        return price;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
