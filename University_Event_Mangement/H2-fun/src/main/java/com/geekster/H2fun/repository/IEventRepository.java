package com.geekster.H2fun.repository;

import com.geekster.H2fun.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEventRepository extends CrudRepository<Event,Integer> {
}
