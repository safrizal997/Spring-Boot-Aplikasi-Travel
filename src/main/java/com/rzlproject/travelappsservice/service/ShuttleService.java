package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.Shuttle;
import com.rzlproject.travelappsservice.model.ShuttleRequest;

import java.util.Set;

public interface ShuttleService {

    Set<Shuttle> getAll();
    
    Shuttle addShuttle(ShuttleRequest shuttleRequest);
    
    String DeleteShuttleById(Long shuttleId);
    
    String DeleteAll();
}
