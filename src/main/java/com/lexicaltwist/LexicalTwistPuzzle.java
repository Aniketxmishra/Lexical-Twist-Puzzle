package com.lexicaltwist;
import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = scanner.next();
        System.out.print("Enter second word: ");
        String word2 = scanner.next();
        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
        scanner.close();
    }
}
