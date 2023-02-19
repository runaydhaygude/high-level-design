package com.deploywarin.learn;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaTemplateConfig {
    
    // @Bean
    // public ProducerFactory<String, String> producerFactory(Map<String, Object> producerConfig) {
    //     return new DefaultKafkaProducerFactory<>(producerConfig);
    // }

    // @Bean
    // public KafkaTemplate<String, String> kafkaTemplate(ProducerFactory<String, String> producerFactory) {
    //     return new KafkaTemplate<>(producerFactory);
    // }
}
