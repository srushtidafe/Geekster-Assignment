package com.geekster.H2fun.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Event_Id")
    private Integer eventId;

    @Column(name = "Event_Name",unique = true)
    private String eventName;

    @Column(name = "Event_Location")
    private  String locationOfEvent;

    @Column(name = "Date")
    private LocalDate date;

    @Column(name = "Start_Time")
    private LocalTime startTime;

    @Column(name = "End_Time")
    private LocalTime endTime;
}
