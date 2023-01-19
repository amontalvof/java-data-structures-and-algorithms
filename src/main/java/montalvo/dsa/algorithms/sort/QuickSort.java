package montalvo.dsa.algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// ? Write a class called QuickSort with a sort method which accepts an array and sorts it using the quick sort algorithm. Big O: O(n log n)
public class QuickSort {
    private static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    private static int pivot(List<Integer> arr, int... limits) {
        int start = limits.length == 0 ? 0 : limits[0];
        int end = limits.length == 0 ? arr.size() - 1 : limits[1];
        int pivot = arr.get(start);
        int swapIdx = start;
        for (int i = start + 1; i <= end; i++) {
            if (pivot > arr.get(i)) {
                swapIdx++;
                swap(arr, swapIdx, i);
            }
        }
        swap(arr, start, swapIdx);
        return swapIdx;
    }

    public static List<Integer> sort(List<Integer> arr, int... sides) {
        int left = sides.length == 0 ? 0 : sides[0];
        int right = sides.length == 0 ? arr.size() - 1 : sides[1];
        if (left < right) {
            int pivotIndex = pivot(arr, left, right);
            // left
            sort(arr, left, pivotIndex - 1);
            // right
            sort(arr, pivotIndex + 1, right);
        }
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> list = generateRandomList();
        System.out.print("\033[H\033[2J");
        System.out.println("list: " + list);
        long start = System.nanoTime();
        List<Integer> result = sort(list);
        long end = System.nanoTime();
        double elapsedTimeInSecond = (end - start) / 1_000_000_000.0;
        System.out.println("[46m****************** Quick Sort ******************[0m");
        System.out.println("result: " + result);
        System.out.println("Elapsed time in seconds: " + elapsedTimeInSecond);
    }

    private static List<Integer> generateRandomList() {
        // List<Integer> list = Arrays.asList(100, -3, 2, 4, 6, 9, 1, 2, 5, 3, 23);
        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(rand.nextInt(1000) + 1);
        }
        return list;
    }
}
