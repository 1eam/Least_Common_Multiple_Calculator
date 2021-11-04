package com.west.assignment.least_common_multiple_calculator.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
        //        PrimeFactors of input
        List<Integer[]> primeFactorsOfxNumbers = calculatePrimeFactorsOf(numbers);
        //        actual LCM in int: 2520
        int intLCM = multiplyCommonFactors(primeFactorsOfxNumbers);
        //        cast value to String
        String lcm = Integer.toString(intLCM);
        //        store value in hashtable for future lookup (O)1
        hashMap.put(numbers, lcm);
        return lcm;

    }


    private List<Integer[]> calculatePrimeFactorsOf(int[] numbers) {
        //perform calculatePrimeFactors of individual numbers, return List of array [2,2,3] [2,2,2,2]
        //put array of primeFactors in below variable [2,2,3] [2,2,2,2]
        List<Integer[]> primeFactorsOfInputNumbers = new ArrayList<>();
    }

    private int multiplyCommonFactors(List<Integer[]> primeFactorsOfxNumbers) {
        //Count how often each primeNumber appears, in each element of the list/array (primeFactorsOfInputNumbers)
        //Get the index/value of the most frequent multipliers

        //perform revealMostCommonMultiplier
        //The highest compared number's value needs to be get
        //Highest found? then move to next primeNumber in the array and repeat

        //Pairing the common prime Factors we get the LCM
    }




    private int getPrimeFactor(int number) {
        //Divided by primes (2,3,5,7,11)
        int factor;
        //Find the factors of (i) the given number
        for (int i = 1; i < number ; i++) {
            while (number % i == 0)
            number / prime
            factor = 2;
        }

        //Check the number of factors (factors) of that number
        //If the number of factors is more than two, it is not a prime number.

        //calcucale


        return factor;
    }

    public int[] calculateRange(int num) {
        int[] range = new int[num];

        for (int i = 0; i < num; i++) {
            range[i] = i + 1;
        }
        return range;
    }
}
