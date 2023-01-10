package montalvo.dsa.algorithms.sort;

// Write a class called BubbleSort with a sort method which accepts an array and sorts it using the bubble sort algorithm. Big O: O(n^2)

public class BubbleSort {
    public static int[] sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean noSwaps;
        for (int i = n; i > 0; i--) {
            noSwaps = true;
            for (int j = 0; j < (i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    noSwaps = false;
                }
            }
            if (noSwaps) {
                break;
            }
        }
        return arr;
    }
}

// int[] arr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43, -3 };
// int[] sortedArr = BubbleSort.sort(arr);
// System.out.println(Arrays.toString(sortedArr));
