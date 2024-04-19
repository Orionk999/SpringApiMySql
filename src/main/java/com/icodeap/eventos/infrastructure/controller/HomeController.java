package com.icodeap.eventos.infrastructure.controller;

import com.icodeap.eventos.application.service.EventService;
import com.icodeap.eventos.domain.Event;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class HomeController {
    private final EventService eventService;

    public HomeController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping("/home")
    public Iterable<Event> getHome() {
        return  this.eventService.getEvents();
    }

    @GetMapping("/home/{id}")
    public Object getHomeId(@PathVariable String id)
    {
        return this.eventService.getEventById(id);
    }

    @PostMapping("/home")
    public Event createHome(@RequestBody Event event) {
        return this.eventService.saveEvent(event);
    }

    @PutMapping("/home/{id}")
    public Object updateHome(@PathVariable String id,@RequestBody Event event) {
    return this.eventService.saveEvent(event);
    }


    @DeleteMapping("/home/{id}")
    public String deleteHome(@PathVariable String id) {
        try {
            this.eventService.deleteEvenById(id);
        }catch (Exception e){
            return "Elemento no encontrado";
        }
        return "Elemento eliminado";
    }
}
