package com.sssd.springmvc.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SysExceptionReslover implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        SysException sysEx = null;
        if(e instanceof SysException){
            sysEx = (SysException)e;
        }else{
            new SysException("系统正在维护...");
        }

        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("errorMsg",sysEx.getMessage());
        return mv;
    }
}
