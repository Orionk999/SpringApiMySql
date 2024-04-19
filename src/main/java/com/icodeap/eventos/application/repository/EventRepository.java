package com.icodeap.eventos.application.repository;

import com.icodeap.eventos.domain.Event;
//import com.icodeap.eventos.domain.User;

public interface EventRepository {
    Iterable<Event> getEvents();
    Event getEventById(String id);
    Event saveEvent(Event event);
    void deleteEventById(String id);
}
