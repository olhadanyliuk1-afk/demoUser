package org.example.demouser.controller.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceResponceDTO {
    private Long Id;
    private String serviceName;
    private String description;
    private String price;
    private String durationMinutes;
}
