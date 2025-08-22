package com.abernathyclinic.medilabo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="patient_info")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private String firstName;
    private String birthdate;
    private Character gender;
    private String address;
    private Integer phone;

    public Patient(String smith, String sarah, String s, char f, String s1, int i) {
    }
}
