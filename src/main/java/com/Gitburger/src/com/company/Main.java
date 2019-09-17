package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //creating a variable
        Integer n = 0;


        //Creating a random method
        //Random rand = new Random();

        //Assigning variable with random number
        //n = 8; //rand.nextInt(25);

        //Creating new string array with length of n
        int[] FuzzyArray = new int[8];

        FuzzyArray[0] = 52;
        FuzzyArray[1] = 82;
        FuzzyArray[2] = 100;
        FuzzyArray[3] = 22;
        FuzzyArray[4] = 7;
        FuzzyArray[5] = 69;
        FuzzyArray[6] = 25;
        FuzzyArray[7] = 9;



        int min0 = Math.min(FuzzyArray[0],FuzzyArray[1]);
        int min1 = Math.min(FuzzyArray[2],FuzzyArray[3]);
        int min2 = Math.min(FuzzyArray[4],FuzzyArray[5]);
        int min3 = Math.min(FuzzyArray[6],FuzzyArray[7]);
        int min4 = Math.min(min2,min3);
        int min5 = Math.min(min0,min1);
        int minnie = Math.min(min4,min5);

        int max0 = Math.max(FuzzyArray[0],FuzzyArray[1]);
        int max1 = Math.max(FuzzyArray[2],FuzzyArray[3]);
        int max2 = Math.max(FuzzyArray[4],FuzzyArray[5]);
        int max3 = Math.max(FuzzyArray[6],FuzzyArray[7]);
        int max4 = Math.max(max2, max3);
        int max5 = Math.max(max0,max1);
        int maxxie = Math.max(max4,max5);

        int bigdiff = maxxie - minnie;
                System.out.print(bigdiff);


//        int i;
//        for(i = 0; i < n; ++i){
//
//            FuzzyArray[i] = String.valueOf(i);
//            //System.out.print( FuzzyArray[i] + " ");


           //int min = i;
        //int max = i;

          //    min = Math.min(min, n);
            //  max = Math.max(max, n);

            // System.out.print(min + "  "+ max);


    }
}
