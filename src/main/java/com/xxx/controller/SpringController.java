package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("SpringController")
public class SpringController {

    @RequestMapping("/demo")
    public String demo(){
        System.out.println("Spring MVC");
        return "success.jsp";
    }



}
