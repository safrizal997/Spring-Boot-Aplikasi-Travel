package com.rzlproject.travelappsservice.model;

import com.rzlproject.travelappsservice.entity.JamKeberangkatan;
import com.rzlproject.travelappsservice.entity.Shuttle;
import com.rzlproject.travelappsservice.entity.User;

public class TransaksiRequest {

    private User userId;
    private Integer tanggal;
    private JamKeberangkatan jamKeberangkatanId;
    private Shuttle tujuanShuttelId;
    private Shuttle asalShuttelId;
    private Integer nomorKursi;
    private String namaPenumpang;
    private String nomorHP;

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Integer getTanggal() {
        return tanggal;
    }

    public void setTanggal(Integer tanggal) {
        this.tanggal = tanggal;
    }

    public JamKeberangkatan getJamKeberangkatanId() {
        return jamKeberangkatanId;
    }

    public void setJamKeberangkatanId(JamKeberangkatan jamKeberangkatanId) {
        this.jamKeberangkatanId = jamKeberangkatanId;
    }

    public Shuttle getTujuanShuttelId() {
        return tujuanShuttelId;
    }

    public void setTujuanShuttelId(Shuttle tujuanShuttelId) {
        this.tujuanShuttelId = tujuanShuttelId;
    }

    public Shuttle getAsalShuttelId() {
        return asalShuttelId;
    }

    public void setAsalShuttelId(Shuttle asalShuttelId) {
        this.asalShuttelId = asalShuttelId;
    }

    public Integer getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(Integer nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }
}
