package com.prasad.springcoredemo.rest;

import com.prasad.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;
    private Coach aotherCoach;

//    define a constructor for dependency injection
    @Autowired //tells spring to inject a dependency
    public DemoController(@Qualifier("cricketCoach") Coach theCoach,
                          @Qualifier("cricketCoach") Coach theAnotherCoach){
        System.out.println("In Constructor: " + getClass().getSimpleName());
        this.myCoach=theCoach;
        this.aotherCoach=theAnotherCoach;
    }



//    @Autowired
//    public void setCoach(Coach theCoach){
//        this.myCoach=theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach ==anothercoach: " + (myCoach==aotherCoach);
    }
}
