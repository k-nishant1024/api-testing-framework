package com.example.pojo2;

import java.util.List;

public class Membership {
    private String level;
    private String expiryDate;
    private List<Benefits> benefits;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public List<Benefits> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<Benefits> benefits) {
        this.benefits = benefits;
    }
}