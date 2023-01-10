package montalvo.dsa.algorithms.sort;

// Write a class called InsertionSort with a sort method which accepts an array and sorts it using the insertion sort algorithm. Big O: O(n^2)

public class InsertionSort {
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentVal = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentVal) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentVal;

        }
        return arr;
    }
}

// int[] arr = { 2, 1, 9, 76, 4 };
// int[] sortedArr = InsertionSort.sort(arr);
// System.out.println(Arrays.toString(sortedArr));
