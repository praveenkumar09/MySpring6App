package com.springguru.praveen.MySpring6App.config;

import com.springguru.praveen.MySpring6App.service.Coach;
import com.springguru.praveen.MySpring6App.serviceImpl.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
