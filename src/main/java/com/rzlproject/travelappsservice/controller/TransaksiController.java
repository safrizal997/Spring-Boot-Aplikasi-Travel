package com.rzlproject.travelappsservice.controller;

import com.rzlproject.travelappsservice.entity.TransaksiTiket;
import com.rzlproject.travelappsservice.model.TransaksiRequest;
import com.rzlproject.travelappsservice.service.TransaksiService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/transaction", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
@Api(tags = "Transaction Service", description = "Handling Transaction Service")
public class TransaksiController {

    @Autowired
    private TransaksiService transaksiService;

    @PostMapping
    public TransaksiTiket addTransaction(@RequestBody TransaksiRequest transaksiRequest) {
        return transaksiService.addTransaction(transaksiRequest);
    }

    @GetMapping
    public List<TransaksiTiket> getAll() {
        return transaksiService.getAll();
    }

    @GetMapping(path = "/{transaksiId}")
    public TransaksiTiket getById(@PathVariable("transaksiId") Long transaksiId) {
        return transaksiService.getById(transaksiId);
    }

    @PutMapping(path = "/{transaksiId}")
    public TransaksiTiket editTransaction(TransaksiRequest transaksiRequest, @PathVariable("transaksiId") Long transaksiId) {
        return transaksiService.editTransaction(transaksiRequest, transaksiId);
    }

    @DeleteMapping(path = "/{transaksiId}")
    public String deleteTransactionById(@PathVariable("transaksiId") Long transaksiId) {
        return transaksiService.deleteTransactionById(transaksiId);
    }

    @DeleteMapping
    public String deleteAllTransaction() {
        return transaksiService.deleteAllTransaction();
    }

}
