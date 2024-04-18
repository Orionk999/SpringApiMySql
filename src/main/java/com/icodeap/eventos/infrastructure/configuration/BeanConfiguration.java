package com.icodeap.eventos.infrastructure.configuration;

import com.icodeap.eventos.application.repository.EventRepository;
import com.icodeap.eventos.application.service.EventService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public EventService eventService(EventRepository eventRepository){
        return new EventService(eventRepository);
    }
}
