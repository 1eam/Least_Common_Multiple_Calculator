package com.west.assignment.least_common_multiple_calculator.service;

import com.west.assignment.least_common_multiple_calculator.controller.Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ErrorsReturnTest {

    //The applications max asked value is 1-42.
    //Anything above will return a wrong integer answer according to Calculator.net https://www.calculator.net/lcm-calculator.html
    //And should therefore return an exception when asked value greater than 42
    @Test
    void ReturnsError_When_RequestedRangeIsGreaterThen_42(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(43);
        assertEquals("Error: maximum range requestable is 1 - 42", result);
        //Nice to have: Update with parameterized tests for: 43, 59, 137, 3152, 25245
    }

}