package com.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "news",
            groupId = "groupProduct")
    void listener(String data) {
        System.out.println("Listener received: " + data + " !!!");
    }

}
