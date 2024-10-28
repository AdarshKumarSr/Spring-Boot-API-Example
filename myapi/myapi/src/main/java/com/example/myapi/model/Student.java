package com.example.myapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID
    private Long Id;
    private String Name;
    private Integer RollNumber;

    // No-argument constructor required by JPA
    public Student() {
    }

    // All-argument constructor
    public Student(Long id, String name, Integer rollNumber) {
        super();
        Id = id;
        Name = name;
        RollNumber = rollNumber;
    }

    // Getters and Setters
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        RollNumber = rollNumber;
    }

    // Override toString method for better logging/debugging
    @Override
    public String toString() {
        return "Student [Id=" + Id + ", Name=" + Name + ", RollNumber=" + RollNumber + "]";
    }
}
