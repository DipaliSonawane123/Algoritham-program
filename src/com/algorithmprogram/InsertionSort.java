/*
 * a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
 * b. I/P -> read in the list words
 * c. Logic -> Use Insertion Sort to sort the words in the String array
 * d. O/P -> Print the Sorted List
 */
package com.algorithmprogram;

public class InsertionSort {
    public String[] sort(String array[]) {

        String temp = " ";
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    //main method
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        // create array list
        String[] array = {"dip", "dipa", "dipal", "dipali", "dipalis", "dipaliso", "dipalison", "dipalisona"};

        System.out.println("Before Insertion Sort");

        for (int i = 0; i < array.length; i++) {
            System.out.print("   " + array[i]);
        }
        System.out.println();

        System.out.println("After Insertion Sort");

        String[] sortedArray = insertionSort.sort(array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print("   " + sortedArray[i]);
        }
    }
}

