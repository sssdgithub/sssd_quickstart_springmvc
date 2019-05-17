package com.sssd.springmvc.controller;

import com.sssd.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/anno")
public class AnnotationController {

    @RequestMapping("/annoParam")
    public String annoParam(@RequestParam(value="username") String name){
        System.out.println(name);
        return "success";
    }
    @RequestMapping("/annoRequestBody")
    public String annoRequestBody(@RequestBody String body){
        System.out.println(body);
        //username=tangseng
        return "success";
    }
    @RequestMapping(path = "/annoPathVariable",method = RequestMethod.POST)
    public String annoPathVariable(User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping(path = "/annoPathVariable/{id}",method = RequestMethod.GET)
    public String annoPathVariable(@PathVariable(name = "id") String id){
        System.out.println(id);
        return "success";
    }
    @RequestMapping("/annoRequestHeader")
    public String annoRequestHeader(@RequestHeader(value = "Accept") String acceptHeader){
        System.out.println(acceptHeader);
        return "success";
    }
}
