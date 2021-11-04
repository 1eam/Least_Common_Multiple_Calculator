package com.west.assignment.least_common_multiple_calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomInputCombinationsTest {

    @Test
    void ResultOf2_9_10_Is_90(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        int[] numbers = {2,9,10};
        String result = lcmCalculator.caculateLCM(numbers);
        assertEquals("90", result);

    }
}