package com.west.assignment.least_common_multiple_calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculate_From_One_Till_Test {

    @Test
    void ResultOfOneTill_1(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(1);
        assertEquals("1", result);

    }

    @Test
    void ResultOfOneTill_2(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(2);
        assertEquals("2", result);

    }

    @Test
    void ResultOfOneTill_5(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(5);
        assertEquals("60", result);

    }

    @Test
    void ResultOfOneTill_10(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(10);
        assertEquals("2520", result);

    }

    @Test
    void ResultOfOneTill_15(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(15);
        assertEquals("360360", result);

    }

}