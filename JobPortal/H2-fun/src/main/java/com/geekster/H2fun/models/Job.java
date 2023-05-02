package com.geekster.H2fun.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;
    private String companyName;
    private String employerName;
}
