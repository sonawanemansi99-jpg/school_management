package com.example.school_management.controller;

import com.example.school_management.entity.Teacher;
import com.example.school_management.repo.TeacherRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherRepo teacherRepository;

    @PostMapping
    public ResponseEntity<?> createTeacher(@Valid @RequestBody Teacher teacher) {
        if (teacherRepository.existsByEmail(teacher.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body("Email already exists");
        }

        try {
            Teacher savedTeacher = teacherRepository.save(teacher);
            savedTeacher.setPassword(null);
            return ResponseEntity.ok(savedTeacher);

        } catch (DataIntegrityViolationException e) {
            return ResponseEntity
                    .badRequest()
                    .body("Duplicate entry (Email or Mobile already exists)");
        }
    }
}