package com.rzlproject.travelappsservice.repository;

import com.rzlproject.travelappsservice.entity.Harga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HargaRepository extends JpaRepository<Harga, Long> {

    @Query("select h from Harga h where h.hargaId = ?1")
    Harga findHargaId (Long id);

}
