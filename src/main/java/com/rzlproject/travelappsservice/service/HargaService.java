package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.Harga;
import com.rzlproject.travelappsservice.model.HargaRequest;

import java.util.List;

public interface HargaService {

    List<Harga> getAllHarga();

    Harga addHarga(HargaRequest hargaRequest);

    Harga updateHarga(HargaRequest hargaRequest, Long hargaId);

    String deleteHargaById (Long hargaId);
}
