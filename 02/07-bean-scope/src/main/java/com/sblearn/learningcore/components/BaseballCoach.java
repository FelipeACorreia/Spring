package com.sblearn.learningcore.components;

import com.sblearn.learningcore.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice baseball";
    }

    @PostConstruct
    public void doSomething(){
        System.out.println("Do something after consctruction");
    }

    @PreDestroy
    public void doSomethingElse(){
        System.out.println("Do something before destruction");
    }
}
