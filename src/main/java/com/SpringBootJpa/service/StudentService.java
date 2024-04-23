package com.SpringBootJpa.service;

import com.SpringBootJpa.entity.Guardian;
import com.SpringBootJpa.entity.Student;

import java.util.Optional;

public interface StudentService {


    Optional<Student> findStudentByStudentId(Long studentId);

    public Student saveStudent(Student student);

    void deleteStudentByStudentId(Long studentId);

    void deleteAllStudents();

    Student updateStudent(Student student);




}
