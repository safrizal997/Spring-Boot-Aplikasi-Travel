package com.rzlproject.travelappsservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "kota_tbl")
public class Kota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kota_id")
    private Long kotaId;
    private String namaKota;

    public Kota() {
    }

    public Kota(String namaKota) {
        this.namaKota = namaKota;
    }

    public Long getKotaId() {
        return kotaId;
    }

    public void setKotaId(Long kotaId) {
        this.kotaId = kotaId;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }
}
