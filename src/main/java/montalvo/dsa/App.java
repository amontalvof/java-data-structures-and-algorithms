package montalvo.dsa;

import montalvo.dsa.dataStructures.linkedLists.single.SingleLinkedList;

public class App {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<>();
        list.push("Lorem");
        list.push("ipsum");
        list.push("dolor");
        System.out.print("\033[H\033[2J");
        System.out.println(list);
        System.out.println(list.reverse());
    }
}
