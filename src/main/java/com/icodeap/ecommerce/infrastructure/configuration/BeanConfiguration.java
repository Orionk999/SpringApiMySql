package com.icodeap.ecommerce.infrastructure.configuration;

import com.icodeap.ecommerce.application.repository.EventRepository;
import com.icodeap.ecommerce.application.service.EventService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public EventService eventService(EventRepository eventtRepository){
        return new EventService(eventtRepository);
    }
}
