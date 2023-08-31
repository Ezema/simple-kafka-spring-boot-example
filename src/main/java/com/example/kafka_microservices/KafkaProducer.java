package com.example.kafka_microservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*public class KafkaProducer {
    @Autowired
    private final KafkaTemplate<String, String> kafkaTemplate;
    kafkaTemplate.send("sampleTopic", "This");
}*/
