package com.rzlproject.travelappsservice.controller;

import com.rzlproject.travelappsservice.entity.Kota;
import com.rzlproject.travelappsservice.model.KotaRequest;
import com.rzlproject.travelappsservice.service.KotaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/kota", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
@Api(tags = "Kota Service", description = "Handling Kota Service")
public class KotaController {

    @Autowired
    private KotaService kotaService;

    @GetMapping
    public List<Kota> getAllKota() {
        return kotaService.getAllKota();
    }

    @GetMapping(path = "/{kotaid}")
    public Kota getKotaById(@PathVariable("kotaid") Long kotaId) {
        return kotaService.getKotaById(kotaId);
    }

    @PostMapping
    public Kota addKota(@RequestBody KotaRequest kotaRequest) {
        return kotaService.addKota(kotaRequest);
    }

    @DeleteMapping(path = "/{kotaid}")
    public String deleteKotaById(@PathVariable("kotaid") Long id) {
        return kotaService.deleteKotaById(id);
    }
}
