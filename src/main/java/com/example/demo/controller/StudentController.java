package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    private final StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        studentRepository.save(student);
        log.info("Student added successfully {}", student.toString());

    }
}
