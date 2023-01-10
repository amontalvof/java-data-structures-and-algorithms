package montalvo.dsa.algorithms.search;

// Write a class called NaiveStringSearch with a search method which accepts a long string and a short string and returns how many times the short string appears in the long string. Assume the short string is always shorter than the long string.

public class NaiveStringSearch {

    public static int search(String longStr, String shortStr) {
        int count = 0;
        for (int i = 0; i < longStr.length(); i++) {
            for (int j = 0; j < shortStr.length(); j++) {
                if (shortStr.charAt(j) != longStr.charAt(i + j)) {
                    break;
                }
                if (j == shortStr.length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }

}

// int count = NaiveStringSearch.search("lorie loled", "lo");
// System.out.println(count); // 2
