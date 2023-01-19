package montalvo.dsa.algorithms.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// ? Write a class called MergeSort with a sort method which accepts an array and sorts it using the merge sort algorithm. Big O: O(n log n)
public class MergeSort {

    private static List<Integer> merge(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> results = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr2.get(j) > arr1.get(i)) {
                results.add(arr1.get(i));
                i++;
            } else {
                results.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            results.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            results.add(arr2.get(j));
            j++;
        }
        return results;
    }

    public static List<Integer> sort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }
        int mid = arr.size() / 2;
        List<Integer> left = sort(arr.subList(0, mid));
        List<Integer> right = sort(arr.subList(mid, arr.size()));
        return merge(left, right);
    }

    public static void main(String[] args) {
        List<Integer> list = generateRandomList();
        System.out.print("\033[H\033[2J");
        System.out.println("list: " + list);
        long start = System.nanoTime();
        List<Integer> result = sort(list);
        long end = System.nanoTime();
        double elapsedTimeInSecond = (end - start) / 1_000_000_000.0;
        System.out.println("[46m****************** Merge Sort ******************[0m");
        System.out.println("result: " + result);
        System.out.println("Elapsed time in seconds: " + elapsedTimeInSecond);
    }

    private static List<Integer> generateRandomList() {
        // List<Integer> list = Arrays.asList(10, 24, 76, 73, 72, 1, 9);
        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(rand.nextInt(1000) + 1);
        }
        return list;
    }
}
