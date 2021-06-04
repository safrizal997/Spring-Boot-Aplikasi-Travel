package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.TransaksiTiket;
import com.rzlproject.travelappsservice.model.TransaksiRequest;

public interface TransaksiService {

    TransaksiTiket addTransaction (TransaksiRequest transaksiRequest);


}
