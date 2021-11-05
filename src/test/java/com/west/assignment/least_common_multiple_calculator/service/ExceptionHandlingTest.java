package com.west.assignment.least_common_multiple_calculator.service;

import com.west.assignment.least_common_multiple_calculator.controller.Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ExceptionHandlingTest {
    //The applications max asked value is 1-42.
    //Anything above will return a wrong integer answer according to https://www.calculator.net/lcm-calculator.html
    //And should therefore return an exception when asked fromOneTill(42+)

    //Todo: Update with parameterized tests for: 43, 59, 137, 3152, 25245
    @Test
    void ReturnValueOf_MaxRangeReachedException_When_ResultGreaterThen_42_IsRequested_At_ControllerLevel(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        Controller controller = new Controller(lcmCalculator);
        String result = controller.LeastCommonMultipleTill(43);
        assertEquals("Error: maximum range requested is 1 - 42", result);

    }

}