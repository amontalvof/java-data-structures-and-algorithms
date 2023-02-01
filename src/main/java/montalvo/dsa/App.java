package montalvo.dsa;

import montalvo.dsa.dataStructures.queues.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> list = new Queue<>();
        list.enqueue("Lorem");
        list.enqueue("ipsum");
        list.enqueue("dolor");
        System.out.print("\033[H\033[2J");
        System.out.println(list);
        System.out.println(list.getSize());
        System.out.println(list.dequeue());
        System.out.println(list.dequeue());
        System.out.println(list);
        System.out.println(list.getSize());
        System.out.println(list.dequeue());
        System.out.println(list);
        System.out.println(list.getSize());
        System.out.println(list.dequeue());
        System.out.println(list);
        System.out.println(list.getSize());
    }
}
