package com.west.assignment.least_common_multiple_calculator.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;

@Service
public class LCMCalculator {
    public HashMap<int[], String> hashMap = new HashMap<>();

    public String fromOneTill(int i) {
        //range: [1, 2]
        int[] range = calculateRange(i);
        System.out.println(Arrays.toString(range));

        String lcm = caculateLCM(range);
        return lcm;
    }

    public String caculateLCM(int[] numbers) {
        int intLCM = numbers[0];
        int gcd = numbers[0];

        // Loops through the array and finds GCD
        // Then divides number by GCD to get the LCM
        for(int i=1; i<numbers.length; i++){
            gcd = calculateGCD(numbers[i], intLCM);
            intLCM = (intLCM*numbers[i])/gcd;
        }

        // Cast value to String for storage in Hashtable. String values will be returned to the end-user
        String lcmAsString = Integer.toString(intLCM);
        // Before return, store LCM-value in hashtable for future lookup (O)1. With the given input[] as key
        hashMap.put(numbers, lcmAsString);

        return lcmAsString;
    }

    //recursive function to find GCD of two numbers
    public static int calculateGCD(int number, int lcm){
        if(lcm == 0){
            return number;
        }

        return calculateGCD(lcm, number % lcm);
    }

    public int[] calculateRange(int num) {
        int[] range = new int[num];

        for (int i = 0; i < num; i++) {
            range[i] = i + 1;
        }
        return range;
    }
}