package com.kafka.consumer;

import com.kafka.consumer.dto.MessageRequest;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListeners {

    @SneakyThrows
    @KafkaListener(
            topics = "news",
            groupId = "group-news")
    void listener(@Payload String data, @Headers MessageHeaders headers) {
//        Thread.sleep(50000);
        System.out.println("Listener received: " + data + " !!!");
    }

}
