package com.west.assignment.least_common_multiple_calculator.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.HashMap;

@Service
public class LCMCalculator {
    public HashMap<int[], String> hashMap = new HashMap<>();

    public String fromOneTill(int i) {
        //range: [1, 2]
        int[] range = calculateRange(i);
        String lcm = caculateLCM(range);

        return lcm;
    }

    public String caculateLCM(int[] numbers) {
        long intLCM = numbers[0];
        long gcd = numbers[0];

        // Loops through the array and finds GCD
        // Then divides number by GCD to get the LCM
        for(int i=1; i<numbers.length; i++){
            gcd = calculateGCD(numbers[i], intLCM);
            intLCM = (intLCM*numbers[i])/gcd;
        }

        // Cast value to String for storage in Hashtable. String values will be returned to the end-user
        String lcmAsString = Long.toString(intLCM);
        // Before return, store LCM-value in hashtable for future lookup (O)1. With the given input[] as key
        hashMap.put(numbers, lcmAsString);

        return lcmAsString;
    }

    //Euclidean Algorithm to find GCD of two numbers (recursive)
    public static long calculateGCD(long number, long lcm){
        if(lcm == 0){
            return number;
        }

        return calculateGCD(lcm, number % lcm);
        //TODO: Test time-performance of //return BigInteger.valueOf(number).gcd(BigInteger.valueOf(lcm)).longValue();
    }

    public int[] calculateRange(int num) {
        int[] range = new int[num];

        for (int i = 0; i < num; i++) {
            range[i] = i + 1;
        }
        return range;
    }
}