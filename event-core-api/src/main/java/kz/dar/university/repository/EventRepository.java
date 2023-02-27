package kz.dar.university.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<EventEntity, Long> {


    EventEntity getEventEntityByEventId(String eventId);

    List<EventEntity> getEventEnyitiesBy();

    @Transactional
    void deleteEventEntityByEventId(String eventId);


}
