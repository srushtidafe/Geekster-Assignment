package com.geekster.H2fun.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_Id")
    private Integer studentId;

    @Column(name = "First_Name")
//    @Pattern(regexp ="^[A-Z].*")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Age")
//    @Digits(integer = 26 , fraction = 0)
    private String age;
}
