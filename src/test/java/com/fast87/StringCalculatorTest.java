package com.fast87;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator strCal;

    @Before
    public void before(){
        strCal = new StringCalculator();
    }

    @Test
    public void add(){
        assertEquals(0, strCal.add(null));
        assertEquals(0, strCal.add(""));
        assertEquals(3, strCal.add("3"));
        assertEquals(0, strCal.add("0,0"));
        assertEquals(3, strCal.add("1,2"));
        assertEquals(3, strCal.add("1:2"));
        assertEquals(6, strCal.add("1,2,3"));
        assertEquals(29, strCal.add("1,11,12,2:3"));
        assertEquals(9, strCal.add("1,1,2:2:3"));
        assertEquals(9, strCal.add("//@\n1@1@2@2@3"));

    }

    @Test(expected = RuntimeException.class)
    public void 음수테스트() throws Exception{
        assertEquals(9, strCal.add("-1,1,-2:2:3"));

    }
}
