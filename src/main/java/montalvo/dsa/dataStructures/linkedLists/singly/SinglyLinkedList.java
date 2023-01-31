package montalvo.dsa.dataStructures.linkedLists.singly;

public class SinglyLinkedList<T> {
    private SinglyNode<T> head;
    private SinglyNode<T> tail;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // returns true if list is empty
    public boolean isEmpty() {
        return this.length == 0;
    }

    // reverses the list and returns it
    public SinglyLinkedList<T> reverse() {
        SinglyNode<T> singlyNode = this.head;
        this.head = this.tail;
        this.tail = singlyNode;
        SinglyNode<T> next = null;
        SinglyNode<T> prev = null;
        for (int i = 0; i < this.length; i++) {
            next = singlyNode.getNext();
            singlyNode.setNext(prev);
            prev = singlyNode;
            singlyNode = next;
        }
        return this;
    }

    // removes a singlyNode at the specified index and returns it
    public SinglyNode<T> remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        if (index == 0) {
            return this.shift();
        }
        if (index == this.length - 1) {
            return this.pop();
        }
        SinglyNode<T> prev = this.get(index - 1);
        SinglyNode<T> removed = prev.getNext();
        prev.setNext(removed.getNext());
        this.length--;
        return removed;
    }

    // inserts a new singlyNode at the specified index and returns the list
    public SinglyLinkedList<T> insert(int index, T value) {
        if (index < 0 || index > this.length) {
            return this;
        }
        if (index == this.length) {
            return this.push(value);
        }
        if (index == 0) {
            return this.unshift(value);
        }
        SinglyNode<T> newSinglyNode = new SinglyNode<T>(value);
        SinglyNode<T> prev = this.get(index - 1);
        SinglyNode<T> temp = prev.getNext();
        prev.setNext(newSinglyNode);
        newSinglyNode.setNext(temp);
        this.length++;
        return this;
    }

    // set a new value to a specified singlyNode by index
    public SinglyNode<T> set(int index, T value) {
        SinglyNode<T> foundSinglyNode = this.get(index);
        if (foundSinglyNode != null) {
            foundSinglyNode.setValue(value);
            return foundSinglyNode;
        }
        return null;
    }

    // returns the singlyNode at the specified index
    public SinglyNode<T> get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        int counter = 0;
        SinglyNode<T> current = this.head;
        while (counter != index) {
            current = current.getNext();
            counter++;
        }
        return current;
    }

    // adds a new singlyNode to the beginning of the list and returns the list
    public SinglyLinkedList<T> unshift(T val) {
        SinglyNode<T> newSinglyNode = new SinglyNode<T>(val);
        if (this.head == null) {
            this.head = newSinglyNode;
            this.tail = newSinglyNode;
        } else {
            newSinglyNode.setNext(this.head);
            this.head = newSinglyNode;
        }
        this.length++;
        return this;
    }

    // removes the first singlyNode in the list and returns it
    public SinglyNode<T> shift() {
        if (this.head == null) {
            return null;
        }
        SinglyNode<T> currentHead = this.head;
        this.head = currentHead.getNext();
        this.length--;
        if (this.length == 0) {
            this.tail = null;
        }
        return currentHead;
    }

    // adds a new singlyNode to the end of the list and returns the list
    public SinglyLinkedList<T> push(T val) {
        SinglyNode<T> newSinglyNode = new SinglyNode<T>(val);
        if (this.head == null) {
            this.head = newSinglyNode;
            this.tail = newSinglyNode;
        } else {
            this.tail.setNext(newSinglyNode);
            this.tail = newSinglyNode;
        }
        this.length++;
        return this;
    }

    // removes the last singlyNode in the list and returns it
    public SinglyNode<T> pop() {
        if (this.head == null) {
            return null;
        }
        SinglyNode<T> current = this.head;
        SinglyNode<T> newTail = current;
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
            SinglyNode<T> current = this.head;
            String list = "";
            while (current != null) {
                list += current.getValue() + " -> ";
                current = current.getNext();
            }
            return list;
        }
    }

    public SinglyNode<T> getHead() {
        return this.head;
    }

    public SinglyNode<T> getTail() {
        return this.tail;
    }

    public int getLength() {
        return this.length;
    }

}
