package org.example.demouser.mapper;

import org.example.demouser.controller.dto.ServiceCreateDTO;
import org.example.demouser.controller.dto.ServiceResponceDTO;
import org.example.demouser.entity.Service;
import org.springframework.stereotype.Component;

@Component
public class ServiceMapper {
    public Service toEntity(ServiceCreateDTO dto) {
        Service service = new Service();
        service.setServiceName(dto.getServiceName());
        service.setDescription(dto.getDescription());
        service.setPrice(dto.getPrice());
        service.setDurationMinutes(dto.getDurationMinutes());
        return service;
    }

    public ServiceResponceDTO toDTO(Service service) {
        ServiceResponceDTO dto = new ServiceResponceDTO();
        dto.setId(service.getServiceId());
        dto.setServiceName(service.getServiceName());
        dto.setDescription(service.getDescription());
        dto.setPrice(String.valueOf(service.getPrice()));
        dto.setDurationMinutes(String.valueOf(service.getDurationMinutes()));
        return dto;
    }

}
