package com.springguru.praveen.MySpring6App.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" than return Hello World
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    //expose "/workout" that returns your daily workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    //expose "/fortune" that returns your daily fortune
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Its your luck day!";
    }
}
