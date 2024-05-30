package com.sandeepprabhakula.kafkaconsumer.controller;

import com.sandeepprabhakula.kafkaconsumer.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class ConsumerController {

    @Autowired
    private KafkaConfig kafkaConfig;

    @GetMapping("/get-messages")
    public List<String> getMessages(){
        return new ArrayList<>(kafkaConfig.getMessageQueue());
    }
}
