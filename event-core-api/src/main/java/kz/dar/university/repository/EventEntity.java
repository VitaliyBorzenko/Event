package kz.dar.university.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @Column
    private String eventId;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String startDateAndTime;
    @Column
    private String endDateAndTime;
    @Column
    private Long photoId;
    @Column
    private String category;
    @Column
    private String numberOfVotes;
    @Column
    private String UserOwner;

}
