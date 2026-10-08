package com.example.student.controller;

import com.example.student.dto.StudReq;
import com.example.student.dto.StudRes;
import com.example.student.entity.Student;
import com.example.student.service.StudService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudController {

    private final StudService studService;

    public StudController(StudService studService) {
        this.studService = studService;
    }

    @GetMapping
    public Map<Long, Student> getStudent() {
        return studService.getStudent();
    }

    @PostMapping
    public StudRes createStudent(@RequestBody StudReq studReq) {
        return studService.saveStud(studReq);
    }
}
