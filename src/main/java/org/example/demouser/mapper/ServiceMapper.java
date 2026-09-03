package org.example.demouser.mapper;

import org.example.demouser.controller.dto.ServiceCreateDTO;
import org.example.demouser.controller.dto.ServiceResponceDTO;
import org.example.demouser.entity.MedicalService;
import org.springframework.stereotype.Component;

@Component
public class ServiceMapper {
    public MedicalService toEntity(ServiceCreateDTO dto) {
        MedicalService medicalService = new MedicalService();
        medicalService.setServiceName(dto.getServiceName());
        medicalService.setDescription(dto.getDescription());
        medicalService.setPrice(dto.getPrice());
        medicalService.setDurationMinutes(dto.getDurationMinutes());
        return medicalService;
    }

    public ServiceResponceDTO toDTO(MedicalService medicalService) {
        ServiceResponceDTO dto = new ServiceResponceDTO();
        dto.setId(medicalService.getServiceId());
        dto.setServiceName(medicalService.getServiceName());
        dto.setDescription(medicalService.getDescription());
        dto.setPrice(String.valueOf(medicalService.getPrice()));
        dto.setDurationMinutes(String.valueOf(medicalService.getDurationMinutes()));
        return dto;
    }

}
