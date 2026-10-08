package com.example.student.repository;

import com.example.student.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudRepo {

    private final Map<Long, Student> students = new HashMap<>();
    private Long nextId = 1L;

    public Map<Long, Student> findAll() {
        return students;
    }

    public Student save(Student student) {
        student.setId(nextId++);
        students.put(student.getId(), student);

        return student;
    }

}
