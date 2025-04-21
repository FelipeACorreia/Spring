package com.sblearn.learningcore.components;

import com.sblearn.learningcore.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component // says that is available for autowiring (IoC - Inversion of Control - Dependency Injection)
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice cricket, now!";
    }
}
