package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.Kota;
import com.rzlproject.travelappsservice.model.KotaRequest;

import java.util.List;

public interface KotaService {

    List<Kota> getAllKota();

    Kota getKotaById(Long kotaId);

    Kota addKota(KotaRequest kotaRequest);

    String deleteKotaById(Long id);
}
