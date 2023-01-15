package montalvo.dsa.algorithms.search;

import java.util.Arrays;
import java.util.List;

// Write a class called BinarySearch with a search method which accepts a sorted array and a value and returns the index at which the value exists. Otherwise, return -1. Big O: O(log n)
public class BinarySearch {
    public static int search(List<Integer> arr, int elem) {
        int start = 0;
        int end = arr.size() - 1;
        int middle = (start + end) / 2;

        while (arr.get(middle) != elem && start <= end) {
            if (elem < arr.get(middle)) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }

        if (arr.get(middle) == elem) {
            return middle;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = generateRandomList();
        int result1 = search(list, 10); // 2
        int result2 = search(list, 95); // 16
        int result3 = search(list, 100); // -1
        System.out.print("\033[H\033[2J");
        System.out.println("index 1: " + result1);
        System.out.println("index 2: " + result2);
        System.out.println("index 3: " + result3);
    }

    private static List<Integer> generateRandomList() {
        List<Integer> list = Arrays.asList(5, 6, 10, 13, 14, 18, 30, 34, 35, 37,
                40, 44, 64, 79, 84, 86, 95, 96, 98, 99);
        return list;
    }
}
