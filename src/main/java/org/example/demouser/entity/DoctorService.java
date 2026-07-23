package org.example.demouser.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table(name = "doctor_services")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorService {

    @EmbeddedId
    private DoctorServiceId id;
}

