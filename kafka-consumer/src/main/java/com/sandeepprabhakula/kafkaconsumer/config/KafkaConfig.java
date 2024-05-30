package com.sandeepprabhakula.kafkaconsumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentLinkedQueue;


@Service
public class KafkaConfig {

    private final ConcurrentLinkedQueue<String> messageQueue = new ConcurrentLinkedQueue<>();


    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC,
            groupId = AppConstants.GROUP_ID
    )
    public void updateLocation(@Payload String value, @Header(KafkaHeaders.RECEIVED_KEY) String key) {
        System.out.println(value);
        System.out.println(key);
        System.out.println("______________________________________");
        messageQueue.add(value);
    }


    public ConcurrentLinkedQueue<String> getMessageQueue(){
        return messageQueue;
    }

}
