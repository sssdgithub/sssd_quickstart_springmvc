package com.sssd.springmvc.controller;

import com.sssd.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping("/quickstart")
public class IndexController {

    @RequestMapping("/sayHello")
    public String sayHello(HttpServletRequest request, HttpServletResponse response){
        System.out.println("hello springmvc");
        return "success";
    }

    @RequestMapping("/param")
    public String param(String username,String password){
        System.out.println(username+","+password);
        return "success";
    }

    @RequestMapping("/beanParam")
    public String beanParam(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/collectionParam")
    public String collectionParam(User user){
        System.out.println(user);
        return "success";
    }

    /**
     * springmvc 默认的时间转换格式是 2019/05/15
     *           如果从客户端拿到数据格式是2019-05-15,springMVC就会报错
     */
    @RequestMapping("/converter")
    public String converter(Date date){
        System.out.println(date);
        return "success";
    }

}
