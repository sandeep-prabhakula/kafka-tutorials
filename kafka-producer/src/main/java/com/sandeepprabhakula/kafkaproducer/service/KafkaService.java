package com.sandeepprabhakula.kafkaproducer.service;

import com.sandeepprabhakula.kafkaproducer.config.AppConstants;
import com.sandeepprabhakula.kafkaproducer.model.BusPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, BusPayload> kafkaTemplate;
    private final Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public void update(BusPayload busPayload) {

        kafkaTemplate.send(AppConstants.LOCATION_UPDATE_TOPIC,
                busPayload.getBusNumber(), busPayload);

        logger.info("message: location produced");

    }
}
