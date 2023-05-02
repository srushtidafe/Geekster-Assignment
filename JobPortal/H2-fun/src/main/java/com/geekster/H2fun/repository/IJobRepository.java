package com.geekster.H2fun.repository;

import com.geekster.H2fun.models.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface IJobRepository extends CrudRepository<Job, Integer> {

    public List<Job> findBySalaryGreaterThan(Double salary);

    public List<Job> findByTitle(String title);

    public List<Job> findByEmployerNameAndSalaryGreaterThan(String employerName, Double salary);

    @Query(value = "select * from job order by salary" , nativeQuery = true)
    public List<Job> findByJobOrderBySalary(Double salary);
}