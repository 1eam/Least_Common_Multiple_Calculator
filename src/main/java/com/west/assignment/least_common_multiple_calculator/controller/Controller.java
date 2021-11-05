package com.west.assignment.least_common_multiple_calculator.controller;

import com.west.assignment.least_common_multiple_calculator.exceptions.MaxRangeReachedException;
import com.west.assignment.least_common_multiple_calculator.service.LCMCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public Controller(LCMCalculator lcmCalculator) {
        this.lcmCalculator = lcmCalculator;
    }

    private final LCMCalculator lcmCalculator;

    @GetMapping("/LeastCommonMultiple")
    public String LeastCommonMultipleTill(@RequestParam("till") int userEntry){
        //Checks for the result in Hashtable first & returns value immediately (O)1
        //No result in Hashtable? Calculate the LCM, return & (under the hood) store result in Hashtable for next request

        int[] possibleKey = calculatePossibleKey(userEntry);
        boolean keyIsFound = lcmCalculator.hashtable.containsKey(possibleKey);

        if (keyIsFound){
            String lcm = lcmCalculator.hashtable.get(possibleKey);
            return lcm + " is the smallest number that can be divided by each of the numbers from 1 to " + userEntry + " without any remainder.";
        }else {
            try {
                //contains [1,2,3,4,5] format
                int[] range = lcmCalculator.calculateRange(userEntry);
                String lcm = lcmCalculator.caculateLCM(range);

                return lcm + " is the smallest number that can be divided by each of the numbers from 1 to " + userEntry + " without any remainder.";
            } catch (MaxRangeReachedException e){
                //contains string "Error: maximum range requested is 1 - 42"
                return e.getMessage();
            }
        }
    }

    private int[] calculatePossibleKey(int userEntry) {
        int[] possibleKey = new int[userEntry];
        for (int i = 0; i < userEntry; i++) {
            possibleKey[i] = i + 1;
        }
        return possibleKey;

    }

//NiceToHave   //Calculate LeastCommonMultiple From-Till
}