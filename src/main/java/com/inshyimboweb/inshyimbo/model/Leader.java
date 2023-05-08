package com.inshyimboweb.inshyimbo.model;

import jakarta.persistence.*;

@Entity
public class Leader {
    @Id
    private String Id;
    private String fullName;
    private float rating;
    private int rates;
    
    public Leader() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    
}
