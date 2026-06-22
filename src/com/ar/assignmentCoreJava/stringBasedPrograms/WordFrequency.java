package com.ar.assignmentCoreJava.stringBasedPrograms;

public class WordFrequency {
    public static void main(String[] args) {

        String str = "java is easy java is powerful AND JAVA IS POWERFULL FOR ALL ";

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            int count = 1;
            // Already counted word skip
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (words[i].equals(words[k])) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            System.out.println(words[i] + " = " + count);
        }
    }
}
