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


    }

    @Test

    public void testAddTwoNumber() throws Exception{
    }
}
