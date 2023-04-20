package com.prasad.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component //marks the class as spring bean
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }
}
