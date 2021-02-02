package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class Category implements Serializable {
    String id;
    String catName;
    String price = "";
    String createdAt = "";
    String updatedAt = "";
    String status = "";
    String currencyType = "";
    boolean isSelected;

    public String getId() {
        return id;
    }

    public String getCatName() {
        return catName;
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

    public String getStatus() {
        return status;
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

    public void setCatName(String catName) {
        this.catName = catName;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
