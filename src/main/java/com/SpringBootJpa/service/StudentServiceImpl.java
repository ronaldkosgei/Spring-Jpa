package com.SpringBootJpa.service;


import com.SpringBootJpa.entity.Guardian;
import com.SpringBootJpa.entity.Student;
import com.SpringBootJpa.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{


    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public Optional<Student> findStudentByStudentId(Long studentId) {
        return Optional.empty();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentByStudentId(Long studentId) {
        studentRepository.deleteStudentByStudentId(studentId);
    }

    @Override
    public void deleteAllStudents() {
        studentRepository.deleteAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
