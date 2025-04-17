package com.sblearn.learningcore.rest;


import com.sblearn.learningcore.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {


    private Coach myCoach;
    @Autowired // automatically injects dependencies (call the "beans" (classes) needed automatically)
    public DemoRestController(Coach coach) {
        myCoach = coach;

    }

    @GetMapping("/workout")
    public String dailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
