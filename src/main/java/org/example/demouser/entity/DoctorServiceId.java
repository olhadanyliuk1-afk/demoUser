package org.example.demouser.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorServiceId implements Serializable {

    @Column(name = "doctor_id")
    private Long doctorId;
    @Column(name = "service_id")
    private Long serviceId;
}
