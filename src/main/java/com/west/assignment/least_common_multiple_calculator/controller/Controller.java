package com.west.assignment.least_common_multiple_calculator.controller;

import com.west.assignment.least_common_multiple_calculator.exceptions.MaxRangeReachedException;
import com.west.assignment.least_common_multiple_calculator.service.LCMCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Overview:
//Each method first checks for the result in the Hashtable and returns the value immediately (O)1
//No result in Hashtable? Calculate the LCM, And store result in Hashtable for next request

@RestController
public class Controller {

    @GetMapping("/LeastCommonMultiple")
    public String LeastCommonMultipleTill(@RequestParam("till") int userEntry){

        int[] possibleKey = LCMCalculator.calculatePossibleKey(userEntry);
        boolean keyIsFound = LCMCalculator.hashtable.containsKey(possibleKey);

        //Checks for the result in Hashtable first
        if (keyIsFound){
            String lcm = LCMCalculator.hashtable.get(possibleKey);
            return lcm + " is the smallest number that can be divided by each of the numbers from 1 to " + userEntry + " without any remainder.";
        }else {
            try {
                //range contains [1,2,3,4,5] format
                int[] range = LCMCalculator.calculateRange(userEntry);
                //actual calculation
                String lcm = LCMCalculator.caculateLCM(range);

                return lcm + " is the smallest number that can be divided by each of the numbers from 1 to " + userEntry + " without any remainder.";

            } catch (MaxRangeReachedException e){
                //contains string "Error: maximum range requested is 1 - 42"
                return e.getMessage();
            }
        }
    }

//TODO: NiceToHave:  Calculate LeastCommonMultiple From-Till
//TODO: NiceToHave:  Calculate LeastCommonMultiple of given (random) numbers

}