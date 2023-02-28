package com.kafka.consumer.dto.debezium;

import com.kafka.consumer.dto.Product;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProductPayloadDTO implements Serializable {
    private Product before;
    private Product after;
}
