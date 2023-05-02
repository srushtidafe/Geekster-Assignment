package com.geekster.H2fun.controller;

import com.geekster.H2fun.models.Job;
import com.geekster.H2fun.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;
    @GetMapping(value = "/getJob")
    public Iterable<Job> getJob(){
        return jobService.getJob();
    }
    @GetMapping(value = "/job/{title}")
    public List<Job> findByTitle(String title){
        return jobService.findByTitle(title);
    }
    @GetMapping(value = "/job/salary/{salary}")
    public List<Job> findBySalaryGreaterThan(Double salary){
        return jobService.findBySalaryGreaterThan(salary);
    }
    @GetMapping(value = "/job/employerName/{employerName}salary/{salary}")
    public List<Job> getEmployeeBySalary( String employerName ,Double salary){
        return jobService.getEmployeeBySalary(employerName ,salary);
    }
    @PostMapping(value ="/addJob")
    public String addJob(@RequestBody List<Job> jobList){
        return jobService.addJob(jobList);
    }

}
