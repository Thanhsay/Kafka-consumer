package com.example.kafkaconsumer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @GetMapping("/subscribe")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok().body("Just testing");
    }
}
