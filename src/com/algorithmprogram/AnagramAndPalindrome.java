package com.algorithmprogram;
import java.util.ArrayList;
import java.util.Scanner;
public class AnagramAndPalindrome extends PrimeNumbers {
//method to find frequrency
    private void findFrequency(int number, int[] frequencyOfDigits) {
        while (number > 0) {
            int eachDigit = number % 10;
            frequencyOfDigits[eachDigit]++;
            number /= 10;
        }
    }
// method to check number is anagram or not
    public boolean checkIfAnagram(int firstNumber, int secondNumber) {

        int[] frequencyInA = new int[10];
        int[] frequencyInB = new int[10];

        findFrequency(firstNumber, frequencyInA);
        findFrequency(secondNumber, frequencyInB);

        for (int i = 0; i < 10; i++) {
            if (frequencyInA[i] != frequencyInB[i])
                return false;
        }
        return true;

    }
//check number is prime no or not
    public void checkIfPalindrome(ArrayList<Integer> listOfPrimes) {
        boolean foundPalindrome = false;
        for(int index = 0 ; index< listOfPrimes.size() ; index++) {
            foundPalindrome = false;
            int remainder, sum = 0;
            int number = listOfPrimes.get(index);
            while (number > 0) {
                remainder = number % 10; // getting remainder
                sum = (sum * 10) + remainder;
                number = number / 10;
            }
            if (listOfPrimes.contains(number))
                foundPalindrome = true;

            if(foundPalindrome) {
                System.out.println("Found Palindrome for: "+number);
            }
        }
        if(!foundPalindrome) {
            System.out.println("Did not find any Palindrome");
        }


    }
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);
        AnagramAndPalindrome primeNumbers = new AnagramAndPalindrome();
        ArrayList<Integer> primeNumbersArray = new ArrayList<Integer>();

        System.out.println("Enter the number to check if anagram exists: ");
        int userInput = scannerObject.nextInt();
        scannerObject.close();
 //check no is prime no or not
        for (int index = 2; index <= 1000; index++) {
            boolean isPrime = AnagramAndPalindrome.checkIfPrime(index);
            if (isPrime) {
                System.out.println(index);
                primeNumbersArray.add(index);
//check no is anagram or not
                boolean isAnagram = primeNumbers.checkIfAnagram(index, userInput);
                if (isAnagram)
                    System.out.println(index + " is an Anagram");

            }
        }
        // check number is palindrome or not
        primeNumbers.checkIfPalindrome(primeNumbersArray);
    }
}

