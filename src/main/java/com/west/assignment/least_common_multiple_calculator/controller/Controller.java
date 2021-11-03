package com.west.assignment.least_common_multiple_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/LeastCommonMultiple")
    public String LeastCommonMultipleTill(@RequestParam("till") String userEntry){
        String LCM = "";
        return LCM + " is the smallest number that can be divided by each of the numbers from 1 to " + userEntry + " without any remainder.";
    }

}