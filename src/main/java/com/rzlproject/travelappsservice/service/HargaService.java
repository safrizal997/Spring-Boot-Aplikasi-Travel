package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.Harga;

import java.util.List;

public interface HargaService {

    List<Harga> getAllHarga();

    Harga addHarga(Harga hargaRequest);

    Harga updateHarga(Harga hargaRequest, Long hargaId);

    String deleteHargaById (Long hargaId);
}
