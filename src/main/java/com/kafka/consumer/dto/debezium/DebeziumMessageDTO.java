package com.kafka.consumer.dto.debezium;

import lombok.Data;

import java.io.Serializable;

@Data
public class DebeziumMessageDTO implements Serializable {
    private ProductPayloadDTO payload;
}
