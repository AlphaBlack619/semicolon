package dtos;

import lombok.Data;

@Data
public class FindEntryRequest {
    private int id;
    private String body;
    private String title;
}
