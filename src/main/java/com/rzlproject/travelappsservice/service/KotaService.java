package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.Kota;

import java.util.List;

public interface KotaService {

    List<Kota> getAllKota();

    Kota getKotaById(Long kotaId);

    Kota addKota(Kota kota);

    String deleteKotaById(Long id);
}
