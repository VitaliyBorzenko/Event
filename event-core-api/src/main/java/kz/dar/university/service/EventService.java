package kz.dar.university.service;

import kz.dar.university.model.EventRequest;
import kz.dar.university.model.EventResponce;
import kz.dar.university.repository.EventEntity;

import java.util.List;

public interface EventService {

   EventResponce createEvent(EventRequest eventRequest);

   EventResponce updateEvent(EventRequest eventRequest);

   EventResponce getEventById(String eventId);

   List<EventResponce> getAllEvents();

   void deleteEventById(String eventId);

   List<EventEntity> filter(String category);
}
