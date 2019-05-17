package com.sssd.springmvc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDateConverter implements Converter<String,Date> {

    public Date convert(String s) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(null == s){
            throw new RuntimeException("参数为空!");
        }
        try {
            Date date = dateFormat.parse(s);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException("数据转换出现错误");
        }
    }
}
