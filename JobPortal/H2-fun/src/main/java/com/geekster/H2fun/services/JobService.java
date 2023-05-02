package com.geekster.H2fun.services;

import com.geekster.H2fun.models.Job;
import com.geekster.H2fun.repository.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    IJobRepository jobRepository;

    public Iterable<Job> getJob() {
        return jobRepository.findAll();
    }

    public String addJob(List<Job> jobList) {
        Iterable<Job> addJob = jobRepository.saveAll(jobList);
        if(addJob != null){
            return "Added";
        }else{
            return "Not Added";
        }
    }


    public List<Job> findByTitle(String title) {
        return jobRepository.findByTitle(title);
    }

    public List<Job> findBySalaryGreaterThan(Double salary) {
        return jobRepository.findBySalaryGreaterThan(salary);
    }

    public List<Job> getEmployeeBySalary(String employerName, Double salary) {
          return jobRepository.findByEmployerNameAndSalaryGreaterThan(employerName , salary);
    }
}
