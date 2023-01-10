package montalvo.dsa.algorithms.search;

// Write a class called BinarySearch with a search method which accepts a sorted array and a value and returns the index at which the value exists. Otherwise, return -1. Big O: O(log n)

public class BinarySearch {

    public static int search(int[] arr, int elem) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;

        while (arr[middle] != elem && start <= end) {
            if (elem < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        }

        if (arr[middle] == elem) {
            return middle;
        }
        return -1;
    }

}

// int[] array1 = { 1, 2, 3, 4, 5 };
// int[] array2 = { 5, 6, 10, 13, 14, 18, 30, 34, 35, 37,
// 40, 44, 64, 79, 84, 86, 95, 96, 98, 99
// };
// System.out.println(BinarySearch.search(array1, 2)); // 1
// System.out.println(BinarySearch.search(array1, 3)); // 2
// System.out.println(BinarySearch.search(array1, 5)); // 4
// System.out.println(BinarySearch.search(array1, 6)); // -1
// System.out.println(BinarySearch.search(array2, 10)); // 2
// System.out.println(BinarySearch.search(array2, 95)); // 16
// System.out.println(BinarySearch.search(array2, 100)); // -1
