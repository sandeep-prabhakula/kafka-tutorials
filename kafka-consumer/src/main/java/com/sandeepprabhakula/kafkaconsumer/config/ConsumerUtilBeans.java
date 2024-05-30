package com.sandeepprabhakula.kafkaconsumer.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class ConsumerUtilBeans {

//    @Bean
//    public Properties consumerProperties(){
//        Properties consumerProperties = new Properties();
//
//        consumerProperties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        consumerProperties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
//        consumerProperties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer .class.getName());
//        consumerProperties.put(ConsumerConfig.GROUP_ID_CONFIG, AppConstants.GROUP_ID);
//        consumerProperties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//
//        return consumerProperties;
//    }

//    @Bean
//    public KafkaConsumer<String,String> kafkaConsumer(){
//        return new KafkaConsumer<>(consumerProperties());
//    }
}
