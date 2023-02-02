package montalvo.dsa.dataStructures.trees;

public class BinarySearchTree<T extends Number> {
    private Node<T> root;

    public BinarySearchTree() {
        root = null;
    }

    // find a node in the tree and return it
    public Node<T> find(T value) {
        if (this.root == null) {
            return null;
        }
        Node<T> current = this.root;
        while (!(current == null)) {
            if (this.compare(value, current.getValue()) == -1) {
                current = current.getLeft();
            } else if (this.compare(value, current.getValue()) == 1) {
                current = current.getRight();
            } else {
                break;
            }
        }
        return current;
    }

    // insert a new node into the tree, ignoring duplicates and return the tree
    public BinarySearchTree<T> insert(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.root == null) {
            this.root = newNode;
            return this;
        } else {
            Node<T> current = this.root;
            while (true) {
                if (this.compare(value, current.getValue()) == -1) {
                    if (current.getLeft() == null) {
                        current.setLeft(newNode);
                        return this;
                    } else {
                        current = current.getLeft();
                    }
                } else if (this.compare(value, current.getValue()) == 1) {
                    if (current.getRight() == null) {
                        current.setRight(newNode);
                        return this;
                    } else {
                        current = current.getRight();
                    }
                } else {
                    return null;
                }
            }
        }
    }

    // compare two numbers and return -1 if first is less than second, 1 if first is
    // greater than second, and 0 if they are equal
    private int compare(T first, T second) {
        double firstValue = first.doubleValue();
        double secondValue = second.doubleValue();
        if (firstValue < secondValue) {
            return -1;
        } else if (firstValue > secondValue) {
            return 1;
        } else {
            return 0;
        }
    }

    public Node<T> getRoot() {
        return this.root;
    }

}
