package com.champ.codeWithMe.champCodeWithMe.service;

import com.champ.codeWithMe.champCodeWithMe.dao.Coach;
import org.springframework.stereotype.Component;

@Component
public class SkatingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Inaline Skates Sprint Race";
    }
}
