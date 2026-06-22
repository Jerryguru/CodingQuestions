package com.ar.assignmentCoreJava.intermediatstreamPrograms;

public class AscendingDesingOrder {
    public static void main(String[] args){
        int arr[]={6,3,8,4,9,7,1,2};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for (int num : arr){
            System.out.println(num +" ");
        }
    }
}
