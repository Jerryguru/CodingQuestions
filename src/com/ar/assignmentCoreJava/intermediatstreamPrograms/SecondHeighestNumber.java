package com.ar.assignmentCoreJava.intermediatstreamPrograms;

public class SecondHeighestNumber {
    public static void main(String[] args){
        int arr[]={14,56,32,24,76,89,65};
        int highest= Integer.MIN_VALUE;
        int SecondHeighest = Integer.MIN_VALUE;
        for (int num : arr){
            if(num> highest){
                SecondHeighest = highest;
                highest= num;
            }else if (num > SecondHeighest && num!= highest){
                SecondHeighest = num;
            }
            System.out.println("SecondHeighest Num IS: "+SecondHeighest);
    }
}}



































/*
*public class SecondHighestArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 15, 40, 35};

        // Find highest number
        int highest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        // Find second highest number
        int secondHighest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondHighest && arr[i] < highest) {
                secondHighest = arr[i];
            }
        }

        System.out.println("Second Highest: " + secondHighest);
    }
}
*
*
*
*
*
*
* */

