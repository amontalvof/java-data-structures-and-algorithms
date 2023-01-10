package montalvo.dsa.algorithms.search;

// Write a class called LinearSearch with a search method which accepts an array and a value, and returns the index at which the value exists. If the value does not exist in the array, return -1. Big O: O(n)

public class LinearSearch {

    public static <T> int search(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}

// Integer[] array1 = { 10, 15, 20, 25, 30 };
// Integer[] array2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
// Integer[] array3 = { 100 };
// Integer[] array4 = { 1, 2, 3, 4, 5 };
// Integer[] array5 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
// String[] array6 = { "John", "Paul", "George", "Ringo" };
// Character[] array7 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
// System.out.println(LinearSearch.search(array1, 15)); // 1
// System.out.println(LinearSearch.search(array2, 4)); // 5
// System.out.println(LinearSearch.search(array3, 100)); // 0
// System.out.println(LinearSearch.search(array4, 6)); // -1
// System.out.println(LinearSearch.search(array5, 10)); // -1
// System.out.println(LinearSearch.search(array6, "George")); // 2
// System.out.println(LinearSearch.search(array7, 'i')); // 8
