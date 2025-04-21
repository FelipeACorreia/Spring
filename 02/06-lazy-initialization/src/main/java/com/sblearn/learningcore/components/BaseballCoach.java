package com.sblearn.learningcore.components;

import com.sblearn.learningcore.interfaces.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice baseball";
    }
}
