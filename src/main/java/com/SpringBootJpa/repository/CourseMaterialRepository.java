package com.SpringBootJpa.repository;

import com.SpringBootJpa.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository  extends JpaRepository<CourseMaterial, Long> {
    public CourseMaterial findCourseMaterialByCourseMaterialId(Long courseMaterialId);

    void deleteCourseMaterialByCourseMaterialId(Long courseMaterialId);
}
