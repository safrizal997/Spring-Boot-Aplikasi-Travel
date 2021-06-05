package com.rzlproject.travelappsservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "shuttel_tbl")
public class Shuttle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shuttle_id")
    private Long shuttleId;
    private String namaShuttle;

    @ManyToOne
    @JoinColumn (referencedColumnName = "kota_id")
    private Kota kotaId;

    public Shuttle() {
    }

    public Shuttle(String namaShuttle, Kota kotaId) {
        this.namaShuttle = namaShuttle;
        this.kotaId = kotaId;
    }

    public Long getShuttleId() {
        return shuttleId;
    }

    public void setShuttleId(Long shuttleId) {
        this.shuttleId = shuttleId;
    }

    public String getNamaShuttle() {
        return namaShuttle;
    }

    public void setNamaShuttle(String namaShuttle) {
        this.namaShuttle = namaShuttle;
    }

    public Kota getKotaId() {
        return kotaId;
    }

    public void setKotaId(Kota kotaId) {
        this.kotaId = kotaId;
    }
}
