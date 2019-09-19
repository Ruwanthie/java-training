package com.dasuni.smsui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {

    @RequestMapping(value = "/")
    public String loadHome(){
        return "home";
    }
}

