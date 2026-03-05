package com.palindromecheckerapp;

/**
 *
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 *
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 *
 * @author Preetham
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        System.out.println("Input : " + input);

      
        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }	

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}