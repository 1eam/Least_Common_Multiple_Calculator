package com.west.assignment.least_common_multiple_calculator.service;

import com.west.assignment.least_common_multiple_calculator.exceptions.MaxRangeReachedException;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class LCM {
    public static Hashtable<int[], String> hashtable = new Hashtable<>();

    public static String fromOneTill(int i) {
        try {
            int[] range = new int[0];

            //range contains [1,2,3,4,5] format
            range = calculateRange(i);
            String lcm = caculateLCM(range);
            return lcm + " is the smallest number that can be divided by each of the numbers from 1 to " + i + " without any remainder.";

        } catch (MaxRangeReachedException e) {
            return e.getMessage();
        }
    }

    public static String caculateLCM(int[] numbers) {
        long intLCM = numbers[0];
        long gcd = numbers[0];

        // Loops through the array and finds GCD
        // Then divides number by GCD to get the LCM
        for(int i=1; i<numbers.length; i++){
            gcd = calculateGCD(numbers[i], intLCM);
            intLCM = (intLCM*numbers[i])/gcd;
        }
        // For storage in Hashtable, String values are used.
        String lcmAsString = Long.toString(intLCM);
        // Before return, store LCM-value in hashtable for future lookup (O)1.
        hashtable.put(numbers, lcmAsString);

        return lcmAsString;
    }

    //Euclidean Algorithm to find GCD of two numbers (recursive)
    private static long calculateGCD(long number, long lcm){
        if(lcm == 0){
            return number;
        }

        return calculateGCD(lcm, number % lcm);
    }

    public static int[] calculateRange(int num) throws MaxRangeReachedException {
        //Throw Exception when input is greater then 42, but still calculate the key for storage in Hashtable
        if (num>42){
            int[] range = new int[num];
            for (int i = 0; i < num; i++) {
                range[i] = i + 1;
            }
            String message = "Error: maximum range requestable is 1 - 42";
            hashtable.put(range, message);
            throw new MaxRangeReachedException(message);
        }

        int[] range = new int[num];
        for (int i = 0; i < num; i++) {
            range[i] = i + 1;
        }

        return range;
    }

    public static int[] calculatePossibleKey(int userEntry) {
        int[] possibleKey = new int[userEntry];
        for (int i = 0; i < userEntry; i++) {
            possibleKey[i] = i + 1;
        }
        return possibleKey;

    }
}