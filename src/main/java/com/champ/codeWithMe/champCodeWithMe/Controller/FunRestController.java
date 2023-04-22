package com.champ.codeWithMe.champCodeWithMe.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private static final Logger log = LoggerFactory.getLogger(FunRestController.class);


    @Value("${home.name}")
    private String name;

    @Value("${home.city}")
    private String city;
    // expose "/" that return "Hello World"

    @GetMapping("/get/home")
    public String sayHello(){
        log.info("Hi, I am {} and I live in {}",name,city);
        return "Hello World";
    }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Let's begin to complete this course";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is you lucky day";
    }

}
