package me.eatnows.kafkastudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaStudyApplication {

//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;

    public static void main(String[] args) {
        SpringApplication.run(KafkaStudyApplication.class, args);

    }
//
//    public void sendMessage(String msg) {
//        kafkaTemplate.send("exam", msg);
//    }
//
//    public void listen(String message) {
//        System.out.println("Received Message in group - group-id : " + message);
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        sendMessage("Hi Welcome to Spring For Apache Kafka");
//    }
}
