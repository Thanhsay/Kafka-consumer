package com.example.kafkaconsumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "test", groupId = "group_json")
    public void kafkaConsumer(String userJson) throws JsonProcessingException {
        User user = new ObjectMapper().readValue(userJson, User.class);
        System.out.println("User from producer: " + user.getName() );
    }
}
