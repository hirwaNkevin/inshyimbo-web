package com.inshyimboweb.inshyimbo.model;

import jakarta.persistence.*;


@Entity
public class Level {
    @Id
    private String Id;
    private String name;

    public Level() {
    }
    
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
