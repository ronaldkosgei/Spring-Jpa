package com.SpringBootJpa.controller;


import com.SpringBootJpa.entity.Guardian;
import com.SpringBootJpa.service.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("guardian")
public class GuardianController {

    @Autowired
    private final GuardianService guardianService;

    public GuardianController(GuardianService guardianService) {
        this.guardianService = guardianService;
    }

    @PostMapping("/save")
    public Guardian saveGuardian(@RequestBody Guardian guardian){
        return guardianService.saveGuardian(guardian);
    }

    @GetMapping("/find/{guardianId}")
    public Guardian findGuardianByGuardianId(@PathVariable Long guardianId){
        return guardianService.findGuardianByGuardianId(guardianId);
    }

    @PutMapping("/update")
    public Guardian updateGuardian(@RequestBody Guardian guardian){
        return guardianService.updateGuardian(guardian);
    }

    @DeleteMapping("/delete/{guardianId}")
    public void deleteGuardianByGuardianId(@PathVariable Long guardianId){
        guardianService.deleteGuardianByGuardianId(guardianId);
    }
}
