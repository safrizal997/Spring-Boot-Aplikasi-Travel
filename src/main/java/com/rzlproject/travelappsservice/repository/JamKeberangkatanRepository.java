package com.rzlproject.travelappsservice.repository;

import com.rzlproject.travelappsservice.entity.JamKeberangkatan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JamKeberangkatanRepository extends JpaRepository<JamKeberangkatan, Long> {
}
