package kz.dar.university.service;

import kz.dar.university.model.EventRequest;
import kz.dar.university.model.EventResponce;
import kz.dar.university.repository.EventEntity;
import kz.dar.university.repository.EventRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    private static ModelMapper modelMapper = new ModelMapper();

    static {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }


    @Override
    public EventResponce createEvent(EventRequest eventRequest) {
        eventRequest.setEventId(UUID.randomUUID().toString());
        EventEntity entity = modelMapper.map(eventRequest, EventEntity.class);
        EventEntity result = eventRepository.save(entity);
        return modelMapper.map(result, EventResponce.class);
    }

    @Override
    public EventResponce updateEvent(EventRequest eventRequest) {
        EventEntity eventEntity = modelMapper.map(eventRequest, EventEntity.class);

        EventEntity dbEntity = eventRepository.getEventEntityByEventId(eventRequest.getEventId());

        eventEntity.setId(dbEntity.getId());
        eventRepository.save(eventEntity);
        return modelMapper.map(eventEntity, EventResponce.class);
    }

    @Override
    public EventResponce getEventById(String eventId) {
        EventEntity eventEntity = eventRepository.getEventEntityByEventId(eventId);
        return modelMapper.map(eventEntity, EventResponce.class);
    }

    @Override
    public List<EventResponce> getAllEvents() {
        return eventRepository.getEventEntitiesBy().stream().map(post -> modelMapper.map(post, EventResponce.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteEventById(String eventId) {
        eventRepository.deleteEventEntityByEventId(eventId);
    }
}
