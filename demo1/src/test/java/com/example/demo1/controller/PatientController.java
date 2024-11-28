package com.example.demo1.controller;

import com.example.demo1.model.Patient;
import com.example.demo1.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    // Add a new patient
    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient) {
        patientRepository.save(patient);
        return "Patient added successfully!";
    }

    // Retrieve all patients
    @GetMapping("/all")
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Retrieve patient by ID
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with ID: " + id));
    }
}
