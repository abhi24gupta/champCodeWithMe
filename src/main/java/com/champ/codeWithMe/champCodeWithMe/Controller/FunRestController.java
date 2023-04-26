package com.champ.codeWithMe.champCodeWithMe.Controller;

import com.champ.codeWithMe.champCodeWithMe.dao.Coach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private static final Logger log = LoggerFactory.getLogger(FunRestController.class);
    private Coach myCoach;

    @Autowired
    public FunRestController(Coach theCoach) {
        myCoach = theCoach;
    }

    @Autowired
    public void setMyCoach(Coach theCoach) {
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
