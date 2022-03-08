package com.asheckhove.privacy.controller;

import com.asheckhove.privacy.model.User;
import com.asheckhove.privacy.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * User: Asheck
 * Date: 3/7/2022
 * Time: 3:27 PM
 */

@RestController
@RequestMapping("/")
@Tag(name = "Simple User management service")
public class PrivacyController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserDetails")
    public User getUser(@RequestParam String name) throws InterruptedException, ExecutionException {
        return userService.getUserDetails(name);
    }

    @GetMapping("/getAllUsers")
    public List<User> getUsers() throws InterruptedException, ExecutionException {
        return userService.getAllUsers();
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user ) throws InterruptedException, ExecutionException {
        return userService.updateUserDetails(user);
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user ) throws InterruptedException, ExecutionException {
        return userService.saveUserDetails(user);
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam String username ) throws InterruptedException, ExecutionException {
        return userService.deleteUser(username);
    }

    
}
