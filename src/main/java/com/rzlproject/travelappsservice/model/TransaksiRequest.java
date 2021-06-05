package com.rzlproject.travelappsservice.model;

import com.rzlproject.travelappsservice.entity.JamKeberangkatan;
import com.rzlproject.travelappsservice.entity.Shuttle;
import com.rzlproject.travelappsservice.entity.User;

public class TransaksiRequest {

    private Long userId;
    private Integer tanggal;
    private Long jamKeberangkatanId;
    private Long tujuanShuttelId;
    private Long asalShuttelId;
    private Integer nomorKursi;
    private String namaPenumpang;
    private String nomorHP;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getTanggal() {
        return tanggal;
    }

    public void setTanggal(Integer tanggal) {
        this.tanggal = tanggal;
    }

    public Long getJamKeberangkatanId() {
        return jamKeberangkatanId;
    }

    public void setJamKeberangkatanId(Long jamKeberangkatanId) {
        this.jamKeberangkatanId = jamKeberangkatanId;
    }

    public Long getTujuanShuttelId() {
        return tujuanShuttelId;
    }

    public void setTujuanShuttelId(Long tujuanShuttelId) {
        this.tujuanShuttelId = tujuanShuttelId;
    }

    public Long getAsalShuttelId() {
        return asalShuttelId;
    }

    public void setAsalShuttelId(Long asalShuttelId) {
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
