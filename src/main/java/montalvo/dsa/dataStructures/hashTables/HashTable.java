package montalvo.dsa.dataStructures.hashTables;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
    private List<String[]>[] keyMap;

    // Always use prime numbers for the size of the array, reduces the chance of
    // collisions
    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.keyMap = new List[size];
    }

    // method to hash a key
    private int hash(String key) {
        int total = 0;
        int WEIRD_PRIME = 31;
        for (int i = 0; i < Math.min(key.length(), 100); i++) {
            int value = key.charAt(i) - 96;
            total = (total * WEIRD_PRIME + value) % this.keyMap.length;
        }
        return total;
    }

    // method to set a key-value pair
    public void set(String key, String value) {
        int index = hash(key);
        if (this.keyMap[index] == null) {
            List<String[]> list = new ArrayList<>();
            this.keyMap[index] = list;
        }
        String[] pair = { key, value };
        this.keyMap[index].add(pair);
    }

    // method to get a value by key
    public String get(String key) {
        int index = hash(key);
        if (this.keyMap[index] != null) {
            for (int i = 0; i < this.keyMap[index].size(); i++) {
                if (this.keyMap[index].get(i)[0] == key) {
                    return this.keyMap[index].get(i)[1];
                }
            }
        }
        return null;
    }

    // method to get all the unique values
    public List<String> values() {
        List<String> valuesArr = new ArrayList<>();
        for (int i = 0; i < this.keyMap.length; i++) {
            if (this.keyMap[i] != null) {
                for (int j = 0; j < this.keyMap[i].size(); j++) {
                    String value = this.keyMap[i].get(j)[1];
                    if (!valuesArr.contains(value)) {
                        valuesArr.add(value);
                    }
                }
            }
        }
        return valuesArr;
    }

    // method to get all the unique keys
    public List<String> keys() {
        List<String> keysArr = new ArrayList<>();
        for (int i = 0; i < this.keyMap.length; i++) {
            if (this.keyMap[i] != null) {
                for (int j = 0; j < this.keyMap[i].size(); j++) {
                    String value = this.keyMap[i].get(j)[0];
                    if (!keysArr.contains(value)) {
                        keysArr.add(value);
                    }
                }
            }
        }
        return keysArr;
    }
}
