package com.ewidencja.services.impl;

import com.ewidencja.model.Record;
import com.ewidencja.repo.RecordRepository;
import com.ewidencja.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Override
    public List<Record> listAllRecords() {
        List<Record> result = new LinkedList<>();
        recordRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Optional<Record> getRecordById(Integer id) {
        return recordRepository.findById(id);
    }

    @Override
    public Record saveOrUpdateRecord(Record records) {
        if (records != null) {
            return recordRepository.save(records);
        } else {
            throw new RuntimeException("Can't be null!!!");
        }
    }

    @Override
    public void deleteRecord(Integer id) {
        recordRepository.deleteById(id);

    }

}
