package com.west.assignment.least_common_multiple_calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomInputCombinationsTest {

    @Test
    void LCMOf_2_9_10_Is_90(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        int[] numbers = {2, 9, 10};
        String result = lcmCalculator.caculateLCM(numbers);
        assertEquals("90", result);

    }

    @Test
    void LCMOf_7_8_19_21_28_4_Is_3192(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        int[] numbers = {7, 8, 19, 21, 28, 4};
        String result = lcmCalculator.caculateLCM(numbers);
        assertEquals("3192", result);

    }
}