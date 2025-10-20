package com.caleb.springcoredemo.entities;

import com.caleb.springcoredemo.interfaces.Coach;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as warm up";
    }
}
