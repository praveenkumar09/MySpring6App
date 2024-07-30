package com.springguru.praveen.MySpring6App.rest;


import com.springguru.praveen.MySpring6App.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //inject properties coach name and team name from app property file
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    private Coach myCoach;

    //Constructor Injection Example
    //Autowired not needed here if there is only one constructor
    //Qualifier({beanNameWithFirstCharacterLowerCase})
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    //Setter Injection Example
//    @Autowired
//    public void setMyCoach(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    //Injection With Any method name
//    @Autowired
//    public void methodToSetCoach(Coach coach) {
//        this.myCoach = coach;
//    }

    // expose "/" than return Hello World
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    //expose "/workout" that returns your daily workout
    @GetMapping("/workout")
    public String getWorkout(){
        return "Run a hard 5k";
    }

    //expose "/fortune" that returns your daily fortune
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Its your luck day!";
    }

    @GetMapping("/coachName")
    public String getCoachName(){
        return coachName;
    }

    @GetMapping("/teamName")
    public String getTeamName(){
        return teamName;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


}
