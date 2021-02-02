package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class TicketComment implements Serializable {
    String id = "";
    String ticketId = "";
    String comment = "";
    String role = "";
    String userId = "";
    String createdAt = "";
    String userName = "";

    public String getId() {
        return id;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getComment() {
        return comment;
    }

    public String getRole() {
        return role;
    }

    public String getUserId() {
        return userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
