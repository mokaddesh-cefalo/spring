package com.spring.learn.modelclasses;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Order {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
