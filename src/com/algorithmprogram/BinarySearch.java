/*
 * Binary Search the Word from Word List
 * a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
 *    search the list. The program reports if the search word is found in the list.
 * b. I/P -> read in the list words comma separated from a File and then enter the word
 *    to be searched
 * c. Logic -> Use Arrays to sort the word list and then do the binary search
 * d. O/P -> Print the result if the word is found or not
  */
package com.algorithmprogram;
import java.util.Arrays;  // import array class
import java.util.Scanner; //import scanner class
 public class BinarySearch {
     //method  binarySearch
     public int binarySearch(String[] wordList, String searchName) {
         int start = 0, length = wordList.length - 1;

         while (start <= length) {
             int middle = start + (length - start) / 2;
             int result = searchName.compareTo(wordList[middle]);

             if (result == 0)
                 return middle;

             if (result > 0)
                 start = middle + 1;
             else
                 length = middle - 1;
         }
         return -1;
     }

    public static void main(String[] args) {
        BinarySearch binaryObj = new BinarySearch();

        Scanner scanner = new Scanner(System.in);
        // create array list
        String[] wordList = {"dipali", "dipti", "rupali", "komal", "bhavesh","harshal"};
        // array list is ascending order
        Arrays.sort(wordList);
        System.out.println("List of Words :");
        System.out.println(Arrays.toString(wordList));
        System.out.println("Enter the word you want to search");
        String searchName = scanner.nextLine();
        scanner.close();
        int result = binaryObj.binarySearch(wordList, searchName);

        if (result == -1) //word is found
            System.out.println("word is found at "
                    + "index " + result);
        else
            System.out.println("word is not present in the list");

    }


}