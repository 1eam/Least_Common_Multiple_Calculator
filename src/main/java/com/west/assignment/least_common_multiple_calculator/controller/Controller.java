package com.west.assignment.least_common_multiple_calculator.controller;

import com.west.assignment.least_common_multiple_calculator.exceptions.MaxRangeReachedException;
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
    public String LeastCommonMultipleTill(@RequestParam("till") int userEntry){

        try {
            //contains [1,2,3,4,5] format
            int[] range = lcmCalculator.calculateRange(userEntry);

            //At method-call check for the result in the Hashtable & return immediately (O)1
            String lcm = lcmCalculator.hashMap.get(range);

            //Output
            return lcm + " is the smallest number that can be divided by each of the numbers from 1 to " + userEntry + " without any remainder.";

        } catch (MaxRangeReachedException e) {
            //contains string "Error: maximum range requested is 1 - 42"
            return e.getMessage();
        }



        
//TODO  //No result in Hashtable?
//TODO  //Calculate the LCM, return immediately & store the result in Hashtable for next request
    }

}