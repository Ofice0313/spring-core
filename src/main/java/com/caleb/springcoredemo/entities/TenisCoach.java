package com.caleb.springcoredemo.entities;

import com.caleb.springcoredemo.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {

    public TenisCoach(){
        System.out.println("In constructor: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }
}
