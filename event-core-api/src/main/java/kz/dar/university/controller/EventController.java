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

    @GetMapping
    public EventResponce getEventById(@RequestParam String eventId){
        return eventService.getEventById(eventId);
    }

    @PostMapping
    public EventResponce createEvent(@RequestBody EventRequest eventRequest){
        return eventService.createEvent(eventRequest);
    }

    @PutMapping
    public EventResponce updateEvent(@RequestParam String eventId, @RequestBody EventRequest eventRequest){
       eventRequest.setEventId(eventId);
        return eventService.updateEvent(eventRequest);
    }

    @DeleteMapping
    public void deleteEventById(@RequestParam String eventId){
        eventService.deleteEventById(eventId);
    }



}