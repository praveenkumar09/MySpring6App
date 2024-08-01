package com.springguru.praveen.MySpring6App.serviceImpl;

import com.springguru.praveen.MySpring6App.service.Coach;
import org.springframework.stereotype.Component;


@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("In Constructor :"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
