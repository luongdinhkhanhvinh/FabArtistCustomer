package com.example.fabartistcustomer.modal;

import java.io.Serializable;
import java.util.ArrayList;

public class ArtistDetails implements Serializable {
    String id = "";
    String user_id = "";
    String name = "";
    String categoryId = "";
    String description = "";
    String aboutUs = "";
    String image = "";
    String completionRate = "";
    String createdAt = "";
    String updatedAt = "";
    String bio = "";
    String longitude = "";
    String latitude = "";
    String location = "";
    String videoUrl = "";
    String price = "";
    String bookingFlag = "";
    String isOnline = "";
    String gender = "";
    String preference = "";
    String updateProfile = "";
    String categoryName = "";
    String categoryPrice = "";
    String avaRating = "";
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Reviews> reviews = new ArrayList<>();
    ArrayList<Gallery> gallery = new ArrayList<>();
    ArrayList<Qualifications> qualifications = new ArrayList<>();
    ArrayList<ArtistBooking> artistBooking = new ArrayList<>();
    String earning = "";
    String jobDone = "";
    String totalJob = "";
    String completePercentages = "";
    String favStatus = "";
    String commissionType = "";
    String flatType = "";
    String artistCommissionType = "";
    String currencyType = "";
    String bannerImage = "";

    public String getId() {
        return id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getDescription() {
        return description;
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public String getImage() {
        return image;
    }

    public String getCompletionRate() {
        return completionRate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getBio() {
        return bio;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLocation() {
        return location;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getPrice() {
        return price;
    }

    public String getBookingFlag() {
        return bookingFlag;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public String getGender() {
        return gender;
    }

    public String getPreference() {
        return preference;
    }

    public String getUpdateProfile() {
        return updateProfile;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryPrice() {
        return categoryPrice;
    }

    public String getAvaRating() {
        return avaRating;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Reviews> getReviews() {
        return reviews;
    }

    public ArrayList<Gallery> getGallery() {
        return gallery;
    }

    public ArrayList<Qualifications> getQualifications() {
        return qualifications;
    }

    public ArrayList<ArtistBooking> getArtistBooking() {
        return artistBooking;
    }

    public String getEarning() {
        return earning;
    }

    public String getJobDone() {
        return jobDone;
    }

    public String getTotalJob() {
        return totalJob;
    }

    public String getCompletePercentages() {
        return completePercentages;
    }

    public String getFavStatus() {
        return favStatus;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public String getFlatType() {
        return flatType;
    }

    public String getArtistCommissionType() {
        return artistCommissionType;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCompletionRate(String completionRate) {
        this.completionRate = completionRate;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setBookingFlag(String bookingFlag) {
        this.bookingFlag = bookingFlag;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public void setUpdateProfile(String updateProfile) {
        this.updateProfile = updateProfile;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryPrice(String categoryPrice) {
        this.categoryPrice = categoryPrice;
    }

    public void setAvaRating(String avaRating) {
        this.avaRating = avaRating;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setReviews(ArrayList<Reviews> reviews) {
        this.reviews = reviews;
    }

    public void setGallery(ArrayList<Gallery> gallery) {
        this.gallery = gallery;
    }

    public void setQualifications(ArrayList<Qualifications> qualifications) {
        this.qualifications = qualifications;
    }

    public void setArtistBooking(ArrayList<ArtistBooking> artistBooking) {
        this.artistBooking = artistBooking;
    }

    public void setEarning(String earning) {
        this.earning = earning;
    }

    public void setJobDone(String jobDone) {
        this.jobDone = jobDone;
    }

    public void setTotalJob(String totalJob) {
        this.totalJob = totalJob;
    }

    public void setCompletePercentages(String completePercentages) {
        this.completePercentages = completePercentages;
    }

    public void setFavStatus(String favStatus) {
        this.favStatus = favStatus;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    public void setFlatType(String flatType) {
        this.flatType = flatType;
    }

    public void setArtistCommissionType(String artistCommissionType) {
        this.artistCommissionType = artistCommissionType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }
}
