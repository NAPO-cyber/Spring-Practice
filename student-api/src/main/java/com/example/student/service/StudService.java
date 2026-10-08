package com.example.student.service;

import com.example.student.dto.StudReq;
import com.example.student.dto.StudRes;
import com.example.student.entity.Student;
import com.example.student.repository.StudRepo;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudService {

    private final StudRepo studRepo;

    public StudService(StudRepo studRepo) {
        this.studRepo = studRepo;
    }

    public Map<Long, Student> getStudent() {
        return studRepo.findAll();
    }

    public StudRes saveStud(StudReq studReq) {
        Student student = new Student(
                null,
                studReq.name(),
                studReq.email(),
                studReq.age()
        );

        Student saveStud = studRepo.save(student);

        return new StudRes(
                saveStud.getId(),
                saveStud.getName(),
                saveStud.getEmail(),
                saveStud.getAge()
        );
    }
}
