package com.west.assignment.least_common_multiple_calculator.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HashTableFiller implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //Fills Hashtable with the LCM results ranging from 1 to 25
        fillHashTable();
    }

    private void fillHashTable() {
    }
}
