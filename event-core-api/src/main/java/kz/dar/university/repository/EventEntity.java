package kz.dar.university.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.util.annotation.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "Event_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true, name = "event_id")
    private String eventId;
    @Column(nullable = false, length = 50)
    private String title;
    @Column(nullable = false, length = 50)
    private String description;
    @Column(nullable = false, length = 50)
    private String startDateAndTime;
    @Column(nullable = false, length = 50)
    private String endDateAndTime;
    @Column(nullable = false, length = 50)
    private Long photoId;
    @Column(nullable = false, length = 50)
    private String category;
    @Column(nullable = false, length = 50)
    private String numberOfVotes;
    @Column(nullable = false, length = 50)
    private String UserOwner;

}
