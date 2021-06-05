package com.rzlproject.travelappsservice.service.impl;

import com.rzlproject.travelappsservice.entity.Harga;
import com.rzlproject.travelappsservice.repository.HargaRepository;
import com.rzlproject.travelappsservice.service.HargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HargaServiceImpl implements HargaService {

    @Autowired
    private HargaRepository hargaRepository;

    @Override
    public List<Harga> getAllHarga() {
        return hargaRepository.findAll();
    }

    @Override
    public Harga addHarga(Harga hargaRequest) {
        Harga harga = new Harga();
        return saveHarga(hargaRequest, harga);
    }

    @Override
    public Harga updateHarga(Harga hargaRequest, Long hargaId) {
        Optional<Harga> findHargaId = hargaRepository.findById(hargaId);
        if (findHargaId.isPresent()){
            Harga harga = findHargaId.get();
            return saveHarga(hargaRequest, harga);
        }
        return null;
    }

    private Harga saveHarga (Harga hargaRequest, Harga harga){
        harga.setHarga(hargaRequest.getHarga());
        return hargaRepository.save(harga);
    }

    @Override
    public String deleteHargaById(Long hargaId) {
        Optional<Harga> findHargaId = hargaRepository.findById(hargaId);
        if (findHargaId.isPresent()){
            hargaRepository.deleteById(hargaId);
            return "DELETE COMPLETE";
        }
        return "ID NOT FOUND";
    }
}
