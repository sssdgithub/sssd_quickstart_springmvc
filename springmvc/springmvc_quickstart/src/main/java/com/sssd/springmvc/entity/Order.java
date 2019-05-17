package com.sssd.springmvc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    private String name;
    private Double price;
}
