package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class Notification implements Serializable {
    String id = "";
    String userId = "";
    String title = "";
    String msg = "";
    String createdAt = "";

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getMsg() {
        return msg;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
