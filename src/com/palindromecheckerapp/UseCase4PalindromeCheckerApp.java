package com.palindromecheckerapp;

/**
 * 
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */
public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
    	
    	System.out.println("Welcome to the Palindrome Checker App!");
		System.out.println("Version 1.0");
		System.out.println("System initialized successfully.");
		System.out.println("--------------------------------");

        String input = "radar";
        System.out.println("Input : " + input);

        // Convert the string into a character array.
        char[] chars = input.toCharArray();
       
        int start = 0;
        int end = chars.length - 1;

        // Assume it is a palindrome initially
        boolean isPalindrome = true;

        while (start < end) {
            // Compare characters at start and end.
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}