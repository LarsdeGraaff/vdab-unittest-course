package com.realdolmen;

/**
 * Created by jeansmits on 8/06/15.
 */
public class Calculator {

    public int add(String s) {
        int a=0;
        for (int i=1;i<s.length();i++) {
            a = a + Integer.parseInt(s.valueOf(s.charAt(0)));

        }
        return a;
    }
}
