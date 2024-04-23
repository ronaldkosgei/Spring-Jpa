package com.SpringBootJpa.service;



import com.SpringBootJpa.entity.CourseMaterial;
import com.SpringBootJpa.repository.CourseMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseMaterialServiceImpl implements CourseMaterialService{


    @Autowired
    private final CourseMaterialRepository courseMaterialRepository;

    public CourseMaterialServiceImpl(CourseMaterialRepository courseMaterialRepository){
        this.courseMaterialRepository = courseMaterialRepository;
    }

    @Override
    public CourseMaterial findCourseMaterialByCourseMaterialId(Long courseMaterialId){
        return courseMaterialRepository.findCourseMaterialByCourseMaterialId(courseMaterialId);
    }

    @Override
    public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }

    @Override
    public CourseMaterial updateCourseMaterial(CourseMaterial courseMaterial) {
        return courseMaterialRepository.save(courseMaterial);
    }

    @Override
    public void deleteCourseMaterial(Long courseMaterialId) {
        courseMaterialRepository.deleteById(courseMaterialId);
    }

    @Override
    public void deleteCourseMaterialsByCourseMaterialId(Long courseMaterialId) {
        courseMaterialRepository.deleteCourseMaterialByCourseMaterialId(courseMaterialId);
    }
}
