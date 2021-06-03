package com.rzlproject.travelappsservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "harga_tbl")
public class Harga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "harga_id")
    private Long hargaId;
    private Integer harga;

    public Harga() {
    }

    public Harga(Integer harga) {
        this.harga = harga;
    }

    public Long getHargaId() {
        return hargaId;
    }

    public void setHargaId(Long hargaId) {
        this.hargaId = hargaId;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }
}
