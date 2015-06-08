package com.realdolmen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by jeansmits on 8/06/15.
 */
public class CalculatorTest {
    @Test

    public void testAddZeroNumbers() throws Exception{
        Calculator c = new Calculator();
        assertEquals(0,c.add(""));
    }

    @Test
    public void testAddOneNumber() throws Exception {
        Calculator c = new Calculator();
        String a="5";
        assertEquals(5,c.add(a));
    }

    @Test
    public void testAddTwoNumber() throws Exception{
        Calculator c = new Calculator();
        String a="5,5";
        assertEquals(10,c.add(a));
    }

}