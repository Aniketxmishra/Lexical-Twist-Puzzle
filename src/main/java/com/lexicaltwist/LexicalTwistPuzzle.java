package com.lexicaltwist;
import java.util.Arrays;
import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();
        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        if (word1.contains(" ") || word1.isEmpty()) {
            System.out.println(word1 + " is an invalid word");
            return;
        }
        if (word2.contains(" ") || word2.isEmpty()) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        String reversed = new StringBuilder(word1).reverse().toString();
        if (reversed.equalsIgnoreCase(word2)) {
            String transformed = reversed.toLowerCase().replaceAll("[aeiou]", "@");
            System.out.println(transformed);
        } else {
            String combined = (word1 + word2).toUpperCase();
            int vowels = 0, consonants = 0;
            for (char c : combined.toCharArray()) {
                if ("AEIOU".indexOf(c) >= 0) vowels++;
                else if (Character.isLetter(c)) consonants++;
            }
            System.out.println("Combined: " + combined);
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);

            char[] w1 = word1.toLowerCase().toCharArray();
            char[] w2 = word2.toLowerCase().toCharArray();
            Arrays.sort(w1);
            Arrays.sort(w2);
            if (Arrays.equals(w1, w2)) {
                System.out.println("The words are anagrams of each other");
            } else {
                System.out.println("The words are NOT anagrams of each other");
            }
        }
        scanner.close();
    }
}
