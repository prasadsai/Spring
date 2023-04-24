package com.prasad.springcoredemo.config;

import com.prasad.springcoredemo.common.Coach;
import com.prasad.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic") //the bean id refers to swimCoach=method exact name.
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
