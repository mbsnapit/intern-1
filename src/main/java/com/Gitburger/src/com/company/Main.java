package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //creating a variable
        Integer n = 0;


        //Create a new array
        int[] FuzzyArray = new int[8];

        //inserting values into array
        FuzzyArray[0] = 52;
        FuzzyArray[1] = 82;
        FuzzyArray[2] = 100;
        FuzzyArray[3] = 22;
        FuzzyArray[4] = 7;
        FuzzyArray[5] = 69;
        FuzzyArray[6] = 25;
        FuzzyArray[7] = 9;


         //finding min of two values in array
        int min0 = Math.min(FuzzyArray[0],FuzzyArray[1]);
        int min1 = Math.min(FuzzyArray[2],FuzzyArray[3]);
        int min2 = Math.min(FuzzyArray[4],FuzzyArray[5]);
        int min3 = Math.min(FuzzyArray[6],FuzzyArray[7]);

        //finding min of two mins
        int min4 = Math.min(min2,min3);
        int min5 = Math.min(min0,min1);
        int minnie = Math.min(min4,min5);

        //finding max of two values in array
        int max0 = Math.max(FuzzyArray[0],FuzzyArray[1]);
        int max1 = Math.max(FuzzyArray[2],FuzzyArray[3]);
        int max2 = Math.max(FuzzyArray[4],FuzzyArray[5]);
        int max3 = Math.max(FuzzyArray[6],FuzzyArray[7]);

        //finding min of two max's
        int max4 = Math.max(max2, max3);
        int max5 = Math.max(max0,max1);
        int maxxie = Math.max(max4,max5);

        //finding difference between min and max
        int bigdiff = maxxie - minnie;
                System.out.print(bigdiff);





    }
}
