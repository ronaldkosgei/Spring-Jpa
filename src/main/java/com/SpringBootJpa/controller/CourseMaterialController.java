package com.SpringBootJpa.controller;


import com.SpringBootJpa.entity.CourseMaterial;
import com.SpringBootJpa.service.CourseMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course-material")
public class CourseMaterialController {

    @Autowired
    private final CourseMaterialService courseMaterialService;

    public CourseMaterialController(CourseMaterialService courseMaterialService){
        this.courseMaterialService = courseMaterialService;
    }

    @PostMapping("/save")
    public void saveCourseMaterial(@RequestBody CourseMaterial courseMaterial){
        courseMaterialService.saveCourseMaterial(courseMaterial);
    }

    @GetMapping("/get/{courseMaterialId}")
    public CourseMaterial findCourseMaterialByCourseMaterialId(@PathVariable Long courseMaterialId){
        return courseMaterialService.findCourseMaterialByCourseMaterialId(courseMaterialId);
    }
    @PostMapping("/update")
    public void updateCourseMaterial(@RequestBody CourseMaterial courseMaterial){
        courseMaterialService.updateCourseMaterial(courseMaterial);
    }
    @DeleteMapping("/delete/{courseMaterialId}")
    public void deleteCourseMaterial(@PathVariable Long courseMaterialId){
        courseMaterialService.deleteCourseMaterial(courseMaterialId);
    }
    @DeleteMapping("/delete-all/{courseMaterialId}")
    public void deleteCourseMaterialsByCourseMaterialId(@PathVariable Long courseMaterialId){
        courseMaterialService.deleteCourseMaterialsByCourseMaterialId(courseMaterialId);
    }
}
