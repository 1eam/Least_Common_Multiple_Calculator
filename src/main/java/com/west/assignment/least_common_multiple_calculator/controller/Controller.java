package com.west.assignment.least_common_multiple_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/getLeastCommonMultiple")
    public String getLeastCommonMultiple(){
        return "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.";
    }
}