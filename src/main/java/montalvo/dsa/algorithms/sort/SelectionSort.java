package montalvo.dsa.algorithms.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// ? Write a class called SelectionSort with a sort method which accepts an array and sorts it using the selection sort algorithm. Big O: O(n^2)
public class SelectionSort {
    public static List<Integer> sort(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int lowest = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(lowest)) {
                    lowest = j;
                }
            }
            if (i != lowest) {
                int temp = arr.get(i);
                arr.set(i, arr.get(lowest));
                arr.set(lowest, temp);
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
        System.out.println("[46m****************** Selection Sort ******************[0m");
        System.out.println("result: " + result);
        System.out.println("Elapsed time in seconds: " + elapsedTimeInSecond);
    }

    private static List<Integer> generateRandomList() {
        // List<Integer> list = Arrays.asList(45, 23, 11, 89, 77, 98, 4, 28, 65, -43);
        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(rand.nextInt(1000) + 1);
        }
        return list;
    }
}
