package com.rootnext.spring.demoapp.services;

import com.rootnext.spring.demoapp.models.Student;
import com.rootnext.spring.demoapp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
