package com.rzlproject.travelappsservice.controller;

import com.rzlproject.travelappsservice.entity.TransaksiTiket;
import com.rzlproject.travelappsservice.model.TransaksiRequest;
import com.rzlproject.travelappsservice.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/transaction", produces = MediaType.APPLICATION_JSON_VALUE)
public class TransaksiController {

    @Autowired
    private TransaksiService transaksiService;

    @PostMapping
    public TransaksiTiket addTransaction (@RequestBody TransaksiRequest transaksiRequest){
        return transaksiService.addTransaction(transaksiRequest);
    }


}
