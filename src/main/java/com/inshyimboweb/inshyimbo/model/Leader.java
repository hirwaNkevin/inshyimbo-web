package com.inshyimboweb.inshyimbo.model;

import jakarta.persistence.*;

@Entity
public class Leader {
    @Id
    private String Id;
    private String fullName;
    private float rating;
    private int rates;
}
