/*
 * Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 */
package com.algorithmprogram;
import java.util.Scanner;  // import scanner class

public class FindPrimeNumber {
    //The Scanner class is used to get user input
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        // here we set max no = 1000
        System.out.println("Enter max number: ");

        String input = scanner.nextLine();
        int maxNumber = Integer.parseInt( input );

        System.out.print("\nList of the prime number between 0 - " + maxNumber+"\n");

        for (int num = 0; num <= maxNumber; num++) {
            boolean isPrime = true;

            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime == true )
                System.out.print(num+"\t");
        }
    }
}
