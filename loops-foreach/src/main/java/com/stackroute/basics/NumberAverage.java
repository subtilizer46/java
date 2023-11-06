package com.stackroute.basics;

import java.util.Arrays;
import java.util.Scanner;

public class NumberAverage {
    public static int[] inputArray;
    public static void main(String[] args) {
        NumberAverage numavg = new NumberAverage();
        numavg.getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter number of values:");
        int n = scan.nextInt();
        int[] inputArray=new int[n];
        //System.out.println("Enter the values:");
        for(int i=0; i<n; i++)
        {
            inputArray[i]=scan.nextInt();
        }
        String result=findAverage(inputArray);
        System.out.println(result);
    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        if (inputArray.length == 0) {
            return "Empty array";
        }

        int res=0;
        int avg=0;
        int n=0;
        for(int a : inputArray)
        {
            if (a <= 0) {
                return "Give proper positive integer values";
            }
            res=res+a;
            n++;
        }
        avg=res/n;
        return "The average value is: " + (int) avg;
    }
}
