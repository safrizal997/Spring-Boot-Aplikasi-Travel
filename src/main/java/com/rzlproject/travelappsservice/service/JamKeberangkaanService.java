package com.rzlproject.travelappsservice.service;

import com.rzlproject.travelappsservice.entity.JamKeberangkatan;

import java.util.List;

public interface JamKeberangkaanService {

    List<JamKeberangkatan> getAll ();

    JamKeberangkatan addJamKeberangkatan (JamKeberangkatan jamKeberangkatanRequest);

    JamKeberangkatan editJamKeberangkatan (JamKeberangkatan jamKeberangkatanRequest, Long jamId);

    String DeleteJamById (Long id);
}
