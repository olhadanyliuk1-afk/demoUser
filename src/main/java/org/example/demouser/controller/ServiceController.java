package org.example.demouser.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.demouser.controller.dto.ServiceCreateDTO;
import org.example.demouser.controller.dto.ServiceResponceDTO;
import org.example.demouser.service.ServiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service")
@RequiredArgsConstructor
public class ServiceController {
    private final ServiceService serviceService;

    @PostMapping
    public ServiceResponceDTO createService(
            @Valid
            @RequestBody ServiceCreateDTO dto) {
        return serviceService.createService(dto);
    }

    @GetMapping
    public List<ServiceResponceDTO> getAllServices() {
        return serviceService.getAllServices();
    }
}
