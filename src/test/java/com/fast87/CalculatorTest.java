package com.fast87;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void before(){
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void add() throws Exception {
        assertEquals(9, cal.add(3,6));
        System.out.println("add");
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(3, cal.subtract(5,2));
        System.out.println("subtract");
    }

    @Test
    public void multply() throws Exception {
        assertEquals(12, cal.multply(4, 3));
        System.out.println("mulply");
    }

    @Test
    public void divide() throws Exception {
        assertEquals(4, cal.divide(12, 3));
        System.out.println("divide");
    }

    @After
    public void after(){
        System.out.println("after");
    }

}