package com.rzlproject.travelappsservice.repository;

import com.rzlproject.travelappsservice.entity.Harga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HargaRepository extends JpaRepository<Harga, Long> {
}
