package montalvo.dsa;

import montalvo.dsa.dataStructures.trees.BinarySearchTree;

public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(13);
        tree.insert(2);
        tree.insert(7);
        tree.insert(11);
        tree.insert(16);
        tree.insert(13);
        System.out.print("\033[H\033[2J");
        System.out.println(tree.find(55));
        System.out.println(tree);
    }
}
