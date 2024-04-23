package com.SpringBootJpa.service;

import com.SpringBootJpa.entity.Guardian;

public interface GuardianService {

    public Guardian findGuardianByGuardianId(Long guardianId);

    void deleteGuardianByGuardianId(Long guardianId);

    public Guardian saveGuardian(Guardian guardian);

    public Guardian updateGuardian(Guardian guardian);
}
