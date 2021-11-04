package com.west.assignment.least_common_multiple_calculator.startup;

import com.west.assignment.least_common_multiple_calculator.service.LCMCalculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HashTableFiller implements CommandLineRunner {
    private final LCMCalculator lcmCalculator;

    private int[] ranges = new int[22];
    public int[] primeNumbers = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};


    public HashTableFiller(LCMCalculator lcmCalculator) {
        this.lcmCalculator = lcmCalculator;
    }

    @Override
    public void run(String... args) throws Exception {
        //Fills Hashtable with the LCM results ranging from 1 to 22
        //After 23 we dont use ints. but Longs 23 = 5,354,228,880L
        fillHashTable();
    }

    private void fillHashTable() {
        //Ranges 1 - 22
        for (int i = 0; i < 22 ; i++) {
             ranges[i] = i + 1;
        }
        for (int range : ranges) {
            lcmCalculator.fromOneTill(range);
        }
        System.out.println(Arrays.toString(ranges));
    }
}
