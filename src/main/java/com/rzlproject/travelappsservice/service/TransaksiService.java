package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.TransaksiTiket;
import com.rzlproject.travelappsservice.model.TransaksiRequest;

import java.util.List;

public interface TransaksiService {

    List<TransaksiTiket> getAll();

    TransaksiTiket getById(Long transaksiId);

    TransaksiTiket addTransaction (TransaksiRequest transaksiRequest);

    TransaksiTiket editTransaction (TransaksiRequest transaksiRequest, Long transaksiId);

    String deleteTransactionById (Long transaksiId);

    String deleteAllTransaction();




}
