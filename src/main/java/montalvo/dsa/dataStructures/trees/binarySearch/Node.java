package montalvo.dsa.dataStructures.trees.binarySearch;

public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        String left = this.left == null ? "null" : this.left.getValue().toString();
        String right = this.right == null ? "null" : this.right.getValue().toString();
        return "{" +
                " value='" + getValue() + "'" +
                ", left='" + left + "'" +
                ", right='" + right + "'" +
                "}";
    }

}
