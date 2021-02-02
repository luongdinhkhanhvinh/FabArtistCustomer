package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class Discount implements Serializable {
    String code = "";
    String description = "";

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
