package com.geekster.H2fun.services;

import com.geekster.H2fun.models.Event;
import com.geekster.H2fun.repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepository eventRepository;

    public Iterable<Event> getAllEvent() {
        Iterable<Event> allEvent = eventRepository.findAll();
        return allEvent;
    }

    public String addEvent(List<Event> eventList) {
        Iterable<Event> addEvent = eventRepository.saveAll(eventList);
        if(addEvent != null){
            return "Added";
        }else{
            return "Not Added";
        }
    }

    public void removeEventById(Integer eventId) {
        eventRepository.deleteById(eventId);
    }

    public void getEventById(Integer eventId) {
        eventRepository.findById(eventId);

    }
}
