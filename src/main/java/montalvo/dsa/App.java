package montalvo.dsa;

import montalvo.dsa.dataStructures.linkedLists.doubly.DoublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.push("Lorem");
        list.push("ipsum");
        list.push("dolor");
        list.push("hello");
        list.push("world");
        System.out.print("\033[H\033[2J");
        System.out.println(list);
        System.out.println(list.remove(4));
        System.out.println(list);
    }
}
