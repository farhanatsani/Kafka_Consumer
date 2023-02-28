package com.kafka.consumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class StandardRequestMessageDTO implements Serializable {

    private String transactionId;

    private LocalDateTime dateTime;

    @JsonProperty("payLoad")
    private JsonNode payLoad;

}
