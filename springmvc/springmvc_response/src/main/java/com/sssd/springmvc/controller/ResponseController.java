package com.sssd.springmvc.controller;

import com.sssd.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/response")
public class ResponseController {
    @RequestMapping("/testReturnString")
    public String testReturnString(Model model){
       User user = new User();
       user.setUsername("username");
       user.setPassword("password");
       model.addAttribute("user",user);
        System.out.println("testReturnString...");
        return "success";//默认转发
    }

    /**
     * 如果返回值是void springmvc就会默认去找RequestMapping /response/testVoid.jsp
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid...");
        //转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
//        return "forward:/WEB-INF/pages/success.jsp";      不会经过视图解析器
        //重定向
//        response.sendRedirect(request.getContextPath()+"/index.jsp");
//        return "redirect:index.jsp"      不会经过视图解析器
        //直接响应给浏览器
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        response.getWriter().write("console");
    }

    @RequestMapping("/testReturnModelAndView")
    public ModelAndView testReturnModelAndView(){
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsername("username");
        user.setPassword("password");
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/ajaxTest")
    public @ResponseBody User ajaxTest(@RequestBody  User user){
        System.out.println(user);
        user.setUsername("console");
        user.setPassword("console");
       return user;
    }
}
