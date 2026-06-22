package com.ar.assignmentCoreJava.stringBasedPrograms;

public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "JERRYPARAMESHYADHAV";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            // Already counted character skip
            if (str.indexOf(ch) != i) {continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {count++;
                }
            }
            System.out.println(ch + " = " + count);
        }
    }
}