package com.SpringBootJpa.controller;


import com.SpringBootJpa.entity.Course;
import com.SpringBootJpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/save")
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @GetMapping("/find/{courseId}")
    public Course findByCourseId(@PathVariable String courseId){
        return courseService.findByCourseId(courseId);
    }

    @GetMapping("/find/{courseTittle}")
    public Course findByCourseTittle(@PathVariable String courseTittle){
        return courseService.findByCourseTittle(courseTittle);
    }

    @DeleteMapping("/delete/{courseId}")
    public void deleteCourse(@PathVariable String courseId){
        courseService.deleteCourse(courseId);
    }

    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllCourses(){
        courseService.deleteAllCourses();
    }

}
