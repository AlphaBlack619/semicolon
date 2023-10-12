package dtos;

import lombok.Data;

@Data
public class CreateEntryRequest {
    int iD;
    private String title;
    private String body;
}
