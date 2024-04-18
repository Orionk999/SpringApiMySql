package com.icodeap.ecommerce.application.service;


import com.icodeap.ecommerce.application.repository.EventRepository;
import com.icodeap.ecommerce.domain.Event;
import com.icodeap.ecommerce.domain.User;

public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Iterable<Event> getEvents(){
        return  eventRepository.getEvents();
    }

    public Iterable<Event> getEventsByUser(User user){
        return eventRepository.getEventsByUser(user);
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
