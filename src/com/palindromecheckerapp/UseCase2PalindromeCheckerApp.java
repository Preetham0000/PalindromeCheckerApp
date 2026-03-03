package com.palindromecheckerapp;

/**
 * 
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * @author Preetham
 * @version 2.0
 */

public class UseCase2PalindromeCheckerApp {
 /**
  * Application entry point for UC2.
  *
  * @param args Command-line arguments
  */
 public static void main(String[] args) {
	 
	 
	System.out.println("Welcome to the Palindrome Checker Management System!");
	System.out.println("Version 1.0");
	System.out.println("System initialized successfully.");
	System.out.println("------------------------------");

     String input = "madam";
     System.out.println("I/p text: " + input);

     boolean isPalindrome = true;

     for (int i = 0; i < input.length() / 2; i++) {
         if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
             isPalindrome = false;
             break;
         }
     }

     System.out.println("Is it a Palindrome? " + isPalindrome);
 }
}

