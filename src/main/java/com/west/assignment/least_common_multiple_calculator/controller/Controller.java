package com.west.assignment.least_common_multiple_calculator.controller;

import com.west.assignment.least_common_multiple_calculator.service.LCM;
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
        int[] possibleKey = LCM.calculatePossibleKey(userEntry);
        boolean keyIsFound = LCM.hashtable.containsKey(possibleKey);

        if (keyIsFound){
            String lcm = LCM.hashtable.get(possibleKey);
            return lcm + " is the smallest number that can be divided by each of the numbers from 1 to " + userEntry + " without any remainder.";
        }else {

            return LCM.fromOneTill(userEntry);
        }
    }

//TODO: NiceToHave:  Calculate LeastCommonMultiple From-Till
//TODO: NiceToHave:  Calculate LeastCommonMultiple of given (random) numbers

}