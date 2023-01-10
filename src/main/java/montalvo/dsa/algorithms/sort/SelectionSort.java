package montalvo.dsa.algorithms.sort;

// Write a class called SelectionSort with a sort method which accepts an array and sorts it using the selection sort algorithm. Big O: O(n^2)

public class SelectionSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lowest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowest]) {
                    lowest = j;
                }
            }
            if (i != lowest) {
                int temp = arr[i];
                arr[i] = arr[lowest];
                arr[lowest] = temp;
            }
        }
        return arr;
    }
}

// int[] arr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43, -3 };
// int[] sortedArr = SelectionSort.sort(arr);
// System.out.println(Arrays.toString(sortedArr));
