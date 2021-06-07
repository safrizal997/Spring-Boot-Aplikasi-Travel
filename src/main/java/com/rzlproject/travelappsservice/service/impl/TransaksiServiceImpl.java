package com.rzlproject.travelappsservice.service.impl;

import com.rzlproject.travelappsservice.entity.*;
import com.rzlproject.travelappsservice.model.TransaksiRequest;
import com.rzlproject.travelappsservice.repository.*;
import com.rzlproject.travelappsservice.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TransaksiServiceImpl implements TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JamKeberangkatanRepository jamKeberangkatanRepository;

    @Autowired
    private ShuttelRepository shuttelRepository;

    @Autowired
    private HargaRepository hargaRepository;

    @Override
    public List<TransaksiTiket> getAll() {
        return transaksiRepository.findAll();
    }

    @Override
    public TransaksiTiket getById(Long transaksiId) {
        Optional<TransaksiTiket> findTransactionId = transaksiRepository.findById(transaksiId);
        return findTransactionId.orElse(null);
    }

    @Override
    public List<TransaksiTiket> getByUserId(Long userId) {
        return transaksiRepository.findByUserIdUserId(userId);
    }

    @Override
    @Transactional
    public TransaksiTiket addTransaction(TransaksiRequest transaksiRequest) {
        TransaksiTiket transaksiTiket = new TransaksiTiket();
        return saveTransaction(transaksiRequest, transaksiTiket);
    }

    @Override
    public TransaksiTiket editTransaction(TransaksiRequest transaksiRequest, Long transaksiId) {
        Optional<TransaksiTiket> findTransaksiId = transaksiRepository.findById(transaksiId);
        if (findTransaksiId.isPresent()) {
            TransaksiTiket transaksiTiket = findTransaksiId.get();
            return saveTransaction(transaksiRequest, transaksiTiket);
        }
        return null;
    }

    private TransaksiTiket saveTransaction(TransaksiRequest transaksiRequest, TransaksiTiket transaksiTiket) {
        Optional<User> findUserId = userRepository.findById(transaksiRequest.getUserId());
        if (findUserId.isPresent()) {
            transaksiTiket.setUserId(findUserId.get());
            transaksiTiket.setTanggal(transaksiRequest.getTanggal());

            Optional<JamKeberangkatan> findJamKeberangkatan = jamKeberangkatanRepository.findById(transaksiRequest.getJamKeberangkatanId());
            if (findJamKeberangkatan.isPresent()) {
                transaksiTiket.setJamKeberangkatanId(findJamKeberangkatan.get());

                Optional<Shuttle> findShuttleTujuan = shuttelRepository.findById(transaksiRequest.getTujuanShuttelId());
                if (findShuttleTujuan.isPresent()) {
                    transaksiTiket.setTujuanShuttelId(findShuttleTujuan.get());

                    Optional<Shuttle> findShuttelAsal = shuttelRepository.findById(transaksiRequest.getAsalShuttelId());
                    if (findShuttelAsal.isPresent()) {
                        transaksiTiket.setAsalShuttelId(findShuttelAsal.get());
                        transaksiTiket.setNomorKursi(transaksiRequest.getNomorKursi());
                        transaksiTiket.setNamaPenumpang(transaksiRequest.getNamaPenumpang());
                        transaksiTiket.setNomorHP(transaksiRequest.getNomorHP());

                        if ((findShuttelAsal.get().getShuttleId() == 1 && findShuttleTujuan.get().getShuttleId() == 3) ||
                                (findShuttelAsal.get().getShuttleId() == 2 && findShuttleTujuan.get().getShuttleId() == 4) ||
                                (findShuttelAsal.get().getShuttleId() == 3 && findShuttleTujuan.get().getShuttleId() == 1) ||
                                (findShuttelAsal.get().getShuttleId() == 4 && findShuttleTujuan.get().getShuttleId() == 2)) {
                            transaksiTiket.setHarga(hargaRepository.findHargaId(2L));
                        } else if ((findShuttelAsal.get().getShuttleId() == 1 && findShuttleTujuan.get().getShuttleId() == 4) || (findShuttelAsal.get().getShuttleId() == 4 && findShuttleTujuan.get().getShuttleId() == 1)) {
                            transaksiTiket.setHarga(hargaRepository.findHargaId(3L));
                        } else if ((findShuttelAsal.get().getShuttleId() == 2 && findShuttleTujuan.get().getShuttleId() == 3) || (findShuttelAsal.get().getShuttleId() == 3 && findShuttleTujuan.get().getShuttleId() == 2)) {
                            transaksiTiket.setHarga(hargaRepository.findHargaId(1L));
                        }

                        return transaksiRepository.save(transaksiTiket);

                    }
                }
            }
        }
        return null;
    }

    @Override
    public String deleteTransactionById(Long transaksiId) {
        Optional<TransaksiTiket> findTransaksiId = transaksiRepository.findById(transaksiId);
        if (findTransaksiId.isPresent()) {
            transaksiRepository.deleteById(transaksiId);
            return "DELETE COMPLETE";
        }
        return "ID NOT FOUND";
    }

    @Override
    public String deleteAllTransaction() {
        List<TransaksiTiket> transaksiTikets = transaksiRepository.findAll();
        transaksiRepository.deleteAll(transaksiTikets);
        return "DELETE COMPLETE";
    }
}
