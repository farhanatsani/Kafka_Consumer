package com.kafka.consumer.dto.debezium;

import lombok.Data;

@Data
public class DebeziumMessageDTO {
    private ProductPayloadDTO payload;
}
