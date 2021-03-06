package com.assessment.caculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    SimpleCalculator calcAdd = null;

    @Before
    public void setup(){
        calcAdd = new SimpleCalculator();
    }

    @Test
    public void addEmptyString(){

        String num = "";

        assertEquals(0, calcAdd.add(num));
    }

    @Test
    public void addOneNumber(){
        String num = "1";
        assertEquals(1, calcAdd.add(num));
    }

    @Test
    public void addTwoNumbers() {
        String num = "1,2";
        assertEquals(3, calcAdd.add(num));
    }

    @Test
    public void addMultipleNumbers() {
        String num = "1,2,3,4";
        assertEquals(10, calcAdd.add(num));
    }

    @Test
    public void addNumWithNewLine(){
        String num = "1,2\n3";
        assertEquals(6, calcAdd.add(num));
    }

    @Test
    public void addNumWithNewLine2(){
        String num = "1\n2\n3";
        assertEquals(6, calcAdd.add(num));
    }

    @Test
    public void addNumWithNewLine3(){
        String num = "1\n2,3";
        assertEquals(6, calcAdd.add(num));
    }

    @Test
    public void addNumWithDelimiters() {
        String num = "//;\n1;2";
        assertEquals(3, calcAdd.add(num));
    }

    @Test
    public void addNumWithDelimiters2() {
        String num = "%%\n1;2";
        assertEquals(3, calcAdd.add(num));
    }

    @Test(expected = NegativeNumberException.class)
    public void negativeNumber() {

        String num = "-1,2,-3";
        calcAdd.add(num);
    }
}