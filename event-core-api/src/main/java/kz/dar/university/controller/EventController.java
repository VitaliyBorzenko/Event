package kz.dar.university.controller;

import kz.dar.university.model.EventRequest;
import kz.dar.university.model.EventResponce;
import kz.dar.university.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;


    @GetMapping("/check")
    public ResponseEntity<String> checkEvent() {
        return new ResponseEntity<>("event-core-api is working", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<EventResponce> getAllEvents(){
        return eventService.getAllEvents();
    }

    @GetMapping("/{eventId}")
    public EventResponce getEventById(@PathVariable String eventId){
        return eventService.getEventById(eventId);
    }

    @PostMapping
    public EventResponce createEvent(@RequestBody EventRequest eventRequest){
        return eventService.createEvent(eventRequest);
    }

    @PutMapping("/{eventId}")
    public EventResponce updateEvent(@PathVariable String eventId, @RequestBody EventRequest eventRequest){
       eventRequest.setEventId(eventId);
        return eventService.updateEvent(eventRequest);
    }

    @DeleteMapping("/{eventId}")
    public void deleteEventById(@PathVariable String eventId){
        eventService.deleteEventById(eventId);
    }



}