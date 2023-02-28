package com.kafka.consumer.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private Integer id;
    private String name;
}
