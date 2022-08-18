package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "longCode", groupId = "long")
    void listener(String data) {
        System.out.println("Listener Received: " + data);
    }
}
