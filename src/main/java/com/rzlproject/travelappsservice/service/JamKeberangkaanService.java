package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.JamKeberangkatan;
import com.rzlproject.travelappsservice.model.JamKeberangkatanRequest;

import java.util.List;

public interface JamKeberangkaanService {

    List<JamKeberangkatan> getAll ();

    JamKeberangkatan addJamKeberangkatan (JamKeberangkatanRequest jamKeberangkatanRequest);

    JamKeberangkatan editJamKeberangkatan (JamKeberangkatanRequest jamKeberangkatanRequest, Long jamId);

    String DeleteJamById (Long id);
}
