package com.rzlproject.travelappsservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "jamkeberangkatan_tbl")
public class JamKeberangkatan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jam_Keberangkatan_id")
    private Long jamKeberangkatanId;
    private String jam;

    public JamKeberangkatan() {
    }

    public JamKeberangkatan(String jam) {
        this.jam = jam;
    }

    public Long getJamKeberangkatanId() {
        return jamKeberangkatanId;
    }

    public void setJamKeberangkatanId(Long jamKeberangkatanId) {
        this.jamKeberangkatanId = jamKeberangkatanId;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
