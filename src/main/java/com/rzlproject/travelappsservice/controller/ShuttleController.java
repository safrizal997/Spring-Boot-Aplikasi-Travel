package com.rzlproject.travelappsservice.controller;

import com.rzlproject.travelappsservice.entity.Shuttle;
import com.rzlproject.travelappsservice.model.ShuttleRequest;
import com.rzlproject.travelappsservice.service.ShuttleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path = "/api/v1/shuttle", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
@Api(tags = "Shuttle Service", description = "Handling Shuttle Service")
public class ShuttleController {

    @Autowired
    private ShuttleService shuttleService;

    @GetMapping
    public Set<Shuttle> getAll() {
        return shuttleService.getAll();
    }

    @PostMapping
    public Shuttle addShuttle(@RequestBody ShuttleRequest shuttleRequest) {
        return shuttleService.addShuttle(shuttleRequest);
    }

    @DeleteMapping(path = "/{shuttleid}")
    public String DeleteShuttleById(@PathVariable("shuttleid") Long shuttleId) {
        return shuttleService.DeleteShuttleById(shuttleId);
    }
}
