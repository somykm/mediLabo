package com.abernathyclinic.medilabo.controller;

import com.abernathyclinic.medilabo.model.Patient;
import com.abernathyclinic.medilabo.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
@Controller
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patient")
    public ModelAndView viewPatient(@PathVariable String firstName, String lastName){

        Patient patient =patientService.getPatientByFirstNameAndLastName(firstName, lastName);
        ModelAndView viewPatientInfo = new ModelAndView("PatientDetails");
        viewPatientInfo.addObject("patient", patient);
        return viewPatientInfo;
    }
}
