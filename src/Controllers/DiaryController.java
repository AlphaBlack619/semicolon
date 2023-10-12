package Controllers;

import dtos.CreateEntryRequest;
import dtos.FindEntryRequest;
import dtos.LogInRequest;
import dtos.RegisterUserRequest;
import org.springframework.web.bind.annotation.*;
import Services.DiaryService;
import Services.DiaryServicesImpl;


@RestController
@RequestMapping("/layers")
public class DiaryController {

    private final DiaryService diaryServices = new DiaryServicesImpl();

    @PostMapping("/registration")
    public String register(@RequestBody RegisterUserRequest registerUserRequest) {
        try {
            diaryServices.register(registerUserRequest);
            return "Successful";
        }
        catch (Exception error){
            return error.getMessage();

        }
    }

    @PostMapping("/lock")
    public String lock(@RequestBody String username) {
        diaryServices.lock(username);
        return "Locked";
    }

    @PostMapping("/createNewEntry")
    public String createEntry(@RequestBody CreateEntryRequest createEntryRequest) {
        try {
            diaryServices.addEntry(createEntryRequest);
            return "Entry Created Successfully";
        }
        catch (Exception error){
            return error.getMessage();
        }
    }

    @PostMapping("/unlock")
    public String unlock(@RequestBody LogInRequest logInRequest) {
        try {
            diaryServices.unlock(logInRequest);
            return "Diary Unlocked";
        }
        catch (Exception error){
            return error.getMessage();
        }
    }

    @GetMapping("/findEntry")
    public Object findEntry(FindEntryRequest findEntryRequest) {
        try {
            return diaryServices.findEntry(findEntryRequest);
        }
        catch (Exception error){
            return error.getMessage();
        }
    }
}