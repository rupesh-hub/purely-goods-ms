package com.alfarays.resource;

import com.alfarays.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class WelcomeResource {

    private final Message message;

    {
        message = new Message();
        message.setMessage("Welcome to product service microservices.");
        message.setTimestamp(LocalDateTime.now());
        message.setSender("PRODUCT-SERVICE-MS");
    }

    @GetMapping
    public ResponseEntity<Message> message() {
        return ResponseEntity.ok(
                message
        );
    }

}
