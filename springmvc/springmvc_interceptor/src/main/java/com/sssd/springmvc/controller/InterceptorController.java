package com.sssd.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/customInterceptor")
    public String customInterceptor(){
        System.out.println("customInterceptor...");
        return "success";
    }
}
