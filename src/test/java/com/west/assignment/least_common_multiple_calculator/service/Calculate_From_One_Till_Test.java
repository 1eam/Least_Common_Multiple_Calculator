package com.west.assignment.least_common_multiple_calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//These testcases are based on the calculation of the following resource https://www.calculator.net/lcm-calculator.html
public class Calculate_From_One_Till_Test {

    @Test
    void ResultOfOneTill_1(){
        String result = LCMCalculator.fromOneTill(1);
        assertEquals("1", result);
    }

    @Test
    void ResultOfOneTill_2(){
        String result = LCMCalculator.fromOneTill(2);
        assertEquals("2", result);
    }

    @Test
    void ResultOfOneTill_5(){
        String result = LCMCalculator.fromOneTill(5);
        assertEquals("60", result);
    }

    @Test
    void ResultOfOneTill_10(){
        String result = LCMCalculator.fromOneTill(10);
        assertEquals("2520", result);
    }

    @Test
    void ResultOfOneTill_15(){
        String result = LCMCalculator.fromOneTill(15);
        assertEquals("360360", result);
    }

    //Numbers that get bigger then int32 (when being calculated under the hood)

    @Test
    void ResultOfOneTill_21(){
        String result = LCMCalculator.fromOneTill(21);
        assertEquals("232792560", result);

    }

    @Test
    void ResultOfOneTill_22(){
        String result = LCMCalculator.fromOneTill(22);
        assertEquals("232792560", result);

    }

    @Test
    void ResultOfOneTill_23(){
        String result = LCMCalculator.fromOneTill(23);
        assertEquals("5354228880", result);
    }

    @Test
    void ResultOfOneTill_25(){
        String result = LCMCalculator.fromOneTill(25);
        assertEquals("26771144400", result);
    }

    @Test
    void ResultOfOneTill_42(){
        String result = LCMCalculator.fromOneTill(42);
        assertEquals("219060189739591200", result);
    }

    @Test
    void ResultOfOneTill_43_ReturnsErrorMessage(){
        String result = LCMCalculator.fromOneTill(43);
        assertEquals("Error: maximum range requestable is 1 - 42", result);
    }

}
