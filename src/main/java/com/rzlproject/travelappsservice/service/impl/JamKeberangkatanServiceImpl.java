package com.rzlproject.travelappsservice.service.impl;

import com.rzlproject.travelappsservice.entity.JamKeberangkatan;
import com.rzlproject.travelappsservice.model.JamKeberangkatanRequest;
import com.rzlproject.travelappsservice.repository.JamKeberangkatanRepository;
import com.rzlproject.travelappsservice.service.JamKeberangkaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JamKeberangkatanServiceImpl implements JamKeberangkaanService {

    @Autowired
    private JamKeberangkatanRepository jamKeberangkatanRepository;

    @Override
    public List<JamKeberangkatan> getAll() {
        return jamKeberangkatanRepository.findAll();
    }

    @Override
    public JamKeberangkatan addJamKeberangkatan(JamKeberangkatanRequest jamKeberangkatanRequest) {
        JamKeberangkatan jamKeberangkatan = new JamKeberangkatan();
        return saveJamKeberangkatan(jamKeberangkatanRequest, jamKeberangkatan);
    }

    @Override
    public JamKeberangkatan editJamKeberangkatan(JamKeberangkatanRequest jamKeberangkatanRequest, Long jamId) {
        Optional<JamKeberangkatan> findJamId = jamKeberangkatanRepository.findById(jamId);
        if (findJamId.isPresent()){
            JamKeberangkatan jamKeberangkatan = findJamId.get();
            return saveJamKeberangkatan(jamKeberangkatanRequest,jamKeberangkatan);
        }
        return null;
    }

    private JamKeberangkatan saveJamKeberangkatan (JamKeberangkatanRequest jamKeberangkatanRequest, JamKeberangkatan jamKeberangkatan){
        jamKeberangkatan.setJam(jamKeberangkatanRequest.getJam());
        return jamKeberangkatanRepository.save(jamKeberangkatan);
    }

    @Override
    public String DeleteJamById(Long id) {
        Optional<JamKeberangkatan> findJamId = jamKeberangkatanRepository.findById(id);
        if (findJamId.isPresent()){
            jamKeberangkatanRepository.deleteById(id);
            return "DELETE COMPLETE";
        }
        return "ID NOT FOUND";
    }
}
