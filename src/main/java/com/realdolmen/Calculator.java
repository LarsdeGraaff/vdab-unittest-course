package com.realdolmen;

/**
 * Created by jeansmits on 8/06/15.
 */
public class Calculator {

    public int add(String s) {
        int a=0;
//        if(s.startsWith("//")){
//            s.
//        }

        for (int i=0;i<s.length();i=i+2) {
            a = a + Integer.parseInt(s.valueOf(s.charAt(i)));

        }
        return a;
    }
}
