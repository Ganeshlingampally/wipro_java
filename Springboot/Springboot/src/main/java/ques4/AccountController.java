package ques4;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
public class AccountController {

    @GetMapping("/users/{id}/accounts")
    public List<Account> getAccounts(
            @PathVariable String id,
            @RequestParam String type,
            @RequestParam String status) {

        // Demo response
        List<Account> result = new ArrayList<>();
        result.add(new Account(id, type, status));
        return result;
    }
}
