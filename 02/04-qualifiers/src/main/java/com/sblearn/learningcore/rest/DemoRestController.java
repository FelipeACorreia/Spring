package com.sblearn.learningcore.rest;


import com.sblearn.learningcore.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {


    private Coach myCoach;
    @Autowired // set the dependency
    // Using qualifiers to specify which component (bean) will be instantiated when the endpoint be called
    public void setMyCoach(@Qualifier("soccerCoach") Coach coach) {
        myCoach = coach;
    }

    @GetMapping("/workout")
    public String dailyWorkout(){
        return this.myCoach.getDailyWorkout();
    }

    @GetMapping("/")
    public String index(){
        return "Hello World";
    }
}
