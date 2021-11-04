package com.west.assignment.least_common_multiple_calculator.startup;

import com.west.assignment.least_common_multiple_calculator.service.LCMCalculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;

@Component
public class HashTableFiller implements CommandLineRunner {
    private final LCMCalculator lcmCalculator;
    public HashMap<String, String> hashMap = new HashMap<>();
    int[] ranges = new int[22];

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
            String lcm = lcmCalculator.fromOneTill(range);

            hashMap.put(Integer.toString(range), lcm);
        }
        System.out.println(Arrays.toString(ranges));
    }
}
