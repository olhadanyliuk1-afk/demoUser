package org.example.demouser.repository;

import org.example.demouser.entity.MedicalService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<MedicalService,Long>{
}
