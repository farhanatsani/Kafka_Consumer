package com.kafka.consumer.dto.debezium;

import com.kafka.consumer.dto.Product;
import lombok.Data;

@Data
public class ProductPayloadDTO {
    private Product before;
    private Product after;
}
