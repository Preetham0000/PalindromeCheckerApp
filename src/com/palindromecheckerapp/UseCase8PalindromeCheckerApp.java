package com.palindromecheckerapp;

import java.util.LinkedList;

/**
 * 
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * 
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 * 
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Preetham
 * @version 8.0
 */
public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

  
        String input = "level";
        System.out.println("Input : " + input);

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            char front = list.removeFirst();
            char back = list.removeLast();

            if (front != back) {
                isPalindrome = false;
                break;
            }
        }

    
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}