package com.example.school_management.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "teachers")
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class Teacher extends Employee {

    @Size(max = 50)
    @Column(name = "subject", length = 50)
    private String subject;

    @Size(max = 20)
    @Column(name = "assigned_class", length = 20)
    private String assignedClass;

    @Size(max = 100)
    @Column(name = "previous_school", length = 100)
    private String previousSchool;
}