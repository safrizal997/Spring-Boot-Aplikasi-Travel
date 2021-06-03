package com.rzlproject.travelappsservice.repository;

import com.rzlproject.travelappsservice.entity.Kota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KotaRepository extends JpaRepository<Kota, Long> {
}
