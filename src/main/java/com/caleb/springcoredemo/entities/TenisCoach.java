package com.caleb.springcoredemo.entities;

import com.caleb.springcoredemo.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }
}
