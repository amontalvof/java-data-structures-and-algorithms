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

    // returns true if list is empty
    public boolean isEmpty() {
        return this.length == 0;
    }

    // reverses the list and returns it
    public SingleLinkedList<T> reverse() {
        Node<T> node = this.head;
        this.head = this.tail;
        this.tail = node;
        Node<T> next = null;
        Node<T> prev = null;
        for (int i = 0; i < this.length; i++) {
            next = node.getNext();
            node.setNext(prev);
            prev = node;
            node = next;
        }
        return this;
    }

    // removes a node at the specified index and returns it
    public Node<T> remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        if (index == 0) {
            return this.shift();
        }
        if (index == this.length - 1) {
            return this.pop();
        }
        Node<T> prev = this.get(index - 1);
        Node<T> removed = prev.getNext();
        prev.setNext(removed.getNext());
        this.length--;
        return removed;
    }

    // inserts a new node at the specified index and returns the list
    public SingleLinkedList<T> insert(int index, T value) {
        if (index < 0 || index > this.length) {
            return this;
        }
        if (index == this.length) {
            return this.push(value);
        }
        if (index == 0) {
            return this.unshift(value);
        }
        Node<T> newNode = new Node<T>(value);
        Node<T> prev = this.get(index - 1);
        Node<T> temp = prev.getNext();
        prev.setNext(newNode);
        newNode.setNext(temp);
        this.length++;
        return this;
    }

    // set a new value to a specified node by index
    public Node<T> set(int index, T value) {
        Node<T> foundNode = this.get(index);
        if (foundNode != null) {
            foundNode.setValue(value);
            return foundNode;
        }
        return null;
    }

    // returns the node at the specified index
    public Node<T> get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        int counter = 0;
        Node<T> current = this.head;
        while (counter != index) {
            current = current.getNext();
            counter++;
        }
        return current;
    }

    // adds a new node to the beginning of the list and returns the list
    public SingleLinkedList<T> unshift(T val) {
        Node<T> newNode = new Node<T>(val);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.length++;
        return this;
    }

    // removes the first node in the list and returns it
    public Node<T> shift() {
        if (this.head == null) {
            return null;
        }
        Node<T> currentHead = this.head;
        this.head = currentHead.getNext();
        this.length--;
        if (this.length == 0) {
            this.tail = null;
        }
        return currentHead;
    }

    // adds a new node to the end of the list and returns the list
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

    // removes the last node in the list and returns it
    public Node<T> pop() {
        if (this.head == null) {
            return null;
        }
        Node<T> current = this.head;
        Node<T> newTail = current;
        while (current.getNext() != null) {
            newTail = current;
            current = current.getNext();
        }
        this.tail = newTail;
        this.tail.setNext(null);
        this.length--;
        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return current;
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

    public Node<T> getTail() {
        return this.tail;
    }

    public int getLength() {
        return this.length;
    }

}
