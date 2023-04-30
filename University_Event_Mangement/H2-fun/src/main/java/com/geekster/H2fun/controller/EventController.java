package com.geekster.H2fun.controller;
import com.geekster.H2fun.services.EventService;
import com.geekster.H2fun.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController{
    @Autowired
    EventService eventService;

    @GetMapping(value = "/getEvent")
    public Iterable<Event> getEvents(){
        return eventService.getAllEvent();
    }
    @GetMapping(value = "/getEvent/{eventId}")
    public void getEventById( @PathVariable Integer eventId){ eventService.getEventById(eventId);
    }
    @PostMapping(value = "/addEvent")
    public String addEvent(@RequestBody List<Event> eventList){
        return eventService.addEvent(eventList);
    }
    @DeleteMapping(value ="/Event/{eventId}")
    public void removeById(Integer eventId){
        eventService.removeEventById(eventId);
    }

}
