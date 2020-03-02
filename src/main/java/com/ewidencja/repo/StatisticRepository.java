package com.ewidencja.repo;

import com.ewidencja.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatisticRepository extends JpaRepository<Record, Long>{

}