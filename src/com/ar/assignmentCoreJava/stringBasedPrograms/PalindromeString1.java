package com.ar.assignmentCoreJava.stringBasedPrograms;

public class PalindromeString1 {
    public static void main(String[] args) {
        String str = "MADAM";
        String reverse =
                new StringBuilder(str)
                        .reverse()
                        .toString();
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
