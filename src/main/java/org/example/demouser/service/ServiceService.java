package org.example.demouser.service;

import org.example.demouser.controller.dto.ServiceCreateDTO;
import org.example.demouser.controller.dto.ServiceResponceDTO;
import org.example.demouser.entity.Service;
import org.example.demouser.mapper.ServiceMapper;
import org.example.demouser.repository.ServiceRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {
private final ServiceMapper serviceMapper;
private final ServiceRepository serviceRepository;

    public ServiceService(ServiceMapper serviceMapper, ServiceRepository serviceRepository) {
        this.serviceMapper = serviceMapper;
        this.serviceRepository = serviceRepository;
    }

    public ServiceResponceDTO createService(ServiceCreateDTO dto) {
        Service service = serviceMapper.toEntity(dto);
        Service savedService = serviceRepository.save(service);
        return serviceMapper.toDTO(savedService);    }
    public List<ServiceResponceDTO> getAllServices() {
        return serviceRepository.findAll().stream().map(serviceMapper::toDTO).toList();
    }
}
