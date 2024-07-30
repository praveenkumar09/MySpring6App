package com.springguru.praveen.MySpring6App.serviceImpl;

import com.springguru.praveen.MySpring6App.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
