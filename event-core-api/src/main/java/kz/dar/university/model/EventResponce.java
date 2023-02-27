package kz.dar.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventResponce {
    private Long id;
    private String eventId;
    private String title;
    private String description;
    private String startDateAndTime;
    private String endDateAndTime;
    private Long photoId;
    private String category;
    private String numberOfVotes;
    private String userOwner;

}
