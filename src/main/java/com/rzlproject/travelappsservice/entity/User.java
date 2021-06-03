package com.rzlproject.travelappsservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_tbl")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    private String userName;
    private String password;
    private String nama;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (referencedColumnName = "shuttle_id")
    private Shuttle shuttleId;
    private String level;
    private Byte isActive;

    public User() {
    }

    public User(String userName, String password, String nama, Shuttle shuttleId, String level, Byte isActive) {
        this.userName = userName;
        this.password = password;
        this.nama = nama;
        this.shuttleId = shuttleId;
        this.level = level;
        this.isActive = isActive;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }
}
