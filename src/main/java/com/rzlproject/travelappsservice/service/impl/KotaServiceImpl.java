package com.rzlproject.travelappsservice.service.impl;

import com.rzlproject.travelappsservice.entity.Kota;
import com.rzlproject.travelappsservice.model.KotaRequest;
import com.rzlproject.travelappsservice.repository.KotaRepository;
import com.rzlproject.travelappsservice.service.KotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KotaServiceImpl implements KotaService {

    @Autowired
    private KotaRepository kotaRepository;

    @Override
    public List<Kota> getAllKota() {
        return kotaRepository.findAll();
    }

    @Override
    public Kota getKotaById(Long kotaId) {
        Optional<Kota> findKotaId = kotaRepository.findById(kotaId);
        return findKotaId.orElse(null);
    }

    @Override
    public Kota addKota(KotaRequest kotaRequest) {
        Kota kotaToSave = new Kota();
        kotaToSave.setNamaKota(kotaRequest.getKota());
        return kotaRepository.save(kotaToSave);
    }

    @Override
    public String deleteKotaById(Long id) {
        Optional<Kota> findKotaId = kotaRepository.findById(id);
        if (findKotaId.isPresent()){
            kotaRepository.deleteById(id);

            return "Delete Complete";
        }
        return "ID Not Found";
    }
}

