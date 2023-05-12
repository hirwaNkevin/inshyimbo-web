package com.inshyimboweb.inshyimbo.model;

import jakarta.persistence.*;

@Entity
public class IUser {
    @Id
    private String Id;
    private String fullName;
    private String password;
    

    public IUser() {
    }

    public IUser(String id, String fullName, String password) {
        Id = id;
        this.fullName = fullName;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
