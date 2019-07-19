package com.ways.app.common.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
    @RequestMapping("/commonController/test")
    public String test() {
        
        return "test";
    }

    @RequestMapping("/commonController/logOut")
    public void logOut(HttpSession requestSession) {
        try {
            requestSession.invalidate();
        } catch (Exception e) {
            e.printStackTrace();
        }
       // return "index";
    }
    
}
