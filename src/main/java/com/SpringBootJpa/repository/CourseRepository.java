package com.SpringBootJpa.repository;


import com.SpringBootJpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    Course findByCourseId(String courseId);

    Course findByTittle(String courseTittle);

    void deleteByCourseId(String courseId);
}
