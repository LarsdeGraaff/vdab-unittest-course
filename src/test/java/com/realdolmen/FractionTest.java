package com.realdolmen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void testEquals() {
        Fraction f = new Fraction(10, 5);
        Fraction f1 = new Fraction(10, 5);
        assertEquals(true, f.equals(f1));
    }

    @Test
    public void testReciprocal(){
            Fraction a= new Fraction(5,4);
            Fraction b = a.reciprocal();
            assertEquals(5,b.getDeler());
            assertEquals(4,b.getTeller());
        }

    @Test
    public void testsetteller() throws Exception {
        Fraction k = new Fraction(10,5);
        assertEquals(10, k.getTeller());
    }

    @Test
    public void testMultiply(){

    }
}

