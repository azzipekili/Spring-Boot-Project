package com.example.temp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.temp1.Student;
import com.example.temp1.StudentRepository;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public void save(Student student) {
        repository.save(student);
    }
}
