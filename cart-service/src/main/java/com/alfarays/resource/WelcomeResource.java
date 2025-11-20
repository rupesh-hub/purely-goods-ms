package com.alfarays.resource;

import com.alfarays.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class WelcomeResource {

    @GetMapping
    public ResponseEntity<Message> message() {
        return ResponseEntity.ok(
                Message.builder()
                        .message("Welcome to cart service microservices.")
                        .timestamp(LocalDateTime.now())
                        .sender("CART-SERVICE-MS")
                        .build()
        );
    }

}
