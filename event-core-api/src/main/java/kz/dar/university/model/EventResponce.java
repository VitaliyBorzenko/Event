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
    private String StartDateAndTime;
    private String EndDateAndTime;
    private Long photoId;
    private String category;
    private String NumberOfVotes;
    private String UserOwner;

}
