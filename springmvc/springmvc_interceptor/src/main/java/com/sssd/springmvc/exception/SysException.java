package com.sssd.springmvc.exception;

public class SysException extends Exception{
    private String message;
    public SysException(String message){
        this.message = message;
    }
    public SysException(){

    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
