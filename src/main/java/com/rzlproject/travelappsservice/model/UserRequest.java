package com.rzlproject.travelappsservice.model;

import com.rzlproject.travelappsservice.entity.Shuttle;

public class UserRequest {

    private String userName;
    private String password;
    private String nama;
    private Shuttle shuttleId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Shuttle getShuttleId() {
        return shuttleId;
    }

    public void setShuttleId(Shuttle shuttleId) {
        this.shuttleId = shuttleId;
    }
}
