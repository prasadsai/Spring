package com.prasad.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //marks the class as spring bean
@Lazy //not initilization, the creation of bean. // only created when we call it.
//@Primary // marks this class as the primary bean to be used.
public class TrackCoach implements Coach{

    //    This is a no arg constructor
    public TrackCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }
}
