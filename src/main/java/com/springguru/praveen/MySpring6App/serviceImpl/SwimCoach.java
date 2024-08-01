package com.springguru.praveen.MySpring6App.serviceImpl;

import com.springguru.praveen.MySpring6App.service.Coach;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do Butterfly Stroke for 30 minutes a day";
    }
}
