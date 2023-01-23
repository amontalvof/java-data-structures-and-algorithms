package montalvo.dsa;

import montalvo.dsa.dataStructures.linkedLists.single.SingleLinkedList;

public class App {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<String>();
        System.out.println(list);
        list.push("Hello");
        System.out.println(list);
        list.push("World");
        System.out.println(list);
    }
}
