package com.ewidencja.services;

import com.ewidencja.model.Record;


import java.util.List;
import java.util.Optional;

public interface RecordService {

    List<Record> listAllRecords();

    Optional<Record> getRecordById(Integer id);

    Record saveOrUpdateRecord(Record records);

    void deleteRecord(Integer id);
}
