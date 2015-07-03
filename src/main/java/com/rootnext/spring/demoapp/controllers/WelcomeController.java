package com.rootnext.spring.demoapp.controllers;


import com.rootnext.spring.demoapp.services.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by sanjoy on 7/3/15.
 */
@Controller
public class WelcomeController {
    private final WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService){
        this.welcomeService = welcomeService;
    }

    @RequestMapping("/")
    public String index(Map<String, Object> model){
        model.put("title", "Hello World");
        model.put("message", "Game ON");
        return "index";
    }

    @RequestMapping("/hello/{name}")
    public ModelAndView hello(@PathVariable("name")String name){
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Hello");
        model.addObject("message", "Hello " + name);
        model.setViewName("index");
        return model;
    }
}
