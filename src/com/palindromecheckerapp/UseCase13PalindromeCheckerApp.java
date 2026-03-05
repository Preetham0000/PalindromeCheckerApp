package com.palindromecheckerapp;

/**
 * 
 * MAIN CLASS - UseCase13PerformanceComparisonApp
 *
 *
 * Use Case 13: Performance Comparison
 * 
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * 
 * At this stage, the application :
 * - Uses a palindrome stratergy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays Benchmarking results
 * 
 * This use case focuses on purely on performance 
 * measurement and comparison algorithms.
 *
 *
 * @author Preetham
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";
        System.out.println("Input : " + input);

        // StackStrategy
        PalindromeStrategy stackStrategy = new StackStrategy();
        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.check(input);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        // DequeStrategy
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        long startDeque = System.nanoTime();
        boolean dequeResult = dequeStrategy.check(input);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        System.out.println("is Palindrome? : " + stackResult + "\n Execution Time = " + stackTime + " ns");
//        System.out.println("DequeStrategy: Result = " + dequeResult + ", Time = " + dequeTime + " ns");
    }
}



