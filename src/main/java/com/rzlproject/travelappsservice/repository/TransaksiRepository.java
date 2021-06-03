package com.rzlproject.travelappsservice.repository;

import com.rzlproject.travelappsservice.entity.TransaksiTiket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaksiRepository extends JpaRepository<TransaksiTiket, Long> {
}
