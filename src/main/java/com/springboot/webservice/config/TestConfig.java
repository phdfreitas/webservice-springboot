package com.springboot.webservice.config;

import com.springboot.webservice.entities.User;
import com.springboot.webservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{
        User user1 = new User(null, "Pedro Freitas", "pedrof@test.com", "40028922", "123456");
        User user2 = new User(null, "Pedro Dias", "pedrodias@test.com", "40028923", "223456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }

}
