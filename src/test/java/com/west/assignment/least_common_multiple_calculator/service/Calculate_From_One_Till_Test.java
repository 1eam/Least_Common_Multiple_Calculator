package com.west.assignment.least_common_multiple_calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//These testcases are based on the calculation of the following resource https://www.calculator.net/lcm-calculator.html
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

    //Bigger number tests: Starting from 1-23

    @Test
    void ResultOfOneTill_21(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(21);
        assertEquals("232792560", result);

    }

    @Test
    void ResultOfOneTill_22(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(22);
        assertEquals("232792560", result);

    }

    @Test
    void ResultOfOneTill_23(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(23);
        assertEquals("5354228880", result);

    }

    @Test
    void ResultOfOneTill_25(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(25);
        assertEquals("26771144400", result);

    }

    @Test
    void ResultOfOneTill_42(){
        LCMCalculator lcmCalculator = new LCMCalculator();
        String result = lcmCalculator.fromOneTill(42);
        assertEquals("219060189739591200", result);

    }

}
