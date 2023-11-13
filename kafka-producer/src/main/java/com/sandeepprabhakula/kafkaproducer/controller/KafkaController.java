package com.sandeepprabhakula.kafkaproducer.controller;

import com.sandeepprabhakula.kafkaproducer.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/producer")
public class KafkaController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
        for (int i = 0; i < 100000; i++) {
            this.kafkaService.update("(" + Math.random() + " , " + Math.random() + ")");
        }
        return new ResponseEntity<>(Map.of("message", "location Updated"), HttpStatus.OK);
    }
}
