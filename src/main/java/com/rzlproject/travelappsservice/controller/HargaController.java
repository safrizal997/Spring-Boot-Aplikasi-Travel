package com.rzlproject.travelappsservice.controller;

import com.rzlproject.travelappsservice.entity.Harga;
import com.rzlproject.travelappsservice.model.HargaRequest;
import com.rzlproject.travelappsservice.service.HargaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/harga", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
@Api(tags = "Harga Service", description = "Handling Harga Service")
public class HargaController {

    @Autowired
    private HargaService hargaService;

    @GetMapping
    public List<Harga> getAllHarga() {
        return hargaService.getAllHarga();
    }

    @PostMapping
    public Harga addHarga(@RequestBody HargaRequest hargaRequest) {
        return hargaService.addHarga(hargaRequest);
    }

    @PutMapping(path = "/{hargaid}")
    Harga updateHarga(@RequestBody HargaRequest hargaRequest, @PathVariable("hargaid") Long hargaId) {
        return hargaService.updateHarga(hargaRequest, hargaId);
    }

    @DeleteMapping(path = "/{hargaid}")
    public String deleteHargaById(@PathVariable("hargaid") Long hargaId) {
        return hargaService.deleteHargaById(hargaId);
    }
}
