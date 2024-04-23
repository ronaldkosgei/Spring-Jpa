package com.SpringBootJpa.service;


import com.SpringBootJpa.entity.Course;
import com.SpringBootJpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course findByCourseId(String courseId) {
        return courseRepository.findByCourseId(courseId);
    }

    @Override
    public Course findByCourseTittle(String courseTittle) {
        return courseRepository.findByTittle(courseTittle);
    }

    @Override
    public void deleteCourse(String courseId) {
        courseRepository.deleteByCourseId(courseId);
    }

    @Override
    public void deleteAllCourses() {
        courseRepository.deleteAll();
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }
}
