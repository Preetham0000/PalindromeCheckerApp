package com.palindromecheckerapp;

/**
 *
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * 
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Preetham
 * @version 3.0
 */

public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System!");
        System.out.println("Version 3.0");
        System.out.println("System initialized successfully.");
        System.out.println("------------------------------");

        String input = "level";
        System.out.println("Original: " + input);

        // Build the reversed string.
        String reversed = "";

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Reversed: " + reversed);

        // Compare original and reversed strings.
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
