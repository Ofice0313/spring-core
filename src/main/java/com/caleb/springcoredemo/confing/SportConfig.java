package com.caleb.springcoredemo.confing;

import com.caleb.springcoredemo.entities.SwimCoach;
import com.caleb.springcoredemo.interfaces.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
