package com.abernathyclinic.medilabo.controller;

import com.abernathyclinic.medilabo.model.Patient;
import com.abernathyclinic.medilabo.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@Controller
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;
    private List<Patient> patientList = new ArrayList<Patient>();

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patient")
    public ModelAndView viewPatient(@PathVariable String firstName, String lastName){

        Map<String, Object> model= new HashMap<String, Object>();
        patientList.clear();
        patientList.add(new Patient("Smith","Sarah"," 1966-12-31",'F'," 1 Brookside St",555-222-7777));
        model.put("Patients", patientList);

        return new ModelAndView(String.valueOf(model));
    }
    
}
