package com.assessment.caculator;

import java.util.Arrays;

public class SimpleCalculator {

    public int add(String number) {

        int sum = 0;
        if (number.isEmpty()) {
            return sum;
        } else
        {
            number = number.replaceAll("[^-?0-9]+", " ");
            int[] numbers = Arrays.asList(number.trim().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            
            for(int n : numbers){
                if(n < 0){
                    String message = "negatives not allowed - ";
                    for(int num : numbers){
                        if(num < 0){
                            message += num;
                            message += " ";
                        }
                    }
                    throw new NegativeNumberException(message);
                }
                sum += n;
            }
        }
        return sum;
    }
}
