package com.icodeap.eventos.application.service;


import com.icodeap.eventos.application.repository.EventRepository;
import com.icodeap.eventos.domain.Event;

public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Iterable<Event> getEvents(){
        return  eventRepository.getEvents();
    }

    public Event getEventById(Integer id){
        return  eventRepository.getEventById(id);
    }

    public Event saveEvent(Event event){
        return   eventRepository.saveEvent(event);
    }

    public void deleteEvenById(Integer id){
        eventRepository.deleteEventById(id);
    }



}
