package montalvo.dsa;

import montalvo.dsa.dataStructures.trees.binaryHeap.MaxBinaryHeap;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        MaxBinaryHeap<Integer> heap = new MaxBinaryHeap<>();
        heap.insert(41);
        heap.insert(39);
        heap.insert(33);
        heap.insert(18);
        heap.insert(27);
        heap.insert(12);
        heap.insert(55);
        System.out.println(heap);
        System.out.println(heap.extractMax());
        System.out.println(heap);
        System.out.println(heap.extractMax());
        System.out.println(heap);
        System.out.println(heap.extractMax());
        System.out.println(heap);
        System.out.println(heap.extractMax());
        System.out.println(heap);
        System.out.println(heap.extractMax());
        System.out.println(heap);
        System.out.println(heap.extractMax());
        System.out.println(heap);
        System.out.println(heap.extractMax());
        System.out.println(heap);
        System.out.println(heap.extractMax());
    }
}
