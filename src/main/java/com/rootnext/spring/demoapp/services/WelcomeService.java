package com.rootnext.spring.demoapp.services;

import org.springframework.stereotype.Service;

/**
 * Created by sanjoy on 7/3/15.
 */
@Service
public class WelcomeService {

    public String getTitle(){
        return "Welcome";
    }

}
