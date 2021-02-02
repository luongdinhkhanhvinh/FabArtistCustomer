package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class Reviews implements Serializable {
    String id = "";
    String userId = "";
    String artistId = "";
    String rating = "";
    String comment = "";
    String createdAt = "";
    String status = "";
    String bookingId = "";
    String name = "";
    String image = "";

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getStatus() {
        return status;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
