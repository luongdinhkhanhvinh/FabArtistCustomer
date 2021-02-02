package com.example.fabartistcustomer.modal;

import java.util.ArrayList;

public class WalletCurrency {
    String id = "";
    String userId = "";
    String amount = "";
    String currencyType = "";
    String currencyCode = "";
    String currencyId = "";
    String currencyName = "";
    ArrayList<WalletHistory> walletHistory = new ArrayList<>();

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getAmount() {
        return amount;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public ArrayList<WalletHistory> getWalletHistory() {
        return walletHistory;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setWalletHistory(ArrayList<WalletHistory> walletHistory) {
        this.walletHistory = walletHistory;
    }

    @Override
    public String toString() {
        return "(" + currencyCode + ")" + currencyName;
    }
}
