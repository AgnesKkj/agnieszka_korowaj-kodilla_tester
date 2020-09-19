package com.kodilla.parametrized_tests;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class randomizer {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        System.out.println(numbers);
    }
}

