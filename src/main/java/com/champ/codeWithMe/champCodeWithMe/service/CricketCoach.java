package com.champ.codeWithMe.champCodeWithMe.service;

import com.champ.codeWithMe.champCodeWithMe.dao.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "You have reached to acheive goal";
    }
}
