package com.west.assignment.least_common_multiple_calculator.exceptions;

//The applications max asked value is 1-42.
//Anything above will return a wrong integer answer according to Calculator.net (https://www.calculator.net/lcm-calculator.html)
//And should therefore return an exception when asked fromOneTill(42+)
public class MaxRangeReachedException extends Exception{

    public MaxRangeReachedException(String message){
        super(message);
    }
}
