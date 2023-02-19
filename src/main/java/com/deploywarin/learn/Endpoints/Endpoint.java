package com.deploywarin.learn.Endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Endpoint {

    KafkaTemplate<String, String> kafkaTemplate;

    public Endpoint(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/first-endpoint")
    public String firstEndpoint(@RequestParam("message") String message) {
        kafkaTemplate.send("firsttopic", message);
        return message + " sent !";
    }
}