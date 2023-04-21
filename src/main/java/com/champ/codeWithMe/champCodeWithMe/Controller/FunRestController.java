package com.champ.codeWithMe.champCodeWithMe.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/get/home")
    public String sayHello(){
        return "Hello World";
    }
}
