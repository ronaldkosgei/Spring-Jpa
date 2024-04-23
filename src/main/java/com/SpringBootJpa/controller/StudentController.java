package com.SpringBootJpa.controller;


import com.SpringBootJpa.entity.Student;
import com.SpringBootJpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/student")
    Optional<Student> findStudentByStudentId(Long studentId){
        return studentService.findStudentByStudentId(studentId);
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @DeleteMapping("/delete/{studentId}")
    void deleteStudentByStudentId(@PathVariable Long studentId){
        studentService.deleteStudentByStudentId(studentId);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/deleteAll")
    void deleteAllStudents(){
        studentService.deleteAllStudents();
    }
}
