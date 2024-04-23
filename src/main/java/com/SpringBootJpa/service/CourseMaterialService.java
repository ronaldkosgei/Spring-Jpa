package com.SpringBootJpa.service;

import com.SpringBootJpa.entity.CourseMaterial;

public interface CourseMaterialService {

    public CourseMaterial findCourseMaterialByCourseMaterialId(Long courseMaterialId);

    CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial);

    CourseMaterial updateCourseMaterial(CourseMaterial courseMaterial);

    void deleteCourseMaterial(Long courseMaterialId);

    void deleteCourseMaterialsByCourseMaterialId(Long courseMaterialId);
}
