package com.west.assignment.least_common_multiple_calculator.startup_code;

import com.west.assignment.least_common_multiple_calculator.service.LCMCalculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Fills the static hashtable with values of the LCM ranging from from 1 - 21
//So results of the LCM of: 1-2, 1-3, 1-4, 1-5 .etc
//Thats half of the requestable ranges(1-42), in order to improve responsetime efficiency

@Component
public class HashTableFiller implements CommandLineRunner {

    private int[] ranges = new int[21];

    @Override
    public void run(String... args) throws Exception {
        fillHashTable();
    }

    private void fillHashTable() {
        for (int i = 0; i < 21 ; i++) {
             ranges[i] = i + 1;
        }
        for (int range : ranges) {
            LCMCalculator.fromOneTill(range);
        }
    }
}