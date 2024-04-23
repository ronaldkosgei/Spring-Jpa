package com.SpringBootJpa.service;

import com.SpringBootJpa.entity.Guardian;
import com.SpringBootJpa.repository.GuardianRepository;
import org.springframework.stereotype.Service;


@Service
public class GuardianServiceImpl implements GuardianService{

    private final GuardianRepository guardianRepository;

    public GuardianServiceImpl(GuardianRepository guardianRepository) {
        this.guardianRepository = guardianRepository;
    }


    @Override
    public Guardian findGuardianByGuardianId(Long guardianId) {
        return guardianRepository.findGuardianByGuardianId(guardianId);
    }

    @Override
    public void deleteGuardianByGuardianId(Long guardianId) {
        guardianRepository.deleteGuardianByGuardianId(guardianId);
    }

    @Override
    public Guardian saveGuardian(Guardian guardian) {
        return guardianRepository.save(guardian);
    }

    @Override
    public Guardian updateGuardian(Guardian guardian) {
        return guardianRepository.save(guardian);
    }
}
