package com.springboot.webservice.resources;

import com.springboot.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping(value = "allUsers")
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Pedro", "pedro@test.com", "40028922", "12345");
        return ResponseEntity.ok().body(user);
    }

}
