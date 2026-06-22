package com.ar.assignmentCoreJava.intermediatstreamPrograms;

import java.util.Arrays;

public class MergTwoNumbers {
    public static void main(String[] args){
        int[] arr1 = {11, 21, 31,41,51};
        int[] arr2 = {61,71,81,91,101};
        int[] merged = new int[arr1.length + arr2.length];


        int k = 0;
        for (int i = 0; i < arr1.length; i++) {merged[k++] = arr1[i];
        }
         for (int i = 0; i < arr2.length; i++) {merged[k++] = arr2[i];
        }

        System.out.println(Arrays.toString(merged));


    }
}



























/*
* System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        System.out.println(Arrays.toString(merged));*/