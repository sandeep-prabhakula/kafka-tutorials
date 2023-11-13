package com.sandeepprabhakula.kafkaproducer.service;

import com.sandeepprabhakula.kafkaproducer.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private final Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public void update(String location) {

        this.kafkaTemplate.send(AppConstants.LOCATION_UPDATE_TOPIC, location);
        logger.info("message: location produced");

    }
}
