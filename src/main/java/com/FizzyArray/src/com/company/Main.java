package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //creating a variable
        Integer n = 0;

        //Creating new string array with length of 20

        Random rand = new Random();
        n = rand.nextInt(25);

        String[] FizzyArray = new String[n];


        int i;
        for(i = 0; i < n; i++){

            FizzyArray[i] = String.valueOf(i);
            System.out.print( FizzyArray[i] + " ");


        }




    }
}
