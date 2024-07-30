package com.springguru.praveen.MySpring6App.serviceImpl;

import com.springguru.praveen.MySpring6App.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
