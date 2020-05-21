package com.assessment.caculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    SimpleCalculator calcAdd = null;

    @Before
    public void setup() throws Exception{
        calcAdd = new SimpleCalculator();
    }

    @Test
    public void addEmptyString(){

        String num = "";

        assertEquals(0, calcAdd.add(num));
    }
}