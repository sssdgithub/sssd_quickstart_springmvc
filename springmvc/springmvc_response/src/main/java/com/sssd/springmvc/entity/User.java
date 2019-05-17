package com.sssd.springmvc.entity;

import lombok.Data;
import org.springframework.stereotype.Controller;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String username;
    private String password;
}
