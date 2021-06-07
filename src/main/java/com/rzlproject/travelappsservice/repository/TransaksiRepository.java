package com.rzlproject.travelappsservice.repository;

import com.rzlproject.travelappsservice.entity.TransaksiTiket;
import com.rzlproject.travelappsservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransaksiRepository extends JpaRepository<TransaksiTiket, Long> {

    List<TransaksiTiket> findByUserIdUserId(Long userId);

    //Manual Query
    @Query("select t from TransaksiTiket t where t.userId.userId =?1")
    List<TransaksiTiket> getByUserId(Long userId);

}
