package com.inshyimboweb.inshyimbo.model;

import jakarta.persistence.*;

@Entity
public class IUser {
    @Id
    private String NID;
    private String fullName;
    private String password;
    

    public IUser() {
    }

    public IUser(String nID, String fullName, String password) {
        NID = nID;
        this.fullName = fullName;
        this.password = password;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String nID) {
        NID = nID;
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
