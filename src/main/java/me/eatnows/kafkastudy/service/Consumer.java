package me.eatnows.kafkastudy.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test777", groupId = "group-id")
    public void listen(String message) {
        System.out.println("Received Message in group - group-id : " + message);
    }
}
