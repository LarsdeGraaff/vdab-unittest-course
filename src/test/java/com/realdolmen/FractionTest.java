package com.realdolmen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jeansmits on 5/06/15.
 */
public class FractionTest {

    @Test
    public void testSimplify(){
        Fraction f = new Fraction(3,5);
        assertEquals(3,f.getTeller());
        assertEquals(5,f.getDeler());
    }

    @Test
    public void  testChangeToDouble(){
        Fraction f = new Fraction(5,4);
        assertEquals((5.0/4),f.changeToDouble(),0.01);
    }

    @Test
    public void testEquals(){

    }
}
