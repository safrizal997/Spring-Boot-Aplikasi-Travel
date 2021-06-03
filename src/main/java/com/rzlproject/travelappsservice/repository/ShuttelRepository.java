package com.rzlproject.travelappsservice.repository;

import com.rzlproject.travelappsservice.entity.Shuttle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShuttelRepository extends JpaRepository<Shuttle, Long> {
}
