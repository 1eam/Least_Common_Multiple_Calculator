package com.west.assignment.least_common_multiple_calculator.service;

import com.west.assignment.least_common_multiple_calculator.controller.Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ErrorsTest {
    //The applications max asked value is 1-42.
    //Anything above will return a wrong integer answer according to https://www.calculator.net/lcm-calculator.html
    //And should therefore return an exception when asked fromOneTill(42+)

    //Todo: Update with parameterized tests for: 43, 59, 137, 3152, 25245
    @Test
    void ReturnsError_When_RequestedRangeIsGreaterThen_42(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(43);
        assertEquals("Error: maximum range requestable is 1 - 42", result);
    }

    @Test
    void Controller_ResultOfOneTill_42(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(42);
        assertEquals("219060189739591200 is the smallest number that can be divided by each of the numbers from 1 to 42 without any remainder.", result);
    }

}