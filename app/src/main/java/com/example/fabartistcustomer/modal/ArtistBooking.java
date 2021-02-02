package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class ArtistBooking implements Serializable {
    String userName = "";
    String userImage = "";
    String rating = "";
    String comment = "";
    String ratingDate = "";
    String price = "";
    String bookingTime = "";
    String bookingDate = "";
    String currencyType = "";

    public String getUserName() {
        return userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public String getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public String getRatingDate() {
        return ratingDate;
    }

    public String getPrice() {
        return price;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRatingDate(String ratingDate) {
        this.ratingDate = ratingDate;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
}
