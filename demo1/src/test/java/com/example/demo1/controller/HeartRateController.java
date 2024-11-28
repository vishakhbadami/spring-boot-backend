package com.example.demo1.controller;

import com.example.demo1.model.HeartRate;
import com.example.demo1.model.Patient;
import com.example.demo1.repository.HeartRateRepository;
import com.example.demo1.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heartrate")
public class HeartRateController {

    @Autowired
    private HeartRateRepository heartRateRepository;

    @Autowired
    private PatientRepository patientRepository;

    // Record a new heart rate for a patient
    @PostMapping("/record")
    public String recordHeartRate(@RequestParam Long patientId, @RequestParam int bpm) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found with ID: " + patientId));

        HeartRate heartRate = new HeartRate();
        heartRate.setPatient(patient);
        heartRate.setBpm(bpm);

        heartRateRepository.save(heartRate);
        return "Heart rate recorded successfully!";
    }

    // Retrieve all heart rate records for a patient
    @GetMapping("/patient/{patientId}")
    public List<HeartRate> getHeartRateForPatient(@PathVariable Long patientId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found with ID: " + patientId));

        return heartRateRepository.findAll()
                .stream()
                .filter(hr -> hr.getPatient().getId().equals(patientId))
                .toList();
    }
}
