package montalvo.dsa.examples;

import java.util.Arrays;

import montalvo.dsa.algorithms.sort.InsertionSort;

public class App {
    public static void main(String[] args) {
        int[] arr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43, -3 };
        int[] sortedArr = InsertionSort.sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
