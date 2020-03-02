package com.ewidencja.repo;

import com.ewidencja.model.Record;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends CrudRepository<Record, Integer> {
}
