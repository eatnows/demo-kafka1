package me.eatnows.kafkastudy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @PostMapping("/")
    public String hello() {

        return "hello";
    }
}
