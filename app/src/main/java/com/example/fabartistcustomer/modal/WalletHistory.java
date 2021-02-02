package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class WalletHistory implements Serializable {
    String id = "";
    String userId = "";
    String description = "";
    String amount = "";
    String invoiceId = "";
    String type = "";
    String status = "";
    String orderId = "";
    String currencyType = "";
    String createdAt = "";

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    public String getAmount() {
        return amount;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCurrencyType() {
        return currencyType;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
