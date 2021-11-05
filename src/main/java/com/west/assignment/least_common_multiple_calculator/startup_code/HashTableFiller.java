package com.west.assignment.least_common_multiple_calculator.startup_code;

import com.west.assignment.least_common_multiple_calculator.service.LCMCalculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HashTableFiller implements CommandLineRunner {
    private final LCMCalculator lcmCalculator;

    private int[] ranges = new int[21];

    public HashTableFiller(LCMCalculator lcmCalculator) {
        this.lcmCalculator = lcmCalculator;
    }

    @Override
    public void run(String... args) throws Exception {
        //Fills Hashtable with the LCM results ranging from 1 to 21
        //Half of the requestable ranges(1-42), in order to maximize responsetime efficiency
        fillHashTable();
    }

    private void fillHashTable() {
        //Ranges 1 - 21
        for (int i = 0; i < 21 ; i++) {
             ranges[i] = i + 1;
        }
        for (int range : ranges) {
            lcmCalculator.fromOneTill(range);
        }
    }
}
