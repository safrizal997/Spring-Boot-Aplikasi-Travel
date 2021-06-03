package com.rzlproject.travelappsservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "transaksi_tiket_tbl")
public class TransaksiTiket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaksiId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (referencedColumnName = "user_id")
    private User userId;
    private Integer tanggal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (referencedColumnName = "jam_keberangkatan_id")
    private JamKeberangkatan jamKeberangkatanId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (referencedColumnName = "shuttle_id")
    private Shuttle tujuanShuttelId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (referencedColumnName = "shuttle_id")
    private Shuttle asalShuttelId;
    private Integer nomorKursi;
    private String namaPenumpang;
    private String nomorHP;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (referencedColumnName = "harga_id")
    private Harga harga;

    public TransaksiTiket() {
    }

    public TransaksiTiket(User userId, Integer tanggal, JamKeberangkatan jamKeberangkatanId, Shuttle tujuanShuttelId, Shuttle asalShuttelId, Integer nomorKursi, String namaPenumpang, String nomorHP, Harga harga) {
        this.userId = userId;
        this.tanggal = tanggal;
        this.jamKeberangkatanId = jamKeberangkatanId;
        this.tujuanShuttelId = tujuanShuttelId;
        this.asalShuttelId = asalShuttelId;
        this.nomorKursi = nomorKursi;
        this.namaPenumpang = namaPenumpang;
        this.nomorHP = nomorHP;
        this.harga = harga;
    }

    public Long getTransaksiId() {
        return transaksiId;
    }

    public void setTransaksiId(Long transaksiId) {
        this.transaksiId = transaksiId;
    }

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

    public Harga getHarga() {
        return harga;
    }

    public void setHarga(Harga harga) {
        this.harga = harga;
    }
}
