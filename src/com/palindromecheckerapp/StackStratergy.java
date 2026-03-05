package com.palindromecheckerapp;


/**
 * CLASS - StackStrategy
 *
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
	    public boolean check(String input) {
	        java.util.Stack<Character> stack = new java.util.Stack<>();
	        for (char c : input.toCharArray()) {
	            stack.push(c);
	        }
	        for (char c : input.toCharArray()) {
	            if (c != stack.pop()) {
	                return false;
	            }
	        }
	        return true;
	    }
	}