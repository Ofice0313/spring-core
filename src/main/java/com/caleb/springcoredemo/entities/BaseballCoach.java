package com.caleb.springcoredemo.entities;

import com.caleb.springcoredemo.interfaces.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice!";
    }
}
