package com.sssd.springmvc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class User implements Serializable {
    private String username;
    private String password;
    private Date birthday;
//    private Order order;
//    private List<Order> orders;
//    private Map<String,Order> orders;
}
