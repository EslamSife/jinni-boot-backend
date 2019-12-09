package com.jinniservice.backend.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunrRestController {

    private String coachName;


    @GetMapping("/")
    public String sayHello() {
        return "Hello World time the time on server " + LocalDateTime.now();
    }




    @GetMapping("/workout")
    public String startDailyWorkout() {
        return "Start Runing 5k!";
    }


    @GetMapping("/close")
    public String close() {
        return "close at 2:59pm";
    }


    public String getCoachName() {
        return coachName;
    }
}
