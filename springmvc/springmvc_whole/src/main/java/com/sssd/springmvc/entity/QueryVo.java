package com.sssd.springmvc.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryVo implements Serializable {
    private User user;
    private Order order;
}
