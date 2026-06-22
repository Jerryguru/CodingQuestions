package com.ar.assignmentCoreJava.intermediatstreamPrograms;

public class MaxMin {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60,70};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]< min){
                min =arr[i];
            }
        }
        System.out.println("Max Value = "+max);
        System.out.println("Min Value ="+min);
    }
}
