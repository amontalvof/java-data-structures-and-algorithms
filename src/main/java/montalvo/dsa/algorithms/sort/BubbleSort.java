package montalvo.dsa.algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// ? Write a class called BubbleSort with a sort method which accepts an array and sorts it using the bubble sort algorithm. Big O: O(n^2)

public class BubbleSort {
    public static List<Integer> sort(List<Integer> arr) {
        int n = arr.size();
        int temp = 0;
        boolean noSwaps;
        for (int i = n; i > 0; i--) {
            noSwaps = true;
            for (int j = 0; j < (i - 1); j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // swap elements
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    noSwaps = false;
                }
            }
            if (noSwaps) {
                break;
            }
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
        System.out.println("[46m****************** Bubble Sort ******************[0m");
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
