package com.icodeap.eventos.application.repository;

import com.icodeap.eventos.domain.Event;
import com.icodeap.eventos.domain.User;

public interface EventRepository {
    Iterable<Event> getEvents();
    Iterable<Event> getEventsByUser(User user);
    Event getEventById(Integer id);
    Event saveEvent(Event event);
    void deleteEventById(Integer id);
}
