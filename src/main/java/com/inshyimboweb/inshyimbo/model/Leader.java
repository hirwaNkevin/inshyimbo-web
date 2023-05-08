package com.inshyimboweb.inshyimbo.model;

import jakarta.persistence.*;

@Entity
public class Leader {
    @Id
    private String Id;
    private String fullName;
    private float rating;
    private int rates;
    @ManyToOne(fetch = FetchType.LAZY)
    private Level level;
    
    public Leader(Level level) {
        this.level = level;
    }

    public Leader(String id, String fullName, float rating, int rates, Level level) {
        Id = id;
        this.fullName = fullName;
        this.rating = rating;
        this.rates = rates;
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

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
