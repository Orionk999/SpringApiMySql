package com.icodeap.eventos.infrastructure.adapter;

import com.icodeap.eventos.application.repository.EventRepository;
import com.icodeap.eventos.domain.Event;
import com.icodeap.eventos.infrastructure.mapper.EventMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EventRepositoryImpl implements EventRepository {
    private final EventCrudRepository eventCrudRepository;
    private final EventMapper eventMapper;

    public EventRepositoryImpl(EventCrudRepository eventCrudRepository, EventMapper eventMapper) {
        this.eventCrudRepository = eventCrudRepository;
        this.eventMapper = eventMapper;
    }

    @Override
    public Iterable<Event> getEvents() {
        return eventMapper.toEvents(eventCrudRepository.findAll());
    }

    @Override
    public Event getEventById(Integer id) {
        return eventMapper.toEvent(eventCrudRepository.findById(id).get());
    }

    @Override
    public Event saveEvent(Event event) {
        return eventMapper.toEvent( eventCrudRepository.save(eventMapper.toEventEntity(event) ) );
    }

    @Override
    public void deleteEventById(Integer id) {
        eventCrudRepository.deleteById(id);
    }
}
