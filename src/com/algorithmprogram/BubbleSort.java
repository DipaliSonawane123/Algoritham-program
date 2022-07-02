/*
  * a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
 * b. I/P -> read in the list ints
 * c. O/P -> Print the Sorted List
 */
package com.algorithmprogram;
import java.util.Arrays;
class BubbleSort {
    // method  bubblesort this is parameterized method
    static void bubbleSort(int array[]) {
        int size = array.length;
        //  loop to access each array element
        for (int i = 0; i < size - 1; i++)
            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void main(String args[]) {
        int[] data = { -2, 45, 0, 11, -9 };
        System.out.println("Array Before Sorting");
        System.out.println(Arrays.toString(data));
        BubbleSort.bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}

