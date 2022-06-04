package me.eatnows.kafkastudy.service;

import me.eatnows.kafkastudy.dto.MailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String msg) {
        kafkaTemplate.send("test567", msg);
    }

    public void sendMessage2(String msg) {
        kafkaTemplate.send("test777", msg);
    }

    public void sendMail(MailDto dto) {
        Message<MailDto> message = MessageBuilder
                .withPayload(dto)
                .setHeader(KafkaHeaders.TOPIC, "mail")
                .build();

        kafkaTemplate.send(message);
    }

}
