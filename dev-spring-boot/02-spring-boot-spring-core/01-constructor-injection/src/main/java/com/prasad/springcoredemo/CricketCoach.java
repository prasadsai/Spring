package com.prasad.springcoredemo;

import org.springframework.stereotype.Component;

@Component //marks the class as spring bean // makes it available for dependency injection
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}