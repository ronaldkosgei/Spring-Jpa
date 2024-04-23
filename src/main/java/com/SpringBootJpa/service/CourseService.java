package com.SpringBootJpa.service;

import com.SpringBootJpa.entity.Course;

public interface CourseService {

    Course saveCourse(Course course);

    Course findByCourseId(String courseId);

    Course findByCourseTittle(String courseTittle);

    void deleteCourse(String courseId);

    void deleteAllCourses();

    Course updateCourse(Course course);

}
