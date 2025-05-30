package com.sblearn.learningcore.components;

import com.sblearn.learningcore.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

    public SoccerCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice soccer ball";
    }
}
