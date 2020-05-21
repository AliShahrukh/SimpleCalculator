package com.assessment.caculator;

import java.util.Arrays;

public class SimpleCalculator {

    public int add(String number){

        int sum = 0;
        if (number.isEmpty()) {
            return sum;
        } else
        {
            int[] numbers = Arrays.stream(number.split(",|\\n")).mapToInt(Integer::parseInt).toArray();
            
            for(int n : numbers){
                
                sum += n;
            }
        }
        return sum;
    }
}
