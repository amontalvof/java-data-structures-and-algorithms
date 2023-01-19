package montalvo.dsa.algorithms.search;

import java.util.Arrays;
import java.util.List;

// ? Write a class called LinearSearch with a search method which accepts an array and a value, and returns the index at which the value exists. If the value does not exist in the array, return -1. Big O: O(n)
public class LinearSearch {
    public static <T> int search(List<T> array, T value) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> intList = generateIntRandomList();
        List<String> strList = generateStringRandomList();
        int result1 = search(intList, 10); // 2
        int result2 = search(intList, 95); // 16
        int result3 = search(intList, 100); // -1
        int result4 = search(strList, "George"); // 2
        System.out.print("\033[H\033[2J");
        System.out.println("index 1: " + result1);
        System.out.println("index 2: " + result2);
        System.out.println("index 3: " + result3);
        System.out.println("index 4: " + result4);

    }

    private static List<Integer> generateIntRandomList() {
        List<Integer> list = Arrays.asList(5, 6, 10, 13, 14, 18, 30, 34, 35, 37,
                40, 44, 64, 79, 84, 86, 95, 96, 98, 99);
        return list;
    }

    private static List<String> generateStringRandomList() {
        List<String> list = Arrays.asList("John", "Paul", "George", "Ringo");
        return list;
    }

}
