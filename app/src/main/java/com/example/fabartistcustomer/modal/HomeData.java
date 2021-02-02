package com.example.fabartistcustomer.modal;

import java.io.Serializable;
import java.util.ArrayList;

public class HomeData implements Serializable {
    ArrayList<HomeBanner> banner = new ArrayList<>();
    ArrayList<HomeNearByArtists> nearByArtist = new ArrayList<>();
    ArrayList<UserBooking> activeBooking = new ArrayList<>();
    ArrayList<HomeRecommended> recommended = new ArrayList<>();
    ArrayList<History> invoice = new ArrayList<>();
    ArrayList<HomeCategory> category = new ArrayList<>();

    public ArrayList<HomeBanner> getBanner() {
        return banner;
    }

    public ArrayList<HomeNearByArtists> getNearByArtist() {
        return nearByArtist;
    }

    public ArrayList<UserBooking> getActiveBooking() {
        return activeBooking;
    }

    public ArrayList<HomeRecommended> getRecommended() {
        return recommended;
    }

    public ArrayList<History> getInvoice() {
        return invoice;
    }

    public ArrayList<HomeCategory> getCategory() {
        return category;
    }

    public void setBanner(ArrayList<HomeBanner> banner) {
        this.banner = banner;
    }

    public void setNearByArtist(ArrayList<HomeNearByArtists> nearByArtist) {
        this.nearByArtist = nearByArtist;
    }

    public void setActiveBooking(ArrayList<UserBooking> activeBooking) {
        this.activeBooking = activeBooking;
    }

    public void setRecommended(ArrayList<HomeRecommended> recommended) {
        this.recommended = recommended;
    }

    public void setInvoice(ArrayList<History> invoice) {
        this.invoice = invoice;
    }

    public void setCategory(ArrayList<HomeCategory> category) {
        this.category = category;
    }
}
