package com.springguru.praveen.MySpring6App.serviceImpl;

import com.springguru.praveen.MySpring6App.service.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Primary
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor :"+getClass().getSimpleName());
    }

    @PostConstruct
    public void init() {
        System.out.println("In init :"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("In preDestroy :"+getClass().getSimpleName());
    }
}
