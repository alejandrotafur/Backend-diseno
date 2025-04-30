package com.electrocorhuila.infrastructure;

import com.electrocorhuila.application.UserService;
import com.electrocorhuila.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/calculate-tariff")
    public String calculateTariff(@RequestBody User user) {
        return userService.calculateTariff(user);
    }
}
