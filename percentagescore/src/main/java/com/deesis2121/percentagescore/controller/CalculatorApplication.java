package com.deesis2121.percentagescore.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }
}

@RestController
class CalculatorController {

    @GetMapping("/calculateAverage")
    public String calculateAverage(@RequestParam(name = "mid1") double mid1,
                                   @RequestParam(name = "mid2") double mid2) {
        double average1 = ((((mid1 + mid2) / 2)*0.6)-70)/-0.4;
        if(average1<50){
           average1=50;
        }
        return "You need: " + average1+ " points";


    }
}
