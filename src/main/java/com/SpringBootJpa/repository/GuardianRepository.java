package com.SpringBootJpa.repository;


import com.SpringBootJpa.entity.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuardianRepository extends JpaRepository<Guardian, Long> {
    public Guardian findGuardianByGuardianId(Long guardianId);

    void deleteGuardianByGuardianId(Long guardianId);
}
