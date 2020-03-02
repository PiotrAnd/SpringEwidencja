package com.ewidencja.controllers;

import com.ewidencja.model.Record;
import com.ewidencja.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@Controller
public class RecordController {
    @Autowired
    private RecordService recordService;



    @RequestMapping("/records")
    public String getRecords(Model model) {
        model.addAttribute("records", recordService.listAllRecords());
        return "records";
    }

    @RequestMapping("/records/{id}")
    public String showRecords(@PathVariable Integer id, Model model) {
        Optional<Record> recordsOpt = recordService.getRecordById(id);
        recordsOpt.ifPresent(record -> model.addAttribute("record", record));
        return "record";
    }

    @RequestMapping("/record/delete/{id}")
    public String deleteProject(@PathVariable Integer id) {
        recordService.deleteRecord(id);
        return "redirect:/records";
    }

    @RequestMapping("/record/edit/{id}")
    public String editRecord(@PathVariable Integer id, Model model) {
        model.addAttribute("record", recordService.getRecordById(id));
        return "recordForm";
    }

    @RequestMapping("/record/new")
    public String newRecord(Model model) {
        model.addAttribute("record", new Record());
        return "recordForm";
    }


    @PostMapping("/record")
    public String saveOrUpdateRecord(Record record) {
        recordService.saveOrUpdateRecord(record);
        return "redirect:/records/";
    }


}
