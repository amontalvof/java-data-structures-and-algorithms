package montalvo.dsa.dataStructures.stacks;

public class Stack<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public Stack() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    // adds a new Node to the beginning of the list and returns the list
    public Stack<T> push(T val) {
        Node<T> newNode = new Node<T>(val);
        if (this.first == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            Node<T> temp = this.first;
            this.first = newNode;
            this.first.setNext(temp);
        }
        this.size++;
        return this;
    }

    // removes the first Node in the list and returns his value
    public T pop() {
        if (this.first == null) {
            return null;
        }
        Node<T> temp = this.first;
        if (this.first == this.last) {
            this.last = null;
        }
        this.first = this.first.getNext();
        this.size--;
        return temp.getValue();
    }

    // returns true if list is empty
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Stack is empty";
        } else {
            Node<T> current = this.first;
            String list = "[ ";
            while (current != null) {
                Node<T> next = current.getNext();
                if (next == null) {
                    list += current.getValue();
                } else {
                    list += current.getValue() + " , ";
                }
                current = current.getNext();
            }
            list += " ]";
            return list;
        }
    }

    public Node<T> getFirst() {
        return this.first;
    }

    public Node<T> getLast() {
        return this.last;
    }

    public int getSize() {
        return this.size;
    }

}
