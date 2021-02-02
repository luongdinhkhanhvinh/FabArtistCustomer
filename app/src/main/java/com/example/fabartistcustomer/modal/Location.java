package com.example.fabartistcustomer.modal;

import java.io.Serializable;

public class Location implements Serializable {
    String latI = "";
    String longI = "";

    public String getLatI() {
        return latI;
    }

    public String getLongI() {
        return longI;
    }

    public void setLatI(String latI) {
        this.latI = latI;
    }

    public void setLongI(String longI) {
        this.longI = longI;
    }
}
