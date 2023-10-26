package gooo.layers.dtos;

import lombok.Data;
@Data
public class FindEntryResponse {
    private int id;
    private String title;
    private String body;
    private String dateCreated;
    private String timeCreated;
}
