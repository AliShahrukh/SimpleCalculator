package com.assessment.caculator;

import java.util.Arrays;

public class SimpleCalculator {

    public int add(String number){

        int sum = 0;
        if (number.isEmpty()) {
            return sum;
        } else
        {
            number = number.replaceAll("[^-?0-9]+", " ");
            int[] numbers = Arrays.asList(number.trim().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            
            for(int n : numbers){
                
                sum += n;
            }
        }
        return sum;
    }
}
