package com.example.demo.repo;

import com.example.demo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
}
