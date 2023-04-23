package com.prasad.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //marks the class as spring bean
//@Primary // marks this class as the primary bean to be used.
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }
}
