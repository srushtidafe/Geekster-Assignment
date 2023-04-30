package com.geekster.H2fun.repository;

import com.geekster.H2fun.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer> {


}
