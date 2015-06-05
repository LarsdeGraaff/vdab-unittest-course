package com.realdolmen;

/**
 * Created by jeansmits on 5/06/15.
 */
public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction(10,4);
        Fraction b = new Fraction(5,2);



        //simplify
        Fraction c = a.simplify();
        Fraction d = b.simplify();
        System.out.println("simplified fraction: " + c + " en " + d) ;

        //change to double
        double e = a.changeToDouble();
        System.out.println("fraction changed to double: " + e);

        //equals
        System.out.println(b.equals(c));
    }

}
