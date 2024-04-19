package com.icodeap.eventos.application.service;


import com.icodeap.eventos.application.repository.EventRepository;
import com.icodeap.eventos.domain.Event;

import javax.swing.text.html.Option;
import java.util.Optional;

public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Iterable<Event> getEvents(){
        return  eventRepository.getEvents();
    }

    public Object getEventById(String id){
        try {
            return eventRepository.getEventById(id);

            }catch (Exception e ){
                System.out.println( e.toString());
            }
        return "Elemento no encontrado";
    }

    public Event saveEvent(Event event){
        return   eventRepository.saveEvent(event);
    }

    public void deleteEvenById(String id){
        eventRepository.deleteEventById(id);
    }

}
