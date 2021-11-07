package com.west.assignment.least_common_multiple_calculator.service;

import com.west.assignment.least_common_multiple_calculator.controller.Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//These testcases are based on the calculation of the following resource https://www.calculator.net/lcm-calculator.html
public class Calculate_From_One_Till_Test {

    @Test
    void ResultOfOneTill_1_is_1(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(1);
        assertEquals("1 is the smallest number that can be divided by each of the numbers from 1 to 1 without any remainder.", result);

    }

    @Test
    void ResultOfOneTill_2_is_2(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(2);
        assertEquals("2 is the smallest number that can be divided by each of the numbers from 1 to 2 without any remainder.", result);
    }

    @Test
    void ResultOfOneTill_5_is_60(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(5);
        assertEquals("60 is the smallest number that can be divided by each of the numbers from 1 to 5 without any remainder.", result);

    }

    @Test
    void ResultOfOneTill_10_is_2520(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(10);
        assertEquals("2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.", result);

    }

    @Test
    void ResultOfOneTill_15_is_360360(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(15);
        assertEquals("360360 is the smallest number that can be divided by each of the numbers from 1 to 15 without any remainder.", result);

    }

    //Numbers that get bigger then int32 (when being calculated under the hood)

    @Test
    void ResultOfOneTill_21_is_232792560(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(21);
        assertEquals("232792560 is the smallest number that can be divided by each of the numbers from 1 to 21 without any remainder.", result);


    }

    @Test
    void ResultOfOneTill_22_is_232792560(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(22);
        assertEquals("232792560 is the smallest number that can be divided by each of the numbers from 1 to 22 without any remainder.", result);

    }

    @Test
    void ResultOfOneTill_23_is_5354228880(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(23);
        assertEquals("5354228880 is the smallest number that can be divided by each of the numbers from 1 to 23 without any remainder.", result);

    }

    @Test
    void ResultOfOneTill_25_is_26771144400(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(25);
        assertEquals("26771144400 is the smallest number that can be divided by each of the numbers from 1 to 25 without any remainder.", result);
    }

    @Test
    void ResultOfOneTill_42_is_219060189739591200(){
        Controller controller = new Controller();
        String result = controller.LeastCommonMultipleTill(42);
        assertEquals("219060189739591200 is the smallest number that can be divided by each of the numbers from 1 to 42 without any remainder.", result);
    }

}
