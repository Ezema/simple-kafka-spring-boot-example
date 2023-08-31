package com.example.kafka_microservices;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "sampleTopic", groupId = "fooGroupId")
    void listener(String data) {
        System.out.println("Event string: " + data);
    }
}