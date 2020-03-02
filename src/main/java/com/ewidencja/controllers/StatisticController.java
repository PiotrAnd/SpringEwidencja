package com.ewidencja.controllers;

import com.ewidencja.model.Record;
import com.ewidencja.repo.StatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/statistics")
public class StatisticController {

    private StatisticRepository statisticRepository;

    @Autowired
    public StatisticController(StatisticRepository statisticRepository) {
        this.statisticRepository = statisticRepository;
    }

    @RequestMapping(value = "/all")
    public List<Record> getAll() {
        return statisticRepository.findAll();
    }

}
