package org.example.demouser.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceCreateDTO {
    @NotBlank(message = "Service Name shouldn't be empty.")
    private String serviceName;
    private String description;
    @NotNull(message = "Price shouldn't be empty.")
    @Positive(message = "Price must be greater than 0.")
    private BigDecimal price;
    @NotNull(message = "Duration shouldn't be empty.")
    @Positive(message = "Duration must be greater than 0.")
    private Integer durationMinutes;
}
