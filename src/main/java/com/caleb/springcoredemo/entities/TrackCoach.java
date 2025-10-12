package com.caleb.springcoredemo.entities;

import com.caleb.springcoredemo.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
