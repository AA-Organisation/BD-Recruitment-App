package com.asheckhove.privacy.controller;

import com.asheckhove.privacy.model.User;
import com.asheckhove.privacy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * User: Asheck
 * Date: 3/7/2022
 * Time: 3:27 PM
 */

@RestController
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




//    @RequestMapping("/")
//    public String getUsers(){
//        return "{david, solomon, adam}";
//    }

//    @PostMapping(value = "/postuser",
//            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
//            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
//
//    )
//    public ResponseEntity<User> postUser(@RequestBody User user){
//        return ResponseEntity.created(URI
//                        .create(String.format("/persons/")))
//                .body(user);
//    }
}
