package montalvo.dsa.dataStructures.linkedLists.doubly;

public class DoublyLinkedList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // removes a doublyNode at the specified index and returns it
    public DoublyNode<T> remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        if (index == 0) {
            return this.shift();
        }
        if (index == this.length - 1) {
            return this.pop();
        }
        DoublyNode<T> removedNode = this.get(index);
        DoublyNode<T> beforeNode = removedNode.getPrev();
        DoublyNode<T> afterNode = removedNode.getNext();
        beforeNode.setNext(afterNode);
        afterNode.setPrev(beforeNode);
        removedNode.setNext(null);
        removedNode.setPrev(null);
        this.length--;
        return removedNode;
    }

    // inserts a new doublyNode at the specified index and returns the list
    public DoublyLinkedList<T> insert(int index, T value) {
        if (index < 0 || index > this.length) {
            return this;
        }
        if (index == this.length) {
            return this.push(value);
        }
        if (index == 0) {
            return this.unshift(value);
        }
        DoublyNode<T> newDoublyNode = new DoublyNode<T>(value);
        DoublyNode<T> beforeNode = this.get(index - 1);
        DoublyNode<T> afterNode = beforeNode.getNext();
        beforeNode.setNext(newDoublyNode);
        newDoublyNode.setPrev(beforeNode);
        newDoublyNode.setNext(afterNode);
        afterNode.setPrev(newDoublyNode);
        this.length++;
        return this;
    }

    // set a new value to a specified doublyNode by index
    public DoublyNode<T> set(int index, T value) {
        DoublyNode<T> foundDoublyNode = this.get(index);
        if (foundDoublyNode != null) {
            foundDoublyNode.setValue(value);
            return foundDoublyNode;
        }
        return null;
    }

    // returns the doublyNode at the specified index
    public DoublyNode<T> get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        if (index <= this.length / 2) {
            System.out.println("Traversing from the beginning");
            int leftCount = 0;
            DoublyNode<T> leftCurrent = this.head;
            while (leftCount != index) {
                leftCurrent = leftCurrent.getNext();
                leftCount++;
            }
            return leftCurrent;
        } else {
            System.out.println("Traversing from the end");
            int rightCount = this.length - 1;
            DoublyNode<T> rightCurrent = this.tail;
            while (rightCount != index) {
                rightCurrent = rightCurrent.getPrev();
                rightCount--;
            }
            return rightCurrent;
        }
    }

    // adds a new doublyNode to the beginning of the list and returns the list
    public DoublyLinkedList<T> unshift(T val) {
        DoublyNode<T> newNode = new DoublyNode<T>(val);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.setPrev(newNode);
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.length++;
        return this;
    }

    // removes the first doublyNode in the list and returns it
    public DoublyNode<T> shift() {
        if (this.head == null) {
            return null;
        }
        DoublyNode<T> oldHead = this.head;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = oldHead.getNext();
            this.head.setPrev(null);
            oldHead.setNext(null);
        }
        this.length--;
        return oldHead;
    }

    // removes the last doublyNode in the list and returns it
    public DoublyNode<T> pop() {
        if (this.head == null) {
            return null;
        }
        DoublyNode<T> poppedNode = this.tail;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = poppedNode.getPrev();
            this.tail.setNext(null);
            poppedNode.setPrev(null);
        }
        this.length--;
        return poppedNode;
    }

    // adds a new node to the end of the list and returns the list
    public DoublyLinkedList<T> push(T val) {
        DoublyNode<T> newNode = new DoublyNode<T>(val);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }
        this.length++;
        return this;
    }

    // returns true if list is empty
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "List is empty";
        } else {
            DoublyNode<T> current = this.head;
            String list = "<- ";
            while (current != null) {
                DoublyNode<T> tempNext = current.getNext();
                if (tempNext == null) {
                    list += current.getValue() + " -> ";
                } else {
                    list += current.getValue() + " <--> ";
                }
                current = tempNext;
            }
            return list;
        }
    }

    public DoublyNode<T> getHead() {
        return this.head;
    }

    public DoublyNode<T> getTail() {
        return this.tail;
    }

    public int getLength() {
        return this.length;
    }

}
