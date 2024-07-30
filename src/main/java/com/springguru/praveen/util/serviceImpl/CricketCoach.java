package com.springguru.praveen.util.serviceImpl;

import com.springguru.praveen.util.service.Coach;
import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes";
    }
}
