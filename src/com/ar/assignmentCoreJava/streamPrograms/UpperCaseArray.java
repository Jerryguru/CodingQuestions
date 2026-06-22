package com.ar.assignmentCoreJava.streamPrograms;

public class UpperCaseArray {
    public static void main(String[] args){
        String arr[]={"java","spring","frameworks","sql","microservices"};
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i].toUpperCase());
        }
    }
}
