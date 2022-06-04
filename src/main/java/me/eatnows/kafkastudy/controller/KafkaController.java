package me.eatnows.kafkastudy.controller;

import me.eatnows.kafkastudy.dto.MailDto;
import me.eatnows.kafkastudy.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping
public class KafkaController {

    private final Producer producer;

    @Autowired
    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/v1/kafka")
    public String sendMessage(@RequestBody Map<String, String> data) {
        this.producer.sendMessage(data.get("message"));
//        System.out.println(data.get("message"));

        return "succees";
    }

    @PostMapping("/v1/777")
    public String sendMessage777(@RequestBody Map<String, String> data) {
        this.producer.sendMessage2(data.get("message"));
//        System.out.println(data.get("message"));

        return "succees";
    }

    @PostMapping("/v1/mail")
    public String sendMail(MailDto dto) {
        this.producer.sendMail(dto);

        return "succees";
    }


}
