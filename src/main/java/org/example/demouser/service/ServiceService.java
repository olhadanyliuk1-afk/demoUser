package org.example.demouser.service;

import org.example.demouser.controller.dto.ServiceCreateDTO;
import org.example.demouser.controller.dto.ServiceResponceDTO;
import org.example.demouser.entity.MedicalService;
import org.example.demouser.mapper.ServiceMapper;
import org.example.demouser.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    private final ServiceMapper serviceMapper;
    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceMapper serviceMapper, ServiceRepository serviceRepository) {
        this.serviceMapper = serviceMapper;
        this.serviceRepository = serviceRepository;
    }

    public ServiceResponceDTO createService(ServiceCreateDTO dto) {
        MedicalService medicalService = serviceMapper.toEntity(dto);
        MedicalService savedMedicalService = serviceRepository.save(medicalService);
        return serviceMapper.toDTO(savedMedicalService);
    }

    public List<ServiceResponceDTO> getAllServices() {
        return serviceRepository.findAll().stream().map(serviceMapper::toDTO).toList();
    }
}
