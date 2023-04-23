package com.prasad.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //marks the class as spring bean // makes it available for dependency injection
public class CricketCoach implements Coach{


    //    This is a no arg constructor
    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}