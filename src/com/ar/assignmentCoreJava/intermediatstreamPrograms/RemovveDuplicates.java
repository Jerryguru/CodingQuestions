package com.ar.assignmentCoreJava.intermediatstreamPrograms;

public class RemovveDuplicates {
    public static void main(String[] args){
        int arr[]={1,3,5,3,7,5,9,7};
        for (int i=0;i< arr.length;i++){
            boolean duplicate = false;
            for (int j =0 ;j< i;j++){
                if(arr[i]==arr[j]){
                    duplicate= true;
                    break;
                }
            }
            if (!duplicate){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
