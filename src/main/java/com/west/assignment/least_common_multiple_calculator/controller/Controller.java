package com.west.assignment.least_common_multiple_calculator.controller;

import com.west.assignment.least_common_multiple_calculator.service.LCMCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final LCMCalculator lcmCalculator;

    public Controller(LCMCalculator lcmCalculator) {
        this.lcmCalculator = lcmCalculator;
    }

    @GetMapping("/LeastCommonMultiple")
    public String LeastCommonMultipleTill(@RequestParam("till") String userEntry){
        String LCM = lcmCalculator.fromOneTill(2);
        return LCM + " is the smallest number that can be divided by each of the numbers from 1 to " + userEntry + " without any remainder.";

//TODO  //At method-call check the result in the Hashtable & return immediately (O)1

//TODO  //No result in Hashtable?
//TODO  //Calculate the LCM, return immediately & store the result in Hashtable for next request
    }

}