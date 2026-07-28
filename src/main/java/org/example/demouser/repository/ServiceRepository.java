package org.example.demouser.repository;

import org.example.demouser.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Long>{
}
