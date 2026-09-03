package org.example.demouser.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "doctor_services")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorService {

    @EmbeddedId
    private DoctorServiceId id;
    @MapsId("doctorId")
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @MapsId("serviceId")
    @ManyToOne
    @JoinColumn(name = "service_id")
    private MedicalService medicalService;
}

