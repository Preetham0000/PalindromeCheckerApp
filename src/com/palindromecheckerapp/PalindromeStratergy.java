package com.palindromecheckerapp;
/**
 * INTERFACE - PalindromeStrategy
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */
interface PalindromeStrategy {
    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    boolean check(String input);
}