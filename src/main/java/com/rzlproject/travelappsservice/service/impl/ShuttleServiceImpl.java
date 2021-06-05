package com.rzlproject.travelappsservice.service.impl;

import com.rzlproject.travelappsservice.entity.Kota;
import com.rzlproject.travelappsservice.entity.Shuttle;
import com.rzlproject.travelappsservice.model.ShuttleRequest;
import com.rzlproject.travelappsservice.repository.KotaRepository;
import com.rzlproject.travelappsservice.repository.ShuttelRepository;
import com.rzlproject.travelappsservice.service.ShuttleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ShuttleServiceImpl implements ShuttleService {

    @Autowired
    private ShuttelRepository shuttelRepository;

    @Autowired
    private KotaRepository kotaRepository;

    @Override
    public Set<Shuttle> getAll() {
        return new HashSet<>(shuttelRepository.findAll());
    }

    @Override
    public Shuttle addShuttle(ShuttleRequest shuttleRequest) {
        Shuttle shuttle = new Shuttle();
        shuttle.setNamaShuttle(shuttleRequest.getNamaShuttle());
        Optional<Kota> findKotaId = kotaRepository.findById(shuttleRequest.getKotaId());
        if (findKotaId.isPresent()){
            shuttle.setKotaId(findKotaId.get());

            return shuttelRepository.save(shuttle);
        }
        return null;
    }

    @Override
    public String DeleteShuttleById(Long shuttleId) {
        Optional<Shuttle> findShuttleId = shuttelRepository.findById(shuttleId);
        if (findShuttleId.isPresent()){
            shuttelRepository.deleteById(shuttleId);
            return "Delete Complete";
        }
        return "ID Not Found";
    }

    @Override
    public String DeleteAll() {
        List<Shuttle> shuttleList = shuttelRepository.findAll();
        shuttelRepository.deleteAll(shuttleList);

        return "Delete All Complete";
    }
}
