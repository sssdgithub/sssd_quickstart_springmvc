package com.sssd.springmvc.controller;

import com.sssd.springmvc.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/customException")
    public String customException() throws SysException{
        System.out.println("customException...");
        int i = 10/0;
        return "success";
    }



}
