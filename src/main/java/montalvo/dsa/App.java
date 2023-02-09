package montalvo.dsa;

import montalvo.dsa.dataStructures.hashTables.HashTable;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        HashTable hashTable = new HashTable(17);
        hashTable.set("maroon", "#800000");
        hashTable.set("yellow", "#FFFF00");
        hashTable.set("olive", "#808000");
        hashTable.set("salmon", "#FA8072");
        hashTable.set("lightcoral", "#F08080");
        hashTable.set("mediumvioletred", "#C71585");
        hashTable.set("plum", "#DDA0DD");
        hashTable.set("plum", "#0000FF");
        hashTable.set("purple", "#DDA0DD");
        hashTable.set("violet", "#DDA0DD");
        System.out.println(hashTable.get("plum"));
        System.out.println(hashTable.keys());
        System.out.println(hashTable.values());
    }

}
