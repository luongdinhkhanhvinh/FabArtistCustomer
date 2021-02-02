package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class ChatList implements Serializable {
    String id = "";
    String message = "";
    String date = "";
    String senderName = "";
    String userId = "";
    String artistId = "";
    String sendBy = "";
    String sendAt = "";
    String artistName = "";
    String artistImage = "";

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getUserId() {
        return userId;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getSendBy() {
        return sendBy;
    }

    public String getSendAt() {
        return sendAt;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistImage() {
        return artistImage;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public void setSendBy(String sendBy) {
        this.sendBy = sendBy;
    }

    public void setSendAt(String sendAt) {
        this.sendAt = sendAt;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setArtistImage(String artistImage) {
        this.artistImage = artistImage;
    }
}
