package com.rzlproject.travelappsservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "shuttel_tbl")
public class Shuttle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shuttle_id")
    private Long shuttleId;
    private String namaShuttel;

    @ManyToOne
    @JoinColumn (referencedColumnName = "kota_id")
    private Kota kotaId;

    public Shuttle() {
    }

    public Shuttle(String namaShuttel, Kota kotaId) {
        this.namaShuttel = namaShuttel;
        this.kotaId = kotaId;
    }

    public Long getShuttleId() {
        return shuttleId;
    }

    public void setShuttleId(Long shuttleId) {
        this.shuttleId = shuttleId;
    }

    public String getNamaShuttel() {
        return namaShuttel;
    }

    public void setNamaShuttel(String namaShuttel) {
        this.namaShuttel = namaShuttel;
    }

    public Kota getKotaId() {
        return kotaId;
    }

    public void setKotaId(Kota kotaId) {
        this.kotaId = kotaId;
    }
}
