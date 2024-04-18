package com.icodeap.ecommerce.application.repository;

import com.icodeap.ecommerce.domain.Event;
import com.icodeap.ecommerce.domain.User;

public interface EventRepository {
    Iterable<Event> getEvents();
    Iterable<Event> getEventsByUser(User user);
    Event getEventById(Integer id);
    Event saveEvent(Event event);
    void deleteEventById(Integer id);
}
