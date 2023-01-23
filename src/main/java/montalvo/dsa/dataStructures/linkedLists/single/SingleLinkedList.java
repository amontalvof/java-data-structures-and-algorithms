package montalvo.dsa.dataStructures.linkedLists.single;

public class SingleLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public SingleLinkedList<T> push(T val) {
        Node<T> newNode = new Node<T>(val);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.length++;
        return this;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "List is empty";
        } else {
            Node<T> current = this.head;
            String list = "";
            while (current != null) {
                list += current.getValue() + " -> ";
                current = current.getNext();
            }
            return list;
        }
    }

    public Node<T> getHead() {
        return this.head;
    }

    private void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return this.tail;
    }

    private void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getLength() {
        return this.length;
    }

    private void setLength(int length) {
        this.length = length;
    }

}
