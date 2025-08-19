package com.abernathyclinic.medilabo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private String lastName;
    private String firstName;
    private String birthdate;
    private Character gender;
    private String address;
    private Integer phone;
}
