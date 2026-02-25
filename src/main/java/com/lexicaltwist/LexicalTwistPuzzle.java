package com.lexicaltwist;
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

        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
        scanner.close();
    }
}
