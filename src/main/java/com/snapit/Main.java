package com.snapit;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String x = "abc";
        String y = "cat";

        String z = name(x,y);

        System.out.println(z);

        char[] c = z.toCharArray();
        String op = "";

        for(int i=1; i<=c.length-1; i++){
            if(!op.contains(c[i] + ""))
                op = op + c[i];
        }
        System.out.println(c[0]+ op);


    }

    public static String name(String args, String arg2) {
        String a = null;
        a = args + arg2;


        return a ;




    }






}



